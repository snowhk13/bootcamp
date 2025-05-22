import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    List<String> names =
        new ArrayList<>(Arrays.asList("John", "Peter", "Jenny"));

    // for loop
    names.forEach(name -> {
      System.out.println(name);
    });

    // print those names starts with J
    names.forEach(n -> {
      if (n.startsWith("J")) {
        System.out.println(n);
      }
    });

    // Java 8 stream
    // ! filter()
    names.stream() //
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5)
        .forEach(name -> System.out.println(name));

    // ! map()
    names.stream() //
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5)
        .map(name -> new Child(name)).forEach(child -> {
          System.out.println(child.getName());
        });

    // ! collect()
    List<Child> childs = names.stream() //
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5)
        .map(name -> new Child(name)).collect(Collectors.toList());

    List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 7, -1, 100));
    // stream -> even and > 6
    // square of the value
    // collect as a list
    Stream<Integer> integers = numbers.stream();

    List<Integer> newNumbers = numbers.stream() //
        .filter(n -> n % 2 == 0 && n > 6) //
        .map(n -> n * n) //
        .collect(Collectors.toList());

        System.out.println(newNumbers);

    List<Integer> newNumbers2 = numbers.stream().map(n -> {
      if (n % 2 == 0) {
        return n * n;
      }
      return n;
    }).collect(Collectors.toList());

    // ! loop + if + break
    // findAny
    // ! Optional is a class, name is Optional object, which may stores null or non-null value
    Optional<String> name =
        names.stream().filter(n -> n.startsWith("J")).findAny();

    if (name.isPresent()) { // true if non-null
      System.out.println("There is a name starts with J: " + name.get());
    } else {
      System.out.println("There is no name starts with J.");
    }
    System.out.println(name); // Optional[John]

    // Ascending ordering
    Comparator<String> sortedByDescending =
        (s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1;
    names.stream() //
        .sorted(sortedByDescending) //
        .forEach(n -> System.out.println(n));

    // 8, 9, 2, -5, 100, 10000, -300, 11
    // filter odd number -> square -> value > 80 -> sorted -> print out
    List<Integer> integers2 =
        new ArrayList<>(Arrays.asList(8, 9, 2, -5, 100, 10000, -300, 11));
    integers2.stream() //
        .filter(integer -> integer % 2 == 1) //
        .map(odd -> odd * odd) //
        .filter(squared -> squared > 80) //
        .sorted() //
        .forEach(value -> System.out.println(value));

    // default RED color
    // List<Integer> -> 8, 9, 4, 1
    // Descending order
    // List<Ball>
    List<Integer> integers3 = new ArrayList<>(Arrays.asList(8, 9, 4, 1));
    Comparator<Integer> descending = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;
    List<Ball> balls = integers3.stream() //
        .sorted(descending) //
        .map(num -> new Ball(Ball.Color.RED, num)) //
        .collect(Collectors.toList());
    System.out.println(balls);

    // List<Double>, radius = 3.5, 4.5, 1.5
    // BigDecimal
    // List<Double> circle area
    List<Double> radiusList = new ArrayList<>(Arrays.asList(3.5, 4.5, 1.5));
    List<Double> areaList = radiusList.stream()
        .map(radius -> BigDecimal.valueOf(radius)
            .multiply(BigDecimal.valueOf(radius))
            .multiply(BigDecimal.valueOf(Math.PI)).doubleValue())
        .collect(Collectors.toList());
    System.out.println(areaList);

    // Counting
    List<String> nameList = new ArrayList<>();
    nameList.add("John");
    nameList.add("John");
    nameList.add("Peter");
    long countJohn = nameList.stream().filter(e -> e.equals("John")).count();
    System.out.println(countJohn); // 2

    // distinct -> return a new list, which contains unique elements
    nameList.add("Mary");
    nameList.add("Peter");
    System.out.println(nameList.stream().distinct().count()); // 3
    System.out
        .println(nameList.stream().distinct().collect(Collectors.toList())); // [John, Peter, Mary]

    // flatMap
    List<Ball> ballList1 = new ArrayList<>(Arrays
        .asList(new Ball(Ball.Color.RED, 1), new Ball(Ball.Color.BLUE, 2)));
    Box box1 = new Box(ballList1);

    List<Ball> ballList2 = new ArrayList<>(Arrays
        .asList(new Ball(Ball.Color.RED, 3), new Ball(Ball.Color.BLUE, 4)));
    Box box2 = new Box(ballList2);

    List<Box> boxList = new ArrayList<>();
    boxList.add(box1);
    boxList.add(box2);

    List<Ball> combinedBallList = boxList.stream()
        .flatMap(box -> box.getBalls().stream()).collect(Collectors.toList());

    System.out.println(combinedBallList);
    // [Ball(color=RED,number=1), Ball(color=BLUE,number=2), Ball(color=RED,number=3),
    // Ball(color=BLUE,number=4)]

    List<Ball> combinedBallList2 = new ArrayList<>();
    for (Box box : boxList) {
      combinedBallList2.addAll(box.getBalls());
    }
    System.out.println(combinedBallList2);

    // Stream: From ArrayList to Map (count, max, min, sum, average)
    List<Staff> staffs =
        new ArrayList<>(List.of(new Staff("IT", 35000), new Staff("HR", 18000),
            new Staff("IT", 25000), new Staff("HR", 28000)));

    Map<String, List<Staff>> departmentMap =
        staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment()));
    System.out.println(departmentMap);

    Map<String, Integer> salaryMap =
        staffs.stream().collect(Collectors.groupingBy(s -> s.getDepartment(),
            Collectors.summingInt(s -> s.getSalary())));
    System.out.println(salaryMap);

    Map<String, Optional<Staff>> salaryMap2 = staffs.stream()
        .collect(Collectors.groupingBy(s -> s.getDepartment(), Collectors
            .maxBy((s1, s2) -> s1.getSalary() > s2.getSalary() ? 1 : -1)));

    Optional<Staff> highestSalaryIT = salaryMap2.get("IT");
    System.out.println(highestSalaryIT.get()); // Staff(department=IT,salary=35000)

    Map<Boolean, List<Staff>> salaryPartition = staffs.stream()
        .collect(Collectors.partitioningBy(s -> s.getSalary() > 20000));

    System.out.println(salaryPartition.get(true));
    System.out.println(salaryPartition.get(false));

    // Array -> ArrayList -> Stream
    String[] strings = new String[] {"abc", "def"};
    long count = Arrays.asList(strings).stream().filter(e -> e.startsWith("a")).count();

    int[] arr = new int[] {3, 6, -1};
    // Arrays.asList(arr) // ! List<int[]>

    // IntStream 
    OptionalDouble average = Arrays.stream(arr).average(); 
    System.out.println(average.getAsDouble());

    OptionalInt maxValue = Arrays.stream(arr).max();
    System.out.println(maxValue.getAsInt()); // 6

    // List<Integer>
    // boxed -> auto-box (int -> Integer)
    List<Integer> resultList = Arrays.stream(arr).boxed().filter(e -> e > 4).collect(Collectors.toList());
    System.out.println(resultList); // [6]
  }

  public static class Staff {
    private String department;
    private int salary;

    public Staff(String department, int salary) {
      this.department = department;
      this.salary = salary;
    }

    public String getDepartment() {
      return this.department;
    }

    public int getSalary() {
      return this.salary;
    }

    @Override
    public String toString() {
      return "Staff(" + "department=" + this.department + ",salary="
          + this.salary + ")";
    }
  }
}
