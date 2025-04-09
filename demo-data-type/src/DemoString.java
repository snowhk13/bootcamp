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

    s1 = s1 + pp + x; 
    System.out.println(s1);
    
//String + int -> String (Step)
//Assign String value to String variable (Step 2)

String s3 = "hello" + 13;
System.out.println(s3);

//String + boolean = String

//!String Method 1:equals()
//! Primitive has no tools(value storage ONLY)
// String is not a primitive. So String can store value and has tool.
String s4 = "hello";
System.out.println(s4.equals("hello")); //true, asking if s4 equals to "hello"
System.out.println(s4.equals("male")); //false, asking if s4 equals to "male"

boolean result = s4.equals("hello");
System.out.println(result);

System.out.println(1 + 1);
int r2 = 1 + 1;

System.out.println(s4.equals("Hello")); // false, case sesentive

//String method 2: length()
//參數 = parameter
//length() has no parameters
System.out.println(s4.length()); //5 , return int
int num1 = s4.length();
System.out.println(num1); //5
double d1 = s4.length(); //! why OK?
//short s10 = s4.length(); //! why NOT OK?

// ! String Method 3: charAt()
// 1 is an index, which always start with 0
System.out.println(s4.charAt(1)); //e
System.out.println(s4.charAt(0)); //h

char char1 = s4.charAt(1);
System.out.println(char1);

  }
  
}
