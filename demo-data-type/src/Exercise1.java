public class Exercise1 {

  public static void main(String[] args){
  // equals()
  // length()
  // charAt()

  String s1 = "Bootcamp";
  boolean b1 = s1.equals("Bootcamp");
  boolean b2 = s1.equals("bootcamp");

  System.out.println(b1);
  System.out.println(b2);

  int l1 = s1.length();
  System.out.println(l1);

  char c1 = s1.charAt(5);
  System.out.println(c1);
//System.out.println(s1.charAt(12)); //Exception (System Error)

//Naming Convention - Java
//Camel case
String studentName = "John";
System.out.println(studentName);

  }
  
}
