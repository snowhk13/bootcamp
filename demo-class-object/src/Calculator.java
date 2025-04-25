public class Calculator {
  private int age;

  public Calculator(int age) {
    this.age = age;
  } 
  
  // ! Instance method (Input & self variable -> output)
  public int sum(int x, int y) {
    // int + int -> int
    return x + y + this.age;
  }

  // ! Static Method (Input -> output)
  // ! Not able to access Instance variable
  public static int sum2(int x, int y) {
    return x + y;
  }

  public static void print(String str) {
    System.out.println("The String is " + str);
  }

  public static void main(String[] args) {
    // Static method
    Calculator c1 = new Calculator(65);
    int result = c1.sum(1, 2);
    System.out.println(result); // 68
    System.out.println(Calculator.sum2(1, 2)); // 3

    Calculator.print("hello");

    int x = c1.sum(1,2);

    System.out.println(x);

  }
}