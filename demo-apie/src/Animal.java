public class Animal { // more abstract -> Parent Class
  // Cat.java, Dog.java -> Child Class

  // common attributes for Cat, Dog
  private String name;
  private Cat cat;

  // Constructor cannot be inheirted
  public Animal(String name) {
    this.name = name;
  }

  public Animal(String name, Cat cat) {
    this.cat = cat;
    this.name = name;
  }

  // method (can be inherited)
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Cat getCat() {
    return this.cat;
  }

  public void sound() {
    System.out.println("default sound.....");
  }

  public static void main(String[] args) {
    Animal a1 = new Animal("John");
    System.out.println(a1.getName()); // John
    a1.setName("Sally");
    System.out.println(a1.getName()); // Sally

    Cat c1 = new Cat("Peter", 20);
    System.out.println(c1.getName()); // Peter
    c1.setAge(18);
    System.out.println(c1.getAge()); // 18

    Dog d1 = new Dog("Oscar");
    System.out.println(d1.getName()); // Oscar
    d1.setName("Tommy");
    System.out.println(d1.getName()); // Tommy

    Animal a2 = new Animal("Vincent", new Cat("Steven", 2));
    a2.getCat().getName();

    Cat c2 = new Cat("Steven", 2);
    Animal a3 = new Animal("Vincent", c2);
    a3.getCat().getName();
    c2.getName();

    
  }

}
