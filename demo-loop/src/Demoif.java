public class Demoif {

  public static void main(String[] args) {
    // if, else if , else
    int x = 9;

    if (x < 10) {
      System.out.println("x < 10");
    } else if (x < 15) {
      System.out.println("x < 15");
    } else if (x >= 20) {
      System.out.println("x >= 20");
    } else {
      System.out.println("10 - 19");
    }

    String s = "goodbye";
    if (s.equals("hello")) {
      System.out.println("this is hello");
    } else if (s.equals("Hello")) {
      System.out.println("this is Hello");
    }

   boolean isFemale = true;
   boolean isSmoker = true;
   int age = 70;
   int percent = 100;
   double premium = 120.0;

   // base premium
   // Female 40 or above, premium 8% more
   // Male 16 or above, premium 3% more
   // Smoker -> 7% more
   // age 70 or above -> 20% more

   // 1.Female 40 NS -> 8
   // 2.Female 40 S -> 8 + 7
   // 3.Male 16 NS -> 3
   // 4.Male 16 S -> 3 + 7
   // 5.Male 15 NS -> 0
   // 6.Male 15 S -> 7
   // 7.Male 70 NS ->  20
   // 8.Male 70 S ->  3 + 7 + 20
   // 9.Female 39 NS -> 0
   // 10. Female 39 S -> 7 
   // 11. Female 70 NS -> 20
   // 12. Female 70 S ->  7 + 20
   
   if(age >= 70){
    percent += 20;
   }else if (isFemale == true && age >= 40){
    percent += 8;
   }else if(isFemale == false && age >= 16){
    percent += 3;
   }

   if(isSmoker == true){
    percent += 7;
   }


 

   double lastPermium = (premium * percent) / 100 ;
   
   System.out.println(percent);
   
   System.out.println(lastPermium);
  }

}
