// Fly
// Eat
// Class Signature: extends and implements
public class Superman extends Human implements Living, Flyable {
  private String name; // ! Incorrect Design

  public Superman(String name) {
    this.name = name;
  }

  @Override
  public void eat() {
    System.out.println("I am eating ...");
  }

  @Override
  public void drink() {
    System.out.println("I am drinking ...");
  }

  @Override
  public void fly() {
    System.out.println("I am flying ...");
  }

  @Override
  public void sleep() {
    System.out.println("I am sleeping ...");
  }

  @Override
  public String getName() {
    return this.name;
  }

  public void setSecondName(String secondName) {
    super.setName(secondName);
  }

  public String getSecondName() {
    return super.getName();
  }

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.setSecondName("Mary");

    System.out.println(s1.getName()); // John
    System.out.println(s1.getSecondName()); // Mary

    s1.eat();
    s1.fly();
    s1.drink();
    s1.sleep();
  }
}
