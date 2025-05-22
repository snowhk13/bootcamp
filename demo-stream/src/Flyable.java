import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
public interface Flyable {
  // ! No Attribute in interface
  static final int SECOND_PER_MINUTE = 60; // implicitly "static final"

  // ! all methods in interface are abstract methods (before Java 8)
  void fly(); // implicitly "abstract"

  // After Java 8: default method -> instance method
  default String drink(String something) {
    return "I am drinking " + something;
  }

  // After Java 8: static method
  static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Flyable.sum(1, 2);

    Cat c1 = new Cat();
    System.out.println(c1.drink("water")); // I am drinking water
    c1.fly(); // Cat is flying

    // Lambda
    Flyable cat = () -> System.out.println("Cat is flying");
    cat.fly(); // Cat is flying
    System.out.println(cat.drink("water")); // I am drinking water

    // Map - Lambda
    Map<String, Child> childMap = new HashMap<>();
    childMap.put("john", new Child("John"));
    childMap.put("peter", new Child("Peter"));

    Child result = childMap.computeIfAbsent("peter", name -> new Child(name));
    System.out.println(result); // Child(name=Peter)

    Child result2 = childMap.computeIfAbsent("sally", name -> new Child(name));
    System.out.println(result2); // Child(name=sally)

    System.out.println(childMap.size());

  }
}
