import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args)  {
    List<Integer> numbers = new ArrayList<>(Arrays.asList(3,4,3,1,2));

    int[] numbers2 = new int[]{ 3,4,3,1,2 };
    int[] numbers3 = Arrays.stream(numbers2).boxed().sorted().collect(Collectors.toList())
    .mapToInt(Integer::intValue).toArray();
    

    System.out.println(numbers);
    }
}
