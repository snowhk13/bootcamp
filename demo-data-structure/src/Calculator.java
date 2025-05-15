import java.time.LocalDate;

public class Calculator {
  // Polymorphism (Static - Compile time)
  // Polymorphism (Dynamic - run time)

  // ! Method Signature (Polymorphism): Method Name + Arguments
  public int sum(int x, int y) {
    return x + y;
  }

  // ! because arguments are different to the first method
  public double sum(double a, double b) {
    return a + b; // int + int -> double
  }

  public static void main(String[] args) {
    // ! Static Polymorphism
    new Calculator().sum(1.3, 1.3); // line 9
    new Calculator().sum(1, 2); // line 5

    String.valueOf(6); // calling "static String valueOf(int i)"
    String.valueOf(6.5); // calling "static String valueOf(double d)"

    // ! Dynamic Polymorphism
    Animal animal = new Cat("John", LocalDate.of(2025, 1, 3));
    animal.getDob(); // OK, because getDob() belongs to Animal.class (Object Reference Type)
    // animal.getName(); // NOT OK
    
    // Runtime -> method Implementation follows Object Type (Cat.class)
    System.out.println(animal.getDob()); // 2025-01-03
  }
}