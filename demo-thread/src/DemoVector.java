import java.util.List;
import java.util.Vector;

public class DemoVector {
  private static final List<String> STRINGS = new Vector<>();

  public static void main(String[] args) {
    // Test Vector.add
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        STRINGS.add("hello"); // lock
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
    System.out.println(STRINGS.size()); // 200000
  }
}
