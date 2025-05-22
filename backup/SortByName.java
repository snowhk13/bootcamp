import java.util.Comparator;

public static class SortByName implements Comparator<Student>  {
  @Override
  public int  compare(Student s1 , Student s2){
    return s1.getName().charAt(0) < s2.getName().charAt(0) ? -1 : 1;
  }
}
