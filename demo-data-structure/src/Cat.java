import java.time.LocalDate;
import java.util.Objects;

public class Cat extends Animal {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public Cat(String name, LocalDate dob) {
    super(dob);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  // ! Method Signature (Override): Return type + Method Name + Arguments -> "int compareTo(Cat cat)"
  // ! Method Signature (Polymorphism): Method Name + Arguments -> "compareTo(Cat cat)"
  public int compareTo(Cat cat) {
    if (this.name.length() == cat.getName().length()) {
      return 0;
    }
    return this.name.length() > cat.getName().length() ? 1 : -1;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
    return this.name.equals(cat.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }

  @Override
  public String toString() {
    return "Cat(" //
        + "name=" + this.name //
        + ",dob=" + super.getDob() //
        + ")";
  }

  // toString(), hashCode()

  public static void main(String[] args) {
    Cat c1 = new Cat("John");
    Cat c2 = new Cat("Peter");
    System.out.println(c2.compareTo(c1)); // 1
    System.out.println(c1.compareTo(c2)); // -1
    
  }
}