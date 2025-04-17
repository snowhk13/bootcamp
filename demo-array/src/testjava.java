public class testjava {
  public static void main(String[] args) {
    int[] a1 = new int[5];
    long[] a2 = new long[5];
    double[] a3 = new double[5];
    float[] a4 = new float[5];
    byte[] a5 = new byte[5];
    short[] a6 = new short[5];
    boolean[] a7 = new boolean[5];
    char[] a8 = new char[5];
    String[] a9 = new String[5];

 String s1 = "helloworld";
 s1 = s1.replace('o','x');
 System.out.println(s1);
 System.out.println("helloworld".replace('l','o'));

 System.out.println("helloworld".indexOf('l'));

 String s3 = "good";
 String s4 = "bye";

 s4 = s3.concat(s4);
 System.out.println(s4);

 System.out.println("bootcamp".indexOf('o')); 
 System.out.println("bootcamp".lastIndexOf('o'));
 
 boolean result = "".isEmpty();
 boolean result2 = "boot".isEmpty();
System.out.println(result);
System.out.println(result2);
System.out.println(" boy is boy!!! ");
String s6 = " boy is boy!!! ".trim();
System.out.println(s6);

System.out.println("hEllo".toUpperCase());
System.out.println("hEllo".toLowerCase());

System.out.println("bootcamp".contains("boo"));
System.out.println("bootcamp".contains("B"));

System.out.println("bootcamp".startsWith("boot"));
System.out.println("bootcamp".startsWith("oot"));
System.out.println("bootcamp".endsWith("camp"));
System.out.println("bootcamp".endsWith("am"));

System.out.println("bootcamp".substring(0,7));

  }
  
}
