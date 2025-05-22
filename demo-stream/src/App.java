import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
         Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(5);
        numberSet.add(20);
        numberSet.add(15);
        numberSet.add(30);

        // 使用 Stream 對 Set 進行排序並轉換回 Set

        Comparator<Integer> sortedByDescending2 = (n1,n2) -> n1.compareTo(n2) > 0 ? -1 : 1;
        Set<Integer> sortedSet = numberSet.stream()
                .sorted(sortedByDescending2)
                .collect(Collectors.toCollection(HashSet::new));

                System.out.println(sortedSet);
    }
}
