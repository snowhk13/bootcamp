public class DemoPolymorphism {
  public static void main(String[] args) {
    // I -> Inheritence (extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/Setter for private variable)

    Animal a1 = new Dog("Peter");
    // Dog d1 = a1; // why error? type unsafe

    // ! Java compile time: Method readability based on the type of "object reference"
    // a1.bark();
    System.out.println(a1.getName()); // Animal.class has getName(), ensures Cat/Dog must contain getName()
    
    // ! Compile-time: Animal has sound(), ensures Cat/Dog has sound() method
    // ! Run-time: Found the object is Dog, so the result "wow wow"
    a1.sound(); // wow wow ...

    // ! how to elimate the risk? we can use instanceof to check the actual type of object
    if (a1 instanceof Dog) {
      Dog d1 = (Dog) a1; // force converison (downcast) - risky
      // d1.bark();
    } else if (a1 instanceof Cat) {
      Cat c1 = (Cat) a1; // force converison (downcast) - risky
    }


    Flyable superman = new Superman("John");
    superman.fly();
    ((Superman)superman).eat();
    // superman.drink();
    // superman.sleep();
    // superman.getName();
    // superman.setSecondName("WWW");
    Account acc1 = new CommericalAccount();
    System.out.println(acc1.balance());
    System.out.println(acc1.getCurrentAccount().getBalance());
    System.out.println(acc1.getSavingAccount().getBalance());

    // SubAccount subacc1 = new SavingAccount();
    // subacc1.credit(1000);
    // System.out.println(subacc1.getBalance());

    Shape shape1 =  new Circle("red", 5);
    Shape shape2 = new Triangle("blue", 2, 2);
    System.out.println(shape1.getColor());
    System.out.println(shape1.area());
    System.out.println(shape2.area());

    System.out.println(((Circle)shape1).getRadius());


    Number number = Long.valueOf(3);
    number = Integer.valueOf(10);
    number = Byte.valueOf("7");
    number = Short.valueOf("8");
    number = Double.valueOf(3.9);
    number = Float.valueOf("8.4");

    long value = number.longValue();
    System.out.println(value);
    double value2 = number.doubleValue();
    System.out.println(value2);
     float f1 = 1.1f;
    double d1 = f1;
    System.out.println(d1);


     

  }
}