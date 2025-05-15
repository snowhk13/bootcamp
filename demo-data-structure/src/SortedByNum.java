import java.util.Comparator;

public class SortedByNum implements Comparator<Ball>{

  @Override
  public int compare(Ball b1,Ball b2){
    return b1.getNum() < b2.getNum() ? -1 : 1;

  }
  
}
