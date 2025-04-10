import java.util.Scanner;

public class DemoGuessingGame {

  public static void main(String[] args) {

    int bomb = 67;
    int a = 1;
    int b = 100;
    int input = -1;
  Scanner scanner = new Scanner(System.in);

  //loop
  //Scanner (Collect user input)
  //! User A and B?
  //Adjust the range of numbeers
  //Prompt Question: "Please input a number"

 String userName = "User A";

while(input != bomb){
  System.out.println("Please input a number , you are " +userName+ " .");
  input = scanner.nextInt();
      
 if(input < a || input > b ){
  continue;
 }

 if(input > bomb){
   b = input - 1;
   System.out.println("bomb number is " +a+ " ~~~ " +b+ " .");
 }
 else if(input < bomb){
   a = input + 1;  
   System.out.println("bomb number is " +a+ " ~~~ " +b+ " .");
 }
 else if(input == bomb){
  System.out.println("Bomb is " +bomb+ " . " +userName+ " lose the game.");
 }

if(userName == "User A"){
  userName = "User B";
}
else if(userName == "User B"){
  userName = "User C";
}
else if (userName == "User C"){
  userName = "User A";
}


}


scanner.close();


  }
}
