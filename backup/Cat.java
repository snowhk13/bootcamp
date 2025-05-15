public class Cat  extends Animal{

  // private String name;
  // private int age;

  public Cat(String name, int age) {
    //super (parent)
    super(name,age);
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean equals(Cat cat) {
    return this.name.equals(cat.getName()) && this.age == cat.getAge();
  }

  public String toString() {
    return "Cat(" + "name=" + this.name + ",age=" + this.age + ")";
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("Amy", 3);
    Cat c2 = new Cat("Amy", 3);
    Cat c3 = new Cat("MIKE", 3);

    System.out.println(c1.toString());
    System.out.println(c1.equals(c2)); // true
    System.out.println(c1 == c2);// false
  }

}
