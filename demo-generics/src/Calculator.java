public class Calculator {

  private int x;
  private int y;

  public Calculator(int x, int y){
    this.x = x;
    this.y = y;
  }
  public static int sum(int x , int y){
    return x + y;
  }

  public int sum2(){
    return this.x + this.y;
  }
  
  public static void main(String[] args) {
    System.out.println(Calculator.sum(1, 2));
    Calculator c1 = new Calculator(1,2);
    System.out.println(c1.sum2());
  }
}
