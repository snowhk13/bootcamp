public class DemoForLoop {
   public static void main(String[] args) throws Exception {
      int x = 2;

      for (int i = 0; i < 3; i++) {
         x *= 2;
      }

      System.out.println("2的4次方是 " + x);

      int num1 = 9;
      int num2 = 17;

      int max = 0;
      if (num1 > num2) {
         max = num1;
      } else {
         max = num2;
      }

      System.out.println(max);
      // 0 - 100, Find the largest odd number, which is < 90

      int maxOdd = -1;

      for (int i = 100; i > 0; i--) {
         if (i % 2 == 1 && i < 90 && i > maxOdd) {
            maxOdd = i;
         }
      }
      System.out.println(maxOdd);

      int sumEven = 0;
      for (int i = 0; i < 21; i++) {

         if (i % 2 == 0 && i <= 20) {
            sumEven += i;
         }
      }

      System.out.println(sumEven);

      // 0 -30 , if < 20 , sum up odd number, if >= 20, sum up even number

      int sumNum = 0;

      for (int i = 0; i < 31; i++) {

         if (i % 2 == 1 && i < 20) {
            sumNum = sumNum + i;
         }
         if (i % 2 == 0 && i >= 20) {
            sumNum = sumNum + i;
         }
      }

      System.out.println(sumNum);

      // Searching

      String s1 = "welcome to bootcamp.";

      int count = 0;
      for (int i = 0; i < s1.length(); i++) {
         if (s1.charAt(i) == 'o') {
            count += 1;
         }
      }

      System.out.println(count);

      // continue
      for (int i = 0; i < 3; i++) {
         if (i % 2 == 1) {
            continue;
         }
         System.out.println(i);
      }

      // ! for + break
      // Approach 1: simple if
      for (int i = 0; i < 3; i++) {
         if (i < 2) {
            System.out.println(i);
         }
      }

      // Approach 2: break
      for (int i = 0; i < 3; i++) {
         if (i >= 2) {
            break; // skip the rest of code, goes to i++
         }
         System.out.println(i); // 0,1
      }

      //Question: sum up 5 - 15 -> result
      //the product of 16 - 20 -> result2
      // Single for loop

      int result = 5;
      int result2 = 16;
      for(int i = 6; i<21 ; i++){

         if (i <= 15){
         result = result + i;
         }
         else if(i >= 17){
            result2 = result2 * i;
         }
      
      }

System.out.println(result);
System.out.println(result2);

for (int i = 10; i > 0 ; i--){
   System.out.println(i);
}

// ! Nested Loop
// i=0, j=0,1
// i=1, j=0,1
// i=2, j=0,1

for(int i = 0; i < 3; i++){
   for(int j = 0; j < 2; j++){
      System.out.println("i=" + i + ",j=" + j);
   }
}

   }

}


