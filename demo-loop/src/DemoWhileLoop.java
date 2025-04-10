public class DemoWhileLoop {
  
  public static void main(String[] args) {
    int x = 2;
    int k = 0;
    while (k < 3){
      x *= 2;
      k++;
    }
    System.out.println(x);

    //Do While Loop
    // ! No entry condition (At least execute once)

    k = 0;
    do{
      System.out.println("hello");
      k++;
    }while(k < 3);
  }
}
