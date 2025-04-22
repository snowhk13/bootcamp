import java.math.BigDecimal;
import java.time.LocalDate;

public class Week2Recap {
  private int age;
  private String name;

  // getter
  public int getAge() {
    return this.age;
  }

  // setter
  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isSuperman() {
    if (this.age >= 30 && name.equals("Vincent"))
      return true;
    return false;
  }

  // compareTo
  public int compareTo(Week2Recap week2Recap) {
    if (this.age == week2Recap.getAge()) {
      return 0;
    } else if (this.age > week2Recap.getAge()) {
      return 1;
    } else {
      return -1;
    }
  }

  // w1.isOlderThan(xxx)
  public boolean isOlderThan(Week2Recap week2Recap) {
    return this.age > week2Recap.getAge();
  }

  // method name -> Presentation
  public boolean isElderly() {
    return this.age >= 65;
  }

  public static void main(String[] args) {
    // 8 Primitives, String
    // BigDecimal
    // LocalDate

    // Store a set of same type of values -> array
    LocalDate[] dates = new LocalDate[3];
    BigDecimal[] numbers = new BigDecimal[4];

    // Wrapper Class
    // Integer, Short, Long, Byte
    // Double, Float
    // Character
    // Boolean
    // autobox (from primitive to Wrapper), unbox (from Wrapper Class to Primitive)

    // Primitives - Upcast, Downcast
    // byte -> short -> int -> long -> float -> double
    // char -> int
    int k = 3;
    long x = k; // upcast

    // During compile time, "unsafe" on type conversion -> Explicit Conversion
    // During runtime, JVM find 4L is safe for this conversion
    int h = (int) 4L;

    // overflow
    byte b = (byte) 138L;
    System.out.println(b); // -118

    // Math (pow, round, sqrt, max, min)
    // BigDecimal (add, subtract, multiply, divide)

    // String
    String s1 = "hello"; // Assign the object address of "hello" object into s1.

    // When you use "new" to create object, Java always create a new one for you.
    String s2 = new String("hello");

    // When you use doule quote to create String object, Java checks if the "hello" object exits
    // So, in this case, Java assign the same object address of s1 into s3.
    String s3 = "hello";

    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3)); // true

    System.out.println(s1 == s2); // false, "==" checks if they are with same object address
    System.out.println(s2 == s3); // false
    System.out.println(s1 == s3); // true

    // The above theory applies to all Objects
    BigDecimal bd1 = BigDecimal.valueOf(3);
    BigDecimal bd2 = BigDecimal.valueOf(3);
    System.out.println(bd1 == bd2); // true

    BigDecimal bd3 = new BigDecimal("3");
    System.out.println(bd1 == bd3); // false

    BigDecimal johnSalary = BigDecimal.valueOf(21000);
    BigDecimal marySalary = BigDecimal.valueOf(21000);

    // ! Object methods always check the value itself
    // Primitives always use "==" to check if they are with same value
    if (johnSalary.compareTo(marySalary) == 0) { // if they are having same salary
      System.out.println("they are having same salary.");
    }

    // LocalDate (try yourself)
    // equals, compareTo
    System.out
        .println(LocalDate.of(2024, 1, 1).compareTo(LocalDate.of(2024, 1, 1))); // 0
    System.out
        .println(BigDecimal.valueOf(4.4).compareTo(BigDecimal.valueOf(4.4))); // 0
    System.out.println(Integer.valueOf(3).compareTo(Integer.valueOf(3))); // 0
    System.out.println(String.valueOf("abc").compareTo(String.valueOf("abc"))); // 0

    Week2Recap w1 = new Week2Recap();
    w1.setAge(12);
    Week2Recap w2 = new Week2Recap();
    w2.setAge(14);
    System.out.println(w1 == w2); // false
    System.out.println(w1.getAge() == w2.getAge()); // false

    System.out.println(w1.compareTo(w2)); // -1
    System.out.println(w1.isOlderThan(w2)); // false

    if (w1.isOlderThan(w2)) {

    }

    if (w1.isElderly()) {

    }


    if (w1.getAge() >= 65) {

    }

    w1.setName("Vincent");
    w1.setAge(31);
    System.out.println(w1.isSuperman()); // true
    
    w2.setName("Mary");
    System.out.println(w2.isSuperman()); // false
    

    // System.out.println(w1.isOlderThan("hello"));

    Circle c3 = new Circle();
    App a1 = new App();

  }
}
