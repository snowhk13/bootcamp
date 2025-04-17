import java.math.BigDecimal;
import java.util.Arrays;

public class DemoForLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -20, 200, 17};
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    // max = Math.max(arr[i], max);

    System.out.println("Max number is " + max);
    // equals(), length, charAt()
    char[] chs = "hello".toCharArray();
    System.out.println(Arrays.toString(chs));
    // convert l to x
    // "hello" -> "hexxo"

    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'l') {
        chs[i] = 'x';
      }
    }
    System.out.println(Arrays.toString(chs));

    System.out.println(String.valueOf(chs)); // "hexxo"

    System.out.println("hello".replace('l', 'x')); // hexxo

    System.out.println("hello".equals("Hello")); // false
    System.out.println("hello".equalsIgnoreCase("Hello")); // true

    double[] values = new double[] {0.2, 0.5, 1.9};
    // add 0.1
    // [0.3,0.6,2.0]

    for (int i = 0; i < values.length; i++) {
      BigDecimal bg1 =
          BigDecimal.valueOf(values[i]).add(BigDecimal.valueOf(0.1));
      values[i] = bg1.doubleValue();
    }

    // BigDecimal bg1 = BigDecimal.valueOf(values[i]).add(BigDecimal.valueOf(0.1));

    System.out.println(Arrays.toString(values));

    BigDecimal[] bigDecimals = new BigDecimal[3];
    bigDecimals[0] = BigDecimal.valueOf(10.3);
    bigDecimals[1] = new BigDecimal("2.4");
    bigDecimals[2] = BigDecimal.valueOf(9.9);


    System.out.println(Arrays.toString(bigDecimals));

    float[] fArr = new float[bigDecimals.length];

    for (int i = 0; i < bigDecimals.length; i++) {
      fArr[i] = bigDecimals[i].floatValue();
    }

    System.out.println(Arrays.toString(fArr));
  }
}
