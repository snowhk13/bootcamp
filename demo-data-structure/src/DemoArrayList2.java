import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList2 {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Jacky",13));
    persons.add(new Person("Vincent",13));

    List<Person> persons2 = new ArrayList<>(
      Arrays.asList(new Person("Jacky",13),new Person("Vincent",13)));
      // ! Important Note: List.of() does not support the implementation of add(), remove(), etc
      List<Person> persons3 = List.of(new Person("Jacky",13),new Person("Vincent",13));
      System.out.println(persons3);
      // person3.add(new Person("Alex", 3));  java.lang.UnsupportedOperationException
      // person3.remove(1); java.lang.UnsupportedOperationException

      //! Array.asList()
      List<Person> persons4 = Arrays.asList(new Person("Jacky",13),new Person("Vincent",13));
      // persons4.add(new Person("Alex", 3));  
      // persons4.remove(1); 

      List<Person> persons5 = new ArrayList<>(Arrays.asList(new Person("Jacky",13),new Person("Vincent",13)));
      persons5.add(new Person("Alex",3));
      persons5.remove(1);
      persons5.set(0, new Person("Oscar", 19));
      System.out.println(persons5);

  }
}
