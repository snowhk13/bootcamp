import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class DemoPriorityQueue2 {

  public static class SortedByNameDesc implements Comparator<String>{

   @Override
   public int compare(String s1,String s2){
    return s1.compareTo(s2) > 0 ? -1 : 1;
   }
  
}


  public static void main(String[] args){
    Queue<String> q1 = new PriorityQueue();
    q1.add("John");
    q1.add("Annia");
    q1.add("Tom");

    String s1 = "Annia";
    String s2 = "Boy";
   System.out.println(s2.compareTo(s1));
    

    for(String x : q1){
      System.out.println(x);
    }

    int[] nums = new int[5];
    nums.length
  }
  
}
