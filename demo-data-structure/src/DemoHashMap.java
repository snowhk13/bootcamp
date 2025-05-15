import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    // ArrayList -> a set of something(ordering)
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

    HashMap<String, ArrayList<Student>> serachEngine = new HashMap<>();
    serachEngine.put("3A",class3a);
    serachEngine.put("3B",class3b);
// Add a new Student "Steven" into class 3A by HashMap
// No Loop

   serachEngine.get("3A").add(new Student("Steven"));

 System.out.println(serachEngine.get("3A"));
if(serachEngine.containsKey("3C")){
 serachEngine.get("3C").add(new Student("Sally"));
}else{
  ArrayList<Student> class3c = new ArrayList<>();
  serachEngine.put("3C",class3c);
  serachEngine.get("3C").add(new Student("Sally"));
}

System.out.println(serachEngine.get("3C"));

    UserProfile up1 = new UserProfile("John", "Chan", "jc@gmail.com");
    UserProfile up2 = new UserProfile("Mary", "Cheung", "mc@gmail.com");
    UserProfile up3 = new UserProfile("Lucas", "Lau", "ll@gmail.com");

    HashMap<String, UserProfile> userMap = new HashMap<>();
    userMap.put("johnchan001",up1);
    userMap.put("marycheung001",up2);
    userMap.put("lucaslau999",up3);

    String userId = "marycheung001";
    UserProfile profile = userMap.get(userId);
    System.out.println(profile.getFirstName());
    System.out.println(profile.getLastName());
    System.out.println(profile.getEmail());

    HashMap<Dog, LocalDate> dobMap = new HashMap<>();
    dobMap.put(new Dog(1),LocalDate.of(2024,12,5));
    dobMap.put(new Dog(3),LocalDate.of(2022,8,31));

    System.out.println(dobMap.get(new Dog(3)));

    System.out.println(dobMap.containsKey(new Dog(1)));
    System.out.println(dobMap.containsValue(LocalDate.of(2024,12,5)));

    HashMap<String,String> nameMap = new HashMap<>();
    nameMap.put("vincent","orange");

    System.out.println(nameMap.get("vincent"));

    nameMap.put("vincent",nameMap.get("vincent")+"!!");

    System.out.println(nameMap.get("vincent"));



    int[] arr = new int[] {-1,3,-1,3,3,8};

    HashMap<Integer, Integer> serach = new HashMap<>();

    for(int x : arr){
      if(serach.get(x) == null){
       serach.put(x,1);
      }else{
        serach.put(x,serach.get(x)+1);
      }
      }
  
   
    for(Map.Entry<Integer, Integer> entry : serach.entrySet()){
      System.out.println("There are " +entry.getValue() +" of " +entry.getKey());
    }

    




  }

}
