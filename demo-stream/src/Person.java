// Java 16: Record (History -> cannot be modified and no status change)
// ! No Setter
// ! Getter
// ! All args Constructor
// ! equals(), hashCode(), toString()
public record Person(String name, int age) { 
  public static final int VALUE = 360; // OK to place static variable

  // ! NOT ALLOWED to add other attributes
  // private String email;

  // ! You can still use "this" for writing your own methods
  public String getInfo() {
    return this.name + "," + this.age;
  }

  // static method OK
  public static int sum(int x, int y) {
    return x + y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Person))
      return false;
    Person p1 = (Person) obj;
    return this.name.equals(p1.name());
  }

}