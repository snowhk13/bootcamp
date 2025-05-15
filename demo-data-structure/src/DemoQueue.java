import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<Cat> queue1 = new LinkedList<>();
    queue1.add(new Cat("John"));
    queue1.add(new Cat("Jacky"));
    queue1.add(new Cat("Vincent"));
    System.out.println(queue1.poll()); //John
    System.out.println(queue1);
    
    Deque<Cat> queue2 = new LinkedList<>();
    queue2.addLast(new Cat("Mary"));
    queue2.addFirst(new Cat("Peter"));
    queue2.addLast(new Cat("Sally"));
    System.out.println(queue2.pollFirst());
    System.out.println(queue2);
    System.out.println(queue2.pollLast());

    // Deque<Cat> queue3 = new ArrayDeque<>();
    // Queue<Cat> queue4 = new ArrayDeque<>();
    // Collection<Cat> queue5 = new ArrayDeque<>();
    // Iterable<Cat> queue6 = new ArrayDeque<>();

    ArrayDeque<Cat> queue3 = new ArrayDeque<>();
    queue3.add(new Cat("Mary"));
    queue3.add(new Cat("Peter"));
    queue3.add(new Cat("Tom"));
    queue3.remove(new Cat("Peter"));
    System.out.println(queue3.contains(new Cat("Mary")));
    System.out.println(queue3.size());

    System.out.println(queue3);



    List<Cat> cats = new LinkedList<>();
    
    //LinkedList -> Deque -> Queue

    Animal a1 = new Cat("John");
    Object o1 = new Cat("Peter");
  }
  
}
