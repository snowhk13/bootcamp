import java.util.Objects;

public class Cat extends Animal {

  private String name;



  public Cat(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int compareTo(Cat cat) {
    if (this.name.length() == cat.getName().length()) {
      return 0;
    }
    return this.name.length() > cat.getName().length() ? 1 : -1;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Cat)) {
      return false;
    }
    Cat cat = (Cat) obj;

    return this.name.equals(cat.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

  @Override
  public String toString(){
    return "Cat("
    +"name="
    +this.name
    +")"
    ;
  }

  public static void main(String[] args) {

  }

}
