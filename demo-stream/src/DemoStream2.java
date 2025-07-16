import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import DemoStream.Staff;



public class DemoStream2 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList("John","Peter","Jenny"));
   
    names.forEach(name -> System.out.println(name));

    names.forEach(name -> {
      if(name.startsWith("J")){
        System.out.println(name);
      }
    });

    names.stream()
    .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length() == 5)
    .forEach(name -> System.out.println(name));

    List<Child> childs = names.stream()
    .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length()==5)
    .map(name -> new Child(name))
    .collect(Collectors.toList());

    System.out.println(childs);

    List<Integer> numbers = new ArrayList<>(List.of(2,4,7,-1,100));

    List<Integer> newNumber = numbers.stream()
    .filter(num -> num % 2 == 0 && num > 6)
    .map(num -> (int)Math.pow(num,2))
    .collect(Collectors.toList());

    System.out.println(newNumber);

    List<Integer> newNumber2 = numbers.stream()
    .map(num -> {
      if(num % 2 ==0){
        return num*num;
      }
      return num;
    })
    .collect(Collectors.toList());

    System.out.println(newNumber2);
    Optional<String> findname = names.stream()
    .filter(n -> n.startsWith("A") && n.length() == 5)
    .findFirst();

    if(findname.isPresent()){
      System.out.println(findname.get());
    }else if(findname.isEmpty()){
      System.out.println("is empty");
    }

    Comparator<String> sortedByDescending = (s1,s2) -> s1.compareTo(s2) > 0 ? 1 : -1;
    names.stream()
    .sorted(sortedByDescending)
    .forEach(n -> System.out.println(n));

    // 8, 9, 2, -5, 100, 10000, -300, 11
    // filter odd number -> square -> value > 80 -> sorted -> print out

    List<Integer> numberList = new ArrayList<>(Arrays.asList(8,9,2,-5,100,10000,-300,11));

    List<Integer> newnumberList = numberList.stream()
    .filter(num -> num % 2 == 1)
    .map(num -> num*num)
    .filter(num -> num > 80)
    .sorted()
    .collect(Collectors.toList());

    System.out.println(newnumberList);

    // default RED color
    // List<Integer> -> 8, 9, 4, 1
    // Descending order
    // List<Ball>

    List<Integer> numbers2 = new ArrayList<>(List.of(8,9,4,1));
    Comparator<Integer> sort1 = (n1,n2) -> n1.compareTo(n2) > 0 ? -1 : 1 ;
    Ball.Color color = Ball.Color.BLUE;
    

        List<Staff> staffs =
        new ArrayList<>(List.of(new Staff("IT", 35000), new Staff("HR", 18000),
        new Staff("IT", 25000), new Staff("HR", 28000)));

        Map<String,List<Staff>> staffMap1 = 
        staffs.stream()
        .collect(Collectors.groupingBy(s -> s.getDepartment(),Collectors.toList()));

        System.out.println(staffMap1);

        Map<String,Integer> staffMap2 =
        staffs.stream()
        .collect(Collectors.groupingBy(s ->s.getDepartment(),Collectors.summingInt(s -> s.getSalary())));

        System.out.println(staffMap2);

         Map<String,List<String>> staffMap3 =
         staffs.stream()
        .collect(Collectors.groupingBy(s ->s.getDepartment(),Collectors.mapping(s -> s.getDepartment() , Collectors.toList())));

        System.out.println(staffMap3);

              Map<String,List<String>> staffMap4 =
         staffs.stream()
        .collect(Collectors.groupingBy(s ->s.getDepartment(),Collectors.joining));



    

 
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
