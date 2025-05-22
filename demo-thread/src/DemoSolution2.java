public class DemoSolution2 {
  private int x;

  public DemoSolution2() {

  }

  // ! synchronized -> Lower performance 
  public synchronized void add() { // ! this is the key lock and unlock the door of add() method
    this.x++; // read and write
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    DemoSolution2 object = new DemoSolution2();

    // define the task content
    Runnable task = () -> {
      System.out.println("Thread Name:" + Thread.currentThread().getName() + " start to work.");
      for (int i = 0; i < 100_000; i++) {
        object.add();
      }
      System.out.println("Thread Name:" + Thread.currentThread().getName() + " completed.");
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
