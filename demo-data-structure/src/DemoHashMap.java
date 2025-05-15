import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // ArrayList -> a set of something (ordering)
    // HashSet -> a set of something (no ordering)

    // key -> value
    // value (a set of something)
    Student s1 = new Student("John");
    Student s2 = new Student("Peter");
    Student s3 = new Student("Jennie");

    ArrayList<Student> class3a = new ArrayList<>();
    class3a.add(s1);
    class3a.add(s2);
    class3a.add(s3);

    Student s4 = new Student("Annie");
    Student s5 = new Student("Joe");
    Student s6 = new Student("Ken");

    ArrayList<Student> class3b = new ArrayList<>();
    class3b.add(s4);
    class3b.add(s5);
    class3b.add(s6);

    // HashMap<Key, Value>
    HashMap<String, ArrayList<Student>> serachEngine = new HashMap<>();
    serachEngine.put("3A", class3a);
    serachEngine.put("3B", class3b);

    // Add a new Student "Steven" into class 3A by HashMap
    // No Loop
    serachEngine.get("3A").add(new Student("Steven"));

    // Put Sally into class 3C if it exists.
    // if 3C not exists, create the ArrayList, and then put Sally.

    // if (serachEngine.containsKey("3C")) {

    ArrayList<Student> class3C = serachEngine.get("3C");
    if (class3C != null) {
      class3C.add(new Student("Sally"));
    } else {
      class3C = new ArrayList<>();
      class3C.add(new Student("Sally"));
      serachEngine.put("3C", class3C);
    }
    System.out.println(serachEngine.get("3C")); // [Student(name=Sally)]

    // ! search students by a String value
    ArrayList<Student> results = serachEngine.get("3B");
    for (Student s : results) {
      System.out.println(s.getName());
    }

    UserProfile up1 = new UserProfile("John", "Chan", "jc@gmail.com");
    UserProfile up2 = new UserProfile("Mary", "Cheung", "mc@gmail.com");
    UserProfile up3 = new UserProfile("Lucas", "Lau", "ll@gmail.com");

    // "put()" is something similar to add().
    // put() -> add a whole entry into the HashMap
    HashMap<String, UserProfile> userMap = new HashMap<>();
    userMap.put("johnchan001", up1);
    userMap.put("marycheung100", up2);
    userMap.put("lucaslau999", up3);

    String userId = "marycheung100";
    UserProfile profile = userMap.get(userId);
    System.out.println(profile.getFirstName());
    System.out.println(profile.getLastName());
    System.out.println(profile.getEmail());

    HashMap<Dog, LocalDate> dobMap = new HashMap<>();
    dobMap.put(new Dog(1), LocalDate.of(2024, 12, 5));
    dobMap.put(new Dog(3), LocalDate.of(2022, 8, 31));

    // ! because Dog's equals()
    System.out.println(dobMap.get(new Dog(3))); // 2022-08-31

    System.out.println(dobMap.containsKey(new Dog(1))); // true
    System.out.println(dobMap.containsValue(LocalDate.of(2024, 12, 5))); // true

    HashMap<String, String> nameMap = new HashMap<>();
    nameMap.put("vincent", "orange");
    nameMap.put("lucas", "apple");
    System.out.println(nameMap.get("Jennie")); // null
    nameMap.put("lucas", "lemon");
    System.out.println(nameMap.get("lucas")); // lemon
    // vincent -> "orange!!"
    String newValue = nameMap.get("vincent") + "!!";
    nameMap.put("vincent", newValue);

    // ! for-each loop for HashMap
    // HashMap is a set of Entry
    // A entry = key + value
    for (Map.Entry<String, String> entry : nameMap.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }

    // Problem Solving
    // counting
    HashMap<Integer, Integer> countMap = new HashMap<>();
    int[] arr = new int[] {-1, 3, -1, 3, 3, 8};
    for (int x : arr) {
      if (countMap.get(x) == null) {
        countMap.put(x, 1);
      } else {
        countMap.put(x, countMap.get(x) + 1);
      }
    }

    // HashMap
    // Output:
    for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
      System.out
          .println("there are " + entry.getValue() + " of " + entry.getKey());
    }
    // there are 2 of -1.
    // there are 3 of 3.
    // there are 1 of 8.

  }
}