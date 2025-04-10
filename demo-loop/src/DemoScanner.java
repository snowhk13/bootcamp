import java.util.Scanner;

public class DemoScanner {

  public static void main(String[] args){
    
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please input a number");
  int input = scanner.nextInt();
  if (input % 2 == 1){
  System.out.println("It is odd number");
  }
  else{
    System.out.println("It is even number");
  }
  
  }  
}
