import java.util.Random;

public class DemoMath {

  public static void main(String[] args) {
    Math.abs(-3.0);

    // int -> double (safe -> auto-conversion)
    // pow,sqrt,abs   Math主要用這3個功能
    double result = Math.pow(2.0,3.0);
    System.out.println(result);

    System.out.println(Math.sqrt(81)); //9.0
    System.out.println(Math.abs(-3.0)); //3.0

    // Round to integer
    System.out.println(Math.round(3.24)); //3
    System.out.println(Math.round(3.7812931)); // 4

    // 0 - 1
    System.out.println(Math.random());

    // 1 - 3
    System.out.println(new Random().nextInt(3) + 1); // 0-2

    // 1 - 49

    System.out.println(new Random().nextInt(49) + 1); // 1 - 49


    int[] marksix = new int[6];
    int i = 0;    
    boolean isDup = false;

    while(i<6){
      int num = new Random().nextInt(7) + 1;
      isDup = false;
      for(int j = 0; j<marksix.length;j++){
        if(marksix[j] == num){
          isDup = true;
          break;
        }
      }
      if(isDup == true){
       continue;
      }else{
       
        marksix[i] = num;
        i++;
      }
      }
    
    for(int k=0; k<6; k++){
      System.out.print(marksix[k] + " ");
    }

  }
  
}
