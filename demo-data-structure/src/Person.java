import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Person implements Comparable<Person>{


  private String name;
  private int age;

  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Person person){
    if(this.age == person.age){
      return this.name.charAt(0) < person.name.charAt(0) ? -1 : 1;
    }

    if(this.age < person.age)
    return -1;
    return 1;
  }

  public String toString(){
    return "Person("+
    "name=" + this.name +
    " ,age=" + this.age
    + ")";
  }

  public static void main(String[] args) {

    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John",10));
    persons.add(new Person("ZOO",16));
    persons.add(new Person("ALEX",10));

    Collections.sort(persons);

    System.out.println(persons);


    
  }
  
}
