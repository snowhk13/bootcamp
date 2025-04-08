public class DemoString {

  public static void main(String[] args){
    char c1 = 'H';
    String s1 = "Hello";
    String s2 = "100";

    //String + operation
    s2 = s2 + "100";
    System.out.println(s2);// "100100"
    s1 = s1 + "100";
    System.out.println(s1);// "Hello100"

    double x = 99.111111;
    boolean pp = true;

    s1 = s1 + pp;
    System.out.println(s1);
    


  }
  
}
