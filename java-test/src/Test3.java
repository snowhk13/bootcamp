import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
public static void main(String[] args) {
        int[] arr = new int[]{3,7,1,6};
   List<Integer> list1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
   System.out.println(list1);
   int[] arr2 = list1.stream().mapToInt(n->n).toArray();

   System.out.println(Arrays.toString(arr2));
}
}
