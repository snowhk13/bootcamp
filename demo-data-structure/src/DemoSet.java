import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoSet {
  public static void main(String[] args) {
    Set<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Jacky"));
    cats.add(new Cat("John"));
    System.out.println(cats); // [Cat(name=John), Cat(name=Jacky)]

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    ArrayList<String> names = new ArrayList<>();
    names.add("john");
    names.add("peter");

    ArrayList<ArrayList<String>> strings = new ArrayList<>();
    strings.add(fruits);
    strings.add(names);

    System.out.println(strings.get(0)); // fruit list
    System.out.println(strings.get(1)); // name list
    
    // HashMap?
    // Map is an interface of HashMap.
    Map<String, ArrayList<String>> map = new HashMap<>();
    map.put("fruit", fruits);
    map.put("name", names);
    System.out.println(map.get("name")); // [john, peter]

    // Floor, 
    Map<String, Map<String, ArrayList<String>>> building = new HashMap<>();

    ArrayList<String> p1a = new ArrayList<>(List.of("John", "Peter"));
    ArrayList<String> p1b = new ArrayList<>(List.of("Sally", "Tommy"));

    ArrayList<String> p2a = new ArrayList<>(List.of("ABC", "DEF"));

    ArrayList<String> p3a = new ArrayList<>(List.of("IJK", "XYZ"));
    ArrayList<String> p3b = new ArrayList<>(List.of("OPQ", "RST"));
    ArrayList<String> p3c = new ArrayList<>(List.of("KLJ", "OOO"));

    Map<String, ArrayList<String>> floor1 = new HashMap<>();
    floor1.put("PA", p1a);
    floor1.put("PB", p1b);

    Map<String, ArrayList<String>> floor2 = new HashMap<>();
    floor2.put("PA", p2a);

    Map<String, ArrayList<String>> floor3 = new HashMap<>();
    floor3.put("PA", p3a);
    floor3.put("PB", p3b);
    floor3.put("PC", p3c);

    building.put("FLOOR1", floor1);
    building.put("FLOOR2", floor2);
    building.put("FLOOR3", floor3);

    System.out.println(building.get("FLOOR3").get("PB")); // [OPQ, RST]
 
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Cat("Mary"));
    animals.add(new Dog(8));

    System.out.println(animals.get(0));
    System.out.println(animals.get(1));

    for(Animal animal : animals){
     if(animal instanceof Cat){
         System.out.println(((Cat) animal).getName());
     }
     else if(animal instanceof Dog){
      System.out.println((((Dog)animal).getAge()));
     }

    }

    Map<String, ArrayList<Animal>> catMap = new HashMap<>();

    ArrayList<Cat> cat1 = new ArrayList<>();
    cat1.add(new Cat("Mary"));
    cat1.add(new Cat("Peter"));

    
    
    ArrayList<? extends Animal> animals3 = new ArrayList<Cat>();
    ArrayList<? extends Animal> animals4 = new ArrayList<Dog>();
    
    

  }
}
