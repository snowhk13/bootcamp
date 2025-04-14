public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence
    int box = -1; 
    for(int i=0;i<15 ; i++){
       System.out.print(first+ " ");
       box = first + second;
       first = second;
       second = box;
     }
  }
}