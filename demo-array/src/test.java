import java.math.BigDecimal;

public class test {
  public static void main(String[] args) {

   String s1 = "123";
   String s2 = "";
   String s3 = " ";
   String s4 = "bootcamp";

   s1.isEmpty();
   s1.isBlank();
   s1.substring(0);
   s1.toLowerCase();
   s1.toUpperCase();
   s1.replace('o','x');
   s1.contains(" ");
   s1.startsWith("l");
   s1.endsWith("l");
   s1.trim();
   s1.equalsIgnoreCase("");
   s1.indexOf("");
   s1.lastIndexOf("");
   s1.concat("");
   s1.compareTo("");

   System.out.println(s4.substring(1,6));

   char[] c1 = s4.toCharArray();

   for(char xxx : c1){
   System.out.println(xxx);
   }

   String s5 = new String(c1);

   System.out.println(s5);



  

   
  }
}
