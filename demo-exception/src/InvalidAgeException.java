import java.util.Scanner;

public class InvalidAgeException extends RuntimeException{

  private String code;

  public static void main(String[] args) {
    // InvalidAgeException iae = new InvalidAgeException();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input name");
    String inputName = scanner.next();
    try{
       InvalidAgeException.capturnName(inputName);
    }catch(NameTooLongException e){
      System.out.println("Your name too long,input again");
    }

    System.out.println("Please input an age number:");
    int input = scanner.nextInt();
    try{
      int result = calculate(input);
      System.out.println("The input is "+input+" and the result is " + result);
    }catch(InvalidAgeException e){
      System.out.println("Please input again,The value age is invalid.");
    }
  }
  
public static int calculate(int age){
  if(age<0){
    throw new InvalidAgeException();
  }
  return age + 10;
}

public static void capturnName(String name){
  if(name.length() > 10){
    throw new NameTooLongException();
  }
  System.out.println("Your name is " +name);
}
}
