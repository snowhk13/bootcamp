public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;

  }

  public void displayInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
  }

  public static void main(String[] args) {

    Person per1 = new Person("Tom", 16);
    Person per2 = new Person("Peter", 24);

    per1.displayInfo();
    per2.displayInfo();

  }
}

