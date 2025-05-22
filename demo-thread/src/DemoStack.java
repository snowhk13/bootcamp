import java.util.Stack;

public class DemoStack {
  private static final Stack<Integer> INTEGERS = new Stack<>();

  public static void main(String[] args) {
    // Thread-safe for all methods in Stack.class

    // Stack always use push and pop
    Stack<String> stack1 = new Stack<>();
    stack1.push("John");
    stack1.push("Peter");
    stack1.push("Jennie");
    System.out.println(stack1.pop()); // Jennie remove and pick up the last element
    stack1.push("Lucas");
    System.out.println(stack1.pop()); // Lucas, remove and pick up the last element
    stack1.add("Vincent");
    System.out.println(stack1.pop()); // Vincent, remove and pick up the last element

    stack1.addFirst("Sally");
    System.out.println(stack1.pop()); // Peter, remove and pick up the last element

    // Test Stack.push()
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        INTEGERS.push(i); // lock
      }
    };

    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) { // checked exception

    }
    System.out.println(INTEGERS.size()); // 200000

  }
}
