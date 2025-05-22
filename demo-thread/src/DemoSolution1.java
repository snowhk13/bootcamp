import java.util.concurrent.atomic.AtomicInteger;

public class DemoSolution1 {
  private AtomicInteger x; // 原子性

  public DemoSolution1() {
    this.x = new AtomicInteger(0);
  }

  public void add() {
    this.x.addAndGet(1); // 
  }

  public int getX() {
    return this.x.get();
  }


  public static void main(String[] args) {
    DemoSolution1 object = new DemoSolution1();

    // define the task content
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++) {
        object.add();
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
    System.out.println(object.getX());
  }
}
