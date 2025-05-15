import java.util.Comparator;

// Comparator -> formula
public class SortedByNum implements Comparator<Ball> {
  // -1 -> b1
  // 1 -> b2
  // ascending order
  @Override
  public int compare(Ball b1, Ball b2) {
    return b1.getNum() < b2.getNum() ? -1 : 1;
  }
}