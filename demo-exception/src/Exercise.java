public class Exercise {
  public static void main(String[] args) {
    int index = -1;
    int[] arr1 = new int[]{1,2,3};
    try{
      System.out.println(arr1[index]);
    }catch(ArrayIndexOutOfBoundsException e){

      System.out.println("index number error");
    }

    int divideNum = 0;

    try{
      System.out.println(10 / divideNum);
    }catch(ArithmeticException e){
      System.out.println("cannot divide by 0");
    }

    String inputnumber = "PPP";

    try{
      int result = Integer.valueOf(inputnumber);
      System.out.println(result);
    } catch(NumberFormatException e){
      System.out.println("pls enter the number");
    }

  }
}
