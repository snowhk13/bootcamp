public class DemoOperator {

  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);

    int y = 2;
    x = ++y + 1;
    System.out.println(x);
    System.out.println(y);

    x = y++ + 1;
    System.out.println(x);
    System.out.println(y);

      y = 8;
      x = ++y + ++y + 2;
      System.out.println(x);
      System.out.println(y);

      y = 8;
      x = y++ + y++ 2;
      System.out.println(x);
      System.out.println(y);

  }

}
