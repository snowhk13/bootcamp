public class DemoThread {
  private int x;

  public DemoThread() {
    // this.x = 0;
  }

  public void add() {
    this.x++;
  }

  public int getX() {
    return this.x;
  }

  // JVM execute main method
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 0; i < 100000; i++) {
      sum += i;
    }
    System.out.println(sum);

    DemoThread obj = new DemoThread();
    for (int i = 0; i < 100_000; i++) {
      obj.add();
    }
    System.out.println(obj.getX()); // 100000

    Runnable task = () -> System.out.println("hello");
    
    // ! main thread (original worker)
  
    Thread worker1 = new Thread(task);
    worker1.start(); // sub-thread 1 starts to work, while the main thread still proceed his own work

    Thread worker2 = new Thread(task);
    worker2.start(); // sub-thread 2 starts to work, while the main thread and sub-thread 1 still proceed his own work
    System.out.println("Program end ...."); // main thread comes here, but he doesn't where worker1 and worker2 goes
  }
}
