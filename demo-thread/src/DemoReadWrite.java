public class DemoReadWrite {
  private int x;

  public DemoReadWrite() {

  }

  public void add() {
    this.x++;
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    DemoReadWrite object = new DemoReadWrite();

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
      worker1.join(); // ! main thread is waiting for worker1 come back, then proceed
      worker2.join(); // ! main thread is waiting for worker2 come back, then proceed
    } catch (InterruptedException e) { // checked exception

    }
    System.out.println(object.getX()); // ! less than 200_000, because 2 threads read and write on x
  }
}
