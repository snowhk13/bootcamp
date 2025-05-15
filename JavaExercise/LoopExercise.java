import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop

    for(int i=0;i<6;i++){
      System.out.println("hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for(int i=0;i<5;i++){
      System.out.print(i);
      if(i == 4){
        break;
      }else{
        System.out.print(",");
      }
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
System.out.println("");
    for(int i =1;i<21;i++){

      if(i % 2 == 0){
        System.out.print(i +" ");
      }
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    System.out.println("");
     for(int i = 1;i<101;i++){
      if(i % 3 ==0){
        if(i % 5 ==0){
          System.out.print(i + " ");
        }
      }
     }
    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    System.out.println(" ");
    int temp1 = 0;
    for(int i =0;i<16;i++){
      temp1 += i;
    }
    System.out.println(temp1);


    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if

    int num1 = 0;
    int num2 = 0;

    for(int i=0;i<11;i++){
      if(i % 2==1){
        num1 += i;
      }else{
        num2 += i;
      }
    }

    System.out.println(num1);
    System.out.println(num2);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
     boolean r1 = false;
    for(int i=0;i<str7.length();i++){
      if(str7.charAt(i) == 'd'){
       r1 = true;
       break;
      }
    }
    if(r1 == true){
      System.out.println("d is found.");
    }else{
      System.out.println("d is not found.");
    }


    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";

    boolean isSubString = false;
    
    for(int i=0;i<s8a.length();i++){
      if(s8b.equals(s8a.substring(i))){
        isSubString = true;
        break;
      }else{
        isSubString = false;
      }
    }

    if(isSubString){
      System.out.println("s8b is a substring.");
    }else{
      System.out.println("s8b is not a substring.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    
    int countnum = 0;
    for(int i=0;i<s9.length();i++){
      if(s9.charAt(i) == 'p'){
        countnum++;
      }
    }
    System.out.println("count=" +countnum);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

    for(int i=0;i<arr10.length;i++){
      arr10[i] = arr10[i].replace('x','k');
    }

    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int count1 = 0;
    for(int i=0;i<s11.length();i++){
    if((s11.charAt(i)-0) > 64 && (s11.charAt(i)-0) <= 90 ){
      count1++;
    }
    
    }   
    System.out.println(count1);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for(int i=0;i<3;i++){
      for(int j=0;j<5;j++){
        System.out.print("*");
      }
      System.out.println("");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score = 0;
    for(int i=0;i<s13.length();i++){
      switch(s13.charAt(i)){
        case 'l':
        score += 1;
        break;
        case 'r':
        score += 3;
        break;
        case 'd':
        score += 2;
        break;
        case 'u':
        score += 4;
        break;
        default:
        score = score - 1;

      }

    }

    System.out.println(score);
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;



    // 15. Find the max value and min value in arr14
    // Use One Loop + if
     long max = Long.MIN_VALUE;
     long min = Long.MAX_VALUE;
     for(int i=0;i<arr14.length;i++){
      if(arr14[i] > max){
        max = arr14[i];
      }
      if(arr14[i] < min){
        min =  arr14[i];
      }
     }

     System.out.println("Max number is " +max);
     System.out.println("Min number is " +min);
    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6

    float[] arr16 = new float[] {0.2F,0.3F,0.6F};

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    BigDecimal[] bg1 = new BigDecimal[arr16.length];
    for(int i=0;i<3;i++){
    arr16[i] = BigDecimal.valueOf(arr16[i]).add(BigDecimal.valueOf(0.1)).floatValue();
    arr16[i] = BigDecimal.valueOf(arr16[i]).divide(BigDecimal.valueOf(1),1,RoundingMode.FLOOR).floatValue();
    }

    System.out.println(Arrays.toString(arr16));
    

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int countName = 0;
    for(int i = 0;i<arr18.length;i++){
    if(target.equals(arr18[i])){
      countName++;
    }
    }
    System.out.println("count name=" +countName);
    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
   
    char[] carr = new char[s19.length()];
    for(int i=0;i<s19.length();i++){
      carr[i] = s19.charAt(i);
    }
     char tempmax = '0';
     char tempmin = '9';

     for(int i=0;i<s19.length();i++){
      if(carr[i] > tempmax){
        tempmax = carr[i];
      }
      if(carr[i] < tempmin){
        tempmin = carr[i];
      }
     }

     for(int i=0;i<carr.length;i++){

      if(carr[i] == tempmin){
        carr[i] = tempmax;
      }else if(carr[i] == tempmax){
        carr[i] = tempmin;
      }
    }
   
    s19 = new String(carr);
    System.out.println(s19);

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};

    int maxLength = Integer.MIN_VALUE;
    String maxString = "";
    for(int i=0;i<arr20.length;i++){
      if(arr20[i].length() > maxLength){
        maxLength = arr20[i].length();
        maxString = arr20[i];
      }
    }

    System.out.println("longest=" +maxString);
    
  }
}
