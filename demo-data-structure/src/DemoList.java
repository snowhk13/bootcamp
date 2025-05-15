import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

public static void main(String[] args) {
  List<Bird> birds = new ArrayList<>();
  System.out.println(birds.isEmpty());
  birds.add(new Bird("John",null));

  //! why we use List<Bird> as object reference type?
  birds = new LinkedList<>(birds);
  System.out.println(birds);

  birds.add(new Bird("Vincent", null)); // add(new Bird("Vincent"),null)

  System.out.println(birds.getLast().getName());

  LinkedList<Bird> manyBirds = new LinkedList<>();
  manyBirds.add(new Bird("Ricky",null));
  manyBirds.addFirst(new Bird("Jacky",null));
  System.out.println(manyBirds);
  manyBirds.poll(); //! LinkedList has poll(), but List does not have.
  manyBirds.push(new Bird("Tommy",null));
  System.out.println(manyBirds);

  // usually we use List as type reference, until you want to use speific methods of the class.
  
  // List<String> emails = new ArrayList<>();
  // List<String> emails = new LinkedList<>();

}
  
}
