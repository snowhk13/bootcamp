public class Student {
  private String name;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return "Student("
      + "name=" + this.name
      + ")";
  }
}