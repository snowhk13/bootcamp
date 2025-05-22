public class Child implements Walkable {
  private String name;

  public Child(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void walk() {
    System.out.println("I am walking ....");
  }

  @Override
  public String toString() {
    return "Child("
      + "name=" + this.name
      + ")";
  }

  public int play(int x, int y) {
    int a = 10;
    // ! Method Local Inner Class
    class Watch {
      private int x;
      private int y;

      public Watch(int x, int y) {
        this.x = x;
        this.y = y;
      }

      public int sum(int x, int y) {
        return x + y;
      }
    }
    Watch watch = new Watch(x, y);
    return a + watch.sum(x, y);
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
      return "Child.Toy(" + "code=" + this.code + ",name=" + name // ! Inner class is able to access Outer Class (Child) attributes
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

    Walkable child = new Walkable() {
      @Override
      public void walk() {
        System.out.println("I am child and walking ...");
      }
    };
    child.walk();

    Swimable child2 = new Swimable() {
      @Override
      public void swim() {
        System.out.println("i am swimming ...");
      }
    };
    child2.swim();

    // 2014 Java 8
    // Java 8: Lambda Expression
    // ! "Walkable child3" -> child3 only need to implement walk() method
    // ! Because you have only one methed need to be implemented.
    // ! so, "() ->" must present walk() implementation
    Walkable child3 = () -> System.out.println("I am walking ...");
    child3.walk();

    // what if the method implementation has more than 1 line of code ...
    Walkable child4 = () -> {
      System.out.println("I am child.");
      System.out.println("I am walking on the road...");
    };
    child4.walk();

    // ! Because the interface has more than 1 method.
    // that means Lambda cannot support non-functional interface.
    // Living child5 = () -> { };

    

  }
}
