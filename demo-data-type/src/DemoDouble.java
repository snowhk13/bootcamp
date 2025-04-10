public class DemoDouble {

  public static void main(String[] args){
    int x = 9;

    double y = 9.9;
    System.out.println(y);
    //x = 9.9; 
    
    


    double a = 99.9;
    int b = 3;  
    double amount = a * b;
    System.out.println(amount);


    // 10 -> int value
    // 3 -> int value
    // 1. 10 / 3 -> int / int  -> int (10 / 3 -> 3)
    // 2. assign result into w (3 -> 3.0)

    double w = 10 / 3;
    System.out.println(w);

    //! double / int -> double
    int score1 = 71;
    int score2 = 82;

    double score3 = (score1 + score2) / 2.0;

    System.out.println(score3);
    //! divided by zero >> system err
    //double r3 = 10 / 0;
    //System.out.println(r3);

    double r4 = 0 / 10;
    System.out.println(r4);
    
  }
  
}
