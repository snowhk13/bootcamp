import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Child {
  private String name;

  public Child(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // ! Static Nested Class
  public static class Ball {
    private int num;
  }

  // ! Inner Class
  public class Toy {
    private String code;
    @Override
    public String toString() {
      return "Child.Toy("
        + "code=" + this.code
        + ",name=" + name // ! Inner class is able to access Outer Class (Child) attributes
        + ")";
    }
  }

  public static void main(String[] args) {
    Child c1 = new Child("John");
    Child.Ball b1 = new Child.Ball();

    Child c2 = new Child("Peter");
    Child.Toy t1 = c2.new Toy();
    Child.Toy t2 = c2.new Toy();

    System.out.println(t1); // Child.Toy(code=null,name=Peter)
    c2.setName("Annie");
    System.out.println(t1); // Child.Toy(code=null,name=Annie)

    // t1 c2
    Map<Child, List<Toy>> map = new HashMap<>();
  }
}