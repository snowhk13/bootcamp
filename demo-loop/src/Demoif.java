public class Demoif {

  public static void main(String[] args) {
    //if, else if , else
    int x = 9;

    if(x < 10){
      System.out.println("x < 10");
    }else if (x < 15){
      System.out.println("x < 15");
    }else if(x >= 20){
      System.out.println("x >= 20");
    }else{
      System.out.println("10 - 19");
    }

    String s = "goodbye";
    if(s.equals("hello")){
      System.out.println("this is hello");
    }
    else if(s.equals("Hello")){
      System.out.println("this is Hello");
    }
  }
  
}
