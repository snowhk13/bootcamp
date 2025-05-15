import java.util.Objects;

public class Dog extends Animal {
  private int age;

  public Dog(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Dog))
      return false;
    Dog dog = (Dog) obj;
    return this.age == dog.getAge();
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.age);
  }

  public int getAge() {
    return this.age;
  }
}