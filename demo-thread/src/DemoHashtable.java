import java.util.Hashtable;
import java.util.Map;

public class DemoHashtable {
  private static final Hashtable<String, Integer> nameMap = new Hashtable<>();
  private static final Map<Integer, String> nameMap2 = new Hashtable<>();

  public static synchronized void operate(Hashtable<String, Integer> map,
      Integer valueToAdd) {
    Integer result = map.get("bootcamp");
    result = result + valueToAdd;
    map.put("bootcamp", result);
  }

  public static void main(String[] args) {
    // Hashtable.put
    nameMap.put("bootcamp", 0);

    // i 1-10000

    // 1 + 2
    Runnable task = () -> {
      for (int i = 1; i <= 10000; i++) {
        operate(nameMap, i);
      }
    };

    Runnable task2 = () -> {
      for (int i = 1; i <= 10000; i++) {
        nameMap2.put(i, "hello");
      }
    };

    Thread worker1 = new Thread(task2);
    Thread worker2 = new Thread(task2);
    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) { // checked exception

    }
    System.out.println(nameMap2.size()); // ~10xxx

  }
}
