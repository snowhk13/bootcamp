import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream2 {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList("John","Peter","Jenny"));
   
    names.forEach(name -> System.out.println(name));

    names.forEach(name -> {
      if(name.startsWith("J")){
        System.out.println(name);
      }
    });

    names.stream()
    .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length() == 5)
    .forEach(name -> System.out.println(name));

    List<Child> childs = names.stream()
    .filter(name -> name.startsWith("J") && name.endsWith("y") || name.length()==5)
    .map(name -> new Child(name))
    .collect(Collectors.toList());

    System.out.println(childs);

    List<Integer> numbers = new ArrayList<>(List.of(2,4,7,-1,100));

    List<Integer> newNumber = numbers.stream()
    .filter(num -> num % 2 == 0 && num > 6)
    .map(num -> (int)Math.pow(num,2))
    .collect(Collectors.toList());

    System.out.println(newNumber);

    List<Integer> newNumber2 = numbers.stream()
    .map(num -> {
      if(num % 2 ==0){
        return num*num;
      }
      return num;
    })
    .collect(Collectors.toList());

    System.out.println(newNumber2);

 
  }
}
