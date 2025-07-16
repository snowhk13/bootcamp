import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise {
  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]

    List<Integer> result1 = numbers.stream().filter(n-> n % 2 ==0).map(n->n*n).collect(Collectors.toList());
    Comparator<Integer> sort1 = (n1,n2) -> n1 > n2 ? -1:1;
    Collections.sort(result1,sort1);
    System.out.println(result1);

    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // // Output: [Alice, Annie, Alex]
    List<String> result2  = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
    System.out.println(result2);

    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(10, 20, 5, 30, 15);
    // Output: Max: 30
    // Output: Min: 5
    Integer maxNum1 = numbers2.stream().max((n1,n2)-> n1 < n2 ? -1:1).get();
    Integer minNum1 = numbers2.stream().max((n1,n2)-> n1 > n2 ? -1:1).get();
    System.out.println(maxNum1);
    System.out.println(minNum1);

    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
   List<Integer> result4 =  words.stream().map(w->w.length()).collect(Collectors.toList());
   System.out.println(result4);
    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    // List<String> words = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
       List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");

    Long result5  =  words2.stream().filter(w->w.length()>3).collect(Collectors.counting());
    System.out.println(result5);
   
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // // Output: [15, 20]
  Set<Integer> result6  = numbers3.stream().filter(n->n>10).collect(Collectors.toSet());
  
  System.out.println(result6);
    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)
    // Output: {Alice=85, Bob=75}

    Student s1 = new Student("Alice", 85);
    Student s2 = new Student("Bob", 75);
    List<Student> students7 = new ArrayList(Arrays.asList(s1,s2));
 Map<String,Integer> map7;
 map7 = students7.stream().collect(Collectors.toMap(s->s.getName(),s->s.getScore()));

 System.out.println(map7);
 

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)

    // Output: [John, Jane]
    Employee e1 = new Employee("John", 65000);
    Employee e2 = new Employee("Jane", 55000);
    Employee e3 = new Employee("Doe",40000);
    List<Employee> employees = new ArrayList<>(List.of(e1,e2,e3));
   List<String> result8 = employees.stream().filter(e->e.getSalary() < 50000).map(e->e.getName()).collect(Collectors.toList());
   System.out.println(result8);

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
Person p1 = new Person("Alice", 30);
Person p2 = new Person("Bob",25);
Person p3 = new Person("Charlie",30);
List<Person> persons = new ArrayList<>(List.of(p1,p2,p3));
Map<Integer,List<String>> map9;
map9 = persons.stream().collect(Collectors.groupingBy(p->p.getAge(),Collectors.mapping(p->p.getName(),Collectors.toList())));
System.out.println(map9);

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)

    Staff staff1 = new Staff("Alice", Gender.Female);
    Staff staff2 = new Staff("Bob", Gender.Male);
    Staff staff3 = new Staff("Charlie", Gender.Male);

    List<Staff> staffs = new ArrayList<>(List.of(staff1,staff2,staff3));
     Map<Boolean,List<Staff>> map10;
  map10 = staffs.stream().collect(Collectors.partitioningBy(s->s.getGender().equals(Gender.Female)));

  System.out.println(map10);

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);

    List<Integer> result11 = numbers4.stream().filter(n-> n < 10).map(n->n*2).collect(Collectors.toList());

    System.out.println(result11);

    // Output: [30, 40, 60]

    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;

   List<Person> result12 =  names12.stream().map(n->new Person(n,defaultAge)).collect(Collectors.toList());

   System.out.println(result12);
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    Deque<String> result13 = new LinkedList<>();
    
    List<String> words13 = Arrays.asList("hello", "world", "java");

    words13.stream().map(w->w.toUpperCase()).forEach(w->result13.add(w));

    System.out.println(result13);
    // Output: [HELLO, WORLD, JAVA] (Deque)

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
   int[] result14 =  numbers14.stream().map(n->Math.pow(n,2)).mapToInt(n->(int)Math.round(n)).toArray();
   System.out.println(Arrays.toString(result14));
    // Output: [1, 4, 9, 16]

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)
Product product1 = new Product("Book", 10);
Product product2 = new Product("Pen", 5);
Product product3 = new Product("Notebook", 7);

List<Product> products = new ArrayList<>(List.of(product1,product2,product3));
Integer result15 = products.stream().map(p->p.getPrice()).collect(Collectors.summingInt(n->n));
System.out.println(result15);
    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    Worker w1 = new Worker("Alice", "HR");
    Worker w2 = new Worker("Bob", "IT");
    Worker w3 = new Worker("Charlie", "HR");
    Worker w4 = new Worker("David", "IT");

    List<Worker> workers = new ArrayList<>(List.of(w1,w2,w3,w4));
   Map<String,List<String>> result16 = workers.stream()
   .collect(Collectors.groupingBy(w->w.getDepartment(),Collectors.mapping(w->w.getName(),Collectors.toList())));

   System.out.println(result16);

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}

    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
int result17 = numbers5.stream().mapToInt(n->n).sum();

System.out.println(result17);
    // Output: 55


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );

  List<Integer> result18 =  listOfIntegers.stream().flatMap(l->l.stream()).filter(n->n>5).collect(Collectors.toList());

  System.out.println(result18);
 
    // Output: [6, 7, 8, 9]

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
   List<String> result19 =  fruits.stream().distinct().collect(Collectors.toList());

   System.out.println(result19);
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

    Children c1 = new Children("Alice", 45);
    Children c2 = new Children("Bob", 55);
    Children c3 = new Children("Charlie", 40);
    Children c4 = new Children("David", 70);

    List<Children> childrens = new ArrayList<>(List.of(c1,c2,c3,c4));
   Map<Boolean,List<String>> result20 = childrens.stream().collect(Collectors.partitioningBy(c->c.getScore() >= 50,
   Collectors.mapping(c->c.getName(), Collectors.toList())));
    System.out.println("!!!!!");
   for(Map.Entry<Boolean,List<String>> entry: result20.entrySet()){
    System.out.println(entry.getValue());
   }
   System.out.println("!!!!!");

  //  System.out.println(result20);
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
     // Output: "Java, Python, Rust, R, Go"
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
   
  String result21 = languages.stream().collect(Collectors.joining(","));

  System.out.println(result21);

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    
  Integer result22 =  ages.stream().filter(a->a%3==0).findFirst().get();

  System.out.println(result22);
    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  List<Integer> result23 =  elements.stream().skip(3).limit(5).collect(Collectors.toList());

  System.out.println(result23);
    // Output: [4, 5, 6, 7, 8]
    
    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);

  List<Integer> result24 = amounts.stream().map(n->n*2).peek(n->System.out.print(n+",")).collect(Collectors.toList());
  System.out.println("");
  System.out.println(result24);

    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
  Optional<String> result25 =  animals.stream().filter(a->a.length()>4).findFirst();
  System.out.println(result25);
    // Output: Optional[tiger]

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional.empty

    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
  Set<Integer> result26 =  duplicates.stream().distinct().collect(Collectors.toSet());
  System.out.println(result26);
    // Output: [1, 2, 3, 4, 5, 6] (Set)

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");

  Long result27 =  keywords.stream().map(k->k.length()).collect(Collectors.summarizingInt(n->n)).getSum();

  System.out.println(result27);
    // Output: 28
  }

     // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)

    public static class Student{
      private String name;
      private int score;
      public Student(String name,int score){
        this.name = name;
        this.score = score;
      }
      public String getName(){
        return this.name;
      }
      public int getScore(){
        return this.score;
      }
    }

    public static class Employee{
      private String name;
      private int salary;
      public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
      }
      public String getName(){
        return this.name;
      }
      public int getSalary(){
        return this.salary;
      }
    }
    public static class Person{
      private String name;
      private int age;
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
        return "Person("
        +"name="
        +this.name
        +",age="
        +this.age
        +")";
      }
    }
    public static class Staff{
      private String name;
      private Gender gender;

      public Staff(String name,Gender gender){
        this.name = name;
        this.gender = gender;
      }
      public String getName(){
        return this.name;
      }
      public Gender getGender(){
        return this.gender;
      }
      public void setName(String name){
        this.name = name;
      }

      @Override
      public String toString(){
        return "Staff("
        +"name="
        +this.name
        +",gender="
        +this.gender
        +")";
      }

    }
    public static enum Gender{
      Male,
      Female,
      ;
    }

    public static class Product{
      private String name;
      private int price;
      public Product(String name,int price){
        this.name = name;
        this.price = price;
      }
      public String getName(){
        return this.name;
      }
      public int getPrice(){
        return this.price;
      }
    }
    public static class Worker{
      private String name;
      private String department;
      public Worker(String name,String department){
        this.name = name;
        this.department = department;
      }
      public String getName(){
        return this.name;
      }
      public String getDepartment(){
        return this.department;
      }

    }

    public static class Children{
      private String name;
      private int score;
      public Children(String name,int score){
        this.name = name;
        this.score = score;
      }
      public String getName(){
        return this.name;
      }
      public int getScore(){
        return this.score;
      }
    }
}
