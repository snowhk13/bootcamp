import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
  public static void main(String[] args) {
    int[] arr1 = new int[]{1,2,3};

   List<Integer> list1 =  Arrays.stream(arr1).boxed().collect(Collectors.toList());

   int[] arr2 = list1.stream().mapToInt(n -> n).toArray();

   char c1 = '0';
   int n1 = c1 - '0';

   System.out.println(n1);

   int n2 = 0;
   char c2 = (char)(n2 + '0');
   System.out.println(c2);
  }
}
