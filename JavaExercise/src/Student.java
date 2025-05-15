import java.util.Objects;

public class Student {
  private int ID;


  private String Name;



  public Student(int id, String name) {
    this.ID = id;
    this.Name = name;
  }
  @Override
  public String toString() {
    return "Student" + "(ID=" + this.ID + ",Name=" + this.Name + ")";
  }

@Override
 public boolean equals(Object obj){
  if(this == obj){
    return true;
  }
  if(!(obj instanceof Student)){
    return false;
  }
  Student student = (Student) obj;
  return this.ID == student.getID();
 }

 @Override
 public int hashCode(){
  return Objects.hash(this.ID);
 }

  public String getName() {
    return Name;
  }

  public int getID() {
    return ID;
  }

  public static void main(String[] args) {
    Student s1 = new Student(1, "sss");
    s1.hashCode();
  }
}
