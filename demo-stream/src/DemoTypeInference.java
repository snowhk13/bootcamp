import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {
  // private var age; // ! var is not for attribute type.

  public static void main(String[] args) {
    // Java is Strong type
    String s = "hello";

    // Java 10
    var s2 = "Oscar";
    // ! During compile time (java file -> class file), var -> String
    // s2 = 13; 
    // Java is able to check s2 is with String Type during compile time.
    // so you cannot put a non-String value after Line 7
    
    // s2.charAt(0);
    var s3 = new Ball(Ball.Color.BLUE, 13);
    // s3 = "Oscar";

    // ! We cannot use a specific type of variable to receive the result, if the method return var type.
    // int result = sum(3, 4); 

    List<String> names = new ArrayList<>(Arrays.asList("Mary", "Oscar", "Sue"));
    for (var name : names) {
      name.charAt(0);
    }

    // var[] arr = new int[3]; 

  }

  // public var sum(int x, int y) {
  //   return x + y;
  // }

  // public int sum(var x, var y) {
    
  // }
}
