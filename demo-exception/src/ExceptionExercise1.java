import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. Handle the
  // ArithmeticException when dividing by zero and display an appropriate message.

  // 1. If exception is caught, print "Error: Cannot divide by zero.", otherwise print "Result: X"
  // 2. No matter if the exception is caught, finally print "Division operation completed."

public static void main(String[] args){
  try{
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter number1:");
int number1 = scanner.nextInt();
System.out.println("Please enter number2");
int number2 = scanner.nextInt();

int result = BigDecimal.valueOf(number1).divide(BigDecimal.valueOf(number2)).intValue();
System.out.println("Result: " +result);

  }catch(ArithmeticException e){
    // e.printStackTrace();
    System.out.println("Error: Cannot divide by zero.");
}

    // code here ...
    // try, catch
  }
}
