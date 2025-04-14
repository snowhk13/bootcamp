import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
     System.out.println(0.1 + 0.2);

    BigDecimal bd1 = new BigDecimal("0.1"); // approach 1
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // approach 2 (preferf)
      System.out.println(bd1);
      System.out.println(bd2);
       
      //! add()
      BigDecimal bd3 = bd1.add(bd2);
      System.out.println(bd3);
      System.out.println(bd1);
      System.out.println(bd2);
      
      //! subtract()


       bd3 = bd2.subtract(bd1);
       System.out.println("subtract result is " +bd3);
      //! multiply()
      BigDecimal test1 = BigDecimal.valueOf(20.0);
      BigDecimal test2 = BigDecimal.valueOf(4.0);
       BigDecimal test3 = test1.multiply(test2);
       System.out.println(test3);
      //! divide()

      test3 = test1.divide(test2);
      System.out.println(test3);

      // 10 / 3
      // rounding? 3.45 -> 3.4(HALF_DOWN)? 3.45 -> 3.5 (HALF_UP)?
  }
}
