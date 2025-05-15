import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static class SortedByNameDesc implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
      return s1.compareTo(s2) > 0 ? -1 : 1;
    }
  }

  // formula -> Person age desc
  public static class SortedByAgeDesc implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return p1.getAge() > p2.getAge() ? -1 : 1;
    }
  }

  public static void main(String[] args) {
    Queue<String> q1 = new PriorityQueue<>(new SortedByNameDesc()); // Underlying data structure -> ArrayList -> array
    q1.add("Vincent");
    q1.add("Lucas");
    q1.add("Sally");

    for (String s : q1) {
      System.out.println(s);
    }
    // Vincent
    // Lucas
    // Sally

    // consume the queue
    while (!q1.isEmpty()) {
      System.out.println(q1.poll()); // ! ordering -> pick up (slow)
    }

    // method: poll()
    // - ordering -> String compareTo()
    // - remove the object


    // 3 Persons -> PQ
    Queue<Person> q2 = new PriorityQueue<>(new SortedByAgeDesc());
    q2.add(new Person("John", 13));
    q2.add(new Person("Peter", 18));
    System.out.println(q2.poll()); // Person(name=Peter,age=18)
    q2.add(new Person("Vincent", 60));
    System.out.println(q2.poll()); // Person(name=Vincent,age=60)
    System.out.println(q2.poll()); // Person(name=John,age=13)
  }
}