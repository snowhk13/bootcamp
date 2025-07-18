import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Comparator<Integer> sortnums1 = (n1, n2) -> n1.compareTo(n2) > 0 ? -1 : 1;
    numbers = numbers.stream().filter(num -> num % 2 == 0).map(num -> num * num)
        .sorted(sortnums1).collect(Collectors.toList());

    System.out.println(numbers);
    // Output: [100, 64, 36, 16, 4]

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // // Output: [Alice, Annie, Alex]

    names = names.stream().filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());

    System.out.println(names);

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5

    int max = Integer.MIN_VALUE;

    max = numbers2.stream().max((n1, n2) -> n1.compareTo(n2)).get();

    int min = Integer.MAX_VALUE;

    min = numbers2.stream().min((n1, n2) -> n1.compareTo(n2)).get();


    System.out.println("Max: " + max);
    System.out.println("Min: " + min);

    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)

    List<Integer> wordsLength =
        words.stream().map(word -> word.length()).collect(Collectors.toList());

    System.out.println(wordsLength);

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words2 =
        Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    int countnum = words2.stream().mapToInt(word -> {
      int count = 0;
      if (word.length() > 3) {
        count++;
      }
      return count;
    }).sum();

    System.out.println(countnum);

    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]

    Comparator<Integer> sortnums2 = (n1, n2) -> n1.compareTo(n2) > 0 ? 1 : -1;

    Set<Integer> newSet;
    newSet =
        numbers3.stream().filter(num -> num > 10).collect(Collectors.toSet());

    System.out.println(newSet);



    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    // Output: {Alice=85, Bob=75}

    List<Student> students = new ArrayList<>(
        List.of(new Student("Alice", 85), new Student("Bob", 75)));

    Map<String, Integer> scoreMap = students.stream()
        .collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));

    System.out.println(scoreMap);

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]

    List<Employee> elist = new ArrayList<>
    (List.of(new Employee("John",65000),new Employee("Jane", 55000),new Employee("Doe", 40000)));

   List<String> newlist =  elist.stream().filter(s -> s.getSalary() > 50000)
    .map(s -> s.getName())
    .collect(Collectors.toList());

    System.out.println(newlist);

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)
    Comparator<Person> sortPerson = (p1,p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    List<Person> persons = new ArrayList<>(Arrays.asList(new Person("Alice",30),new Person("Bob",25),new Person("Charlie",30)));
    Collections.sort(persons,sortPerson);
    System.out.println(persons);


    Map<Integer,List<String>> mapPerson = persons.stream()
    .collect(Collectors.groupingBy(p -> p.getAge(),() -> new LinkedHashMap<>(),Collectors.mapping(p->p.getName(),Collectors.toList())));
    
    System.out.println(mapPerson);
    




    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    List<Staff> staffs = new ArrayList<>(Arrays.asList(new Staff("Alice", Gender.Female),new Staff("Bob", Gender.Male),new Staff("Charlie", Gender.Male)));

    Map<Boolean,List<Staff>> mapStaff1 = 
    staffs.stream()
    .collect(Collectors.partitioningBy(s -> s.getGender().equals(Gender.Male)));

    System.out.println(mapStaff1);

     

    

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);

    List<Integer> newnumlist4 = numbers4.stream()
    .filter(n -> n > 10)
    .map(n -> n * 2)
    .collect(Collectors.toList());

    System.out.println(newnumlist4);
    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    // List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    // int defaultAge = 30;
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;

    List<Person> persons2 = names1.stream()
    .map(n -> new Person(n,defaultAge))
    .collect(Collectors.toList());

    System.out.println(persons2);

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    // List<String> words = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)

    List<String> words1 = Arrays.asList("hello", "world", "java");

    
    Deque<String> wordDeque1 = words1.stream()
    .map(w -> w.toUpperCase())
    .collect(Collectors.toCollection(()-> new LinkedList<>()));

    System.out.println(wordDeque1);

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    // List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4);

    numbers6 = numbers6.stream()
    .map(n -> n * n)
    .collect(Collectors.toList());

    System.out.println(numbers6);

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)

    // Output: 22

    List<Product> products = new ArrayList<>(Arrays.asList(new Product("Book", 10),new Product("Pen", 5),new Product("Notebook", 7)));

    int totalprice = products.stream()
    .collect(Collectors.summingInt(p -> p.getPrice()));

    System.out.println(totalprice);


    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    List<Worker> workers = new ArrayList<>(Arrays.asList(new Worker("Alice", "HR"),new Worker("Bob", "IT"),new Worker("Charlie", "HR"), new Worker("David", "IT")));
    Map<String,List<String>> mapworker = 
    workers.stream()
    .collect(Collectors.groupingBy(w ->w.getDepartment(),Collectors.mapping(w -> w.getName(),Collectors.toList())));

    System.out.println(mapworker);
    



    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int sumNum = numbers5.stream()
    .collect(Collectors.summingInt(n -> n));

    System.out.println(sumNum);

    // Output: 55


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );

    List<Integer> numList1 = listOfIntegers.stream()
    .flatMap(l -> l.stream())
    .filter(n -> n>5)
    .collect(Collectors.toList());

    System.out.println(numList1);
    // Output: [6, 7, 8, 9]

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits =
        Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");

        fruits = fruits.stream().
        distinct().collect(Collectors.toList());

        System.out.println(fruits);
    // Output: [apple, banana, grape, orange]

    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.

    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)

    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    List<Children> childrens = new ArrayList<>(Arrays.asList(new Children("Alice", 45),new Children("Bob", 55),new Children("Charlie", 40),new Children("David", 70)));
    
    Map<Boolean,List<String>> childmap = childrens.stream()
    .collect(Collectors.partitioningBy(c -> c.getScore() >= 50 , Collectors.mapping(c -> c.getName(),Collectors.toList())));

    System.out.println(childmap);

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.

    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
   
    String[] sarr = new String[1];
    int[] narr = new int[1];
    sarr[0] = ""; 
    narr[0] = 0;
    languages.stream()
    .forEach(n -> {
      if(narr[0] < languages.size()-1){
      sarr[0]= sarr[0]+n+",";
      narr[0]++;
      }else{
        sarr[0]= sarr[0]+n;
      }
   
    });

    System.out.println(sarr[0]);
    

    

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);

    // Output: 9

    Optional<Integer> findfirstnum = ages.stream()
    .filter(n -> n % 3 ==0)
    .findFirst();

    System.out.println(findfirstnum.get());

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.

  
    // Output: [4, 5, 6, 7, 8]
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    elements = elements.stream()
    .skip(3)
    .collect(Collectors.toList());

    System.out.println(elements);
    

    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.

    
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]
   List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    amounts = amounts.stream()
    .map(n -> n*2)
    .peek(n ->System.out.print(n+","))
    .collect(Collectors.toList());

    System.out.println("");
    System.out.println(amounts);


    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.

    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]
    Optional<String> findword1 = animals.stream()
    .filter(n -> n.length() > 4)
    .findFirst();

    System.out.println(findword1);

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional.empty
  Optional<String> findword2 = animals2.stream()
    .filter(n -> n.length() > 4)
    .findFirst();

    System.out.println(findword2);
    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates

    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)
    duplicates=
    duplicates.stream()
    .distinct()
    .sorted()
    .collect(Collectors.toList());

    System.out.println(duplicates);

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.

 
    // Output: 28

       List<String> keywords =
        Arrays.asList("stream", "filter", "map", "sorted", "collect");

   int sumNum2 =  keywords.stream()
    .map(n -> {
      return n.length();
    })
    .reduce(0, (n1,n2) -> n1+n2);

    

    System.out.println(sumNum2);



  }

  
 public static class Worker {
  private String name;
  private String department;

  public Worker(String name, String department){
    this.name = name;
    this.department = department;
    }

  public String getName() {
    return name;
  }
  public String getDepartment() {
    return department;
  }

 }

   public static class Children {
    private String name;
    private int score;

    public Children(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return name;
    }

    public int getScore() {
      return score;
    }
  }


  public static class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return name;
    }

    public int getScore() {
      return score;
    }
  }

  public static class Employee{
   private String name;
   private int salary;

   public Employee(String name,int salary){
    this.name = name;
    this.salary = salary;
   }
     public String getName() {
    return this.name;
  }

   public int getSalary() {
     return this.salary;
   }
   
  }

  public static class Person{
    String name;
    int age;

    public Person(String name,int age){
      this.name = name;
      this.age = age;
    }

    public String getName(){
      return this.name;
    }

    public int getAge(){
      return this.age;
    }

    @Override
    public String toString(){
      return "Person(name="
      +this.name +",age="
      +this.age +")";
    }
  }

  public static class Staff{
    private String name;
    private Gender gender;


    public Staff(String name,Gender gender){
      this.name = name;
      this.gender = gender;
    }

    public String getName() {
      return name;
    }

    public Gender getGender() {
      return gender;
    }

        @Override
    public String toString(){
      return 
      this.name;
    }
    
  }
  public static enum Gender{
    Female,Male,;
  }

  public static class Product{
    private String name;
    private int price;

  

    public Product(String name,int price){
      this.name = name;
      this.price = price;
    }

      public String getName() {
      return name;
    }

    public int getPrice() {
      return price;
    }
  }
}
