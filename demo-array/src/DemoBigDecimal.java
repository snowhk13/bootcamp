import java.math.BigDecimal;
import java.math.RoundingMode;

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
      
      BigDecimal bd7 = BigDecimal.valueOf(10.0).divide(BigDecimal.valueOf(3.0),2,RoundingMode.HALF_UP);
      System.out.println(bd7);

      BigDecimal bd9 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0),1,RoundingMode.HALF_UP);
      System.out.println(bd9);

      BigDecimal bd10 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0),2,RoundingMode.HALF_DOWN);
      System.out.println(bd10);

      BigDecimal bd11 = new BigDecimal("5").divide(BigDecimal.valueOf(2));
      System.out.println(bd11);

      System.out.println(BigDecimal.valueOf(-2).abs());
      System.out.println(BigDecimal.valueOf(2).pow(3));

      BigDecimal source = BigDecimal.valueOf(2);
      double result = source.doubleValue();
      int result2 = source.intValue();
      String result3 = source.toString();

      BigDecimal bg20 = BigDecimal.valueOf(10.0).divide(BigDecimal.valueOf(2));

      System.out.println(bg20);
      
  }
}
