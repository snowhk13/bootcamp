import java.util.HashMap;
import java.util.Map;

public class Test2 {

  public static void main(String[] args) {
        HashMap<String, String> nameMap = new HashMap<>();
    nameMap.put("vincent", "orange");
    nameMap.put("lucas", "apple");
    System.out.println(nameMap.get("Jennie")); // null
    nameMap.put("lucas", "lemon");
    System.out.println(nameMap.get("lucas")); // lemon
    // vincent -> "orange!!"
    String newValue = nameMap.get("vincent") + "!!";
    nameMap.put("vincent", newValue);

    for(Map.Entry<String,String> entry : nameMap.entrySet()){
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
  }
}
