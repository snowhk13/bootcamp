public class TestQuiz {
  private static int value = calculateValue();
  private static int value2 = calculateValue();

  // instance variable
  private int x = -3;

  public TestQuiz() {
    System.out.println("This is constructor");
  }

  public TestQuiz(int x) {
    this.x = x;
    System.out.println("This is constructor");
  }

  // ! stores common logic for all constructor.
  // ! instance block executes before constructor
  {
    System.out.println(x);
    this.x = 99; //
    System.out.println("this is instance block.");
  }

  // ! static block execute once no matter number of static variable.
  static {
    value = 10;
    System.out.println("this is static block.");
  }

  private static int calculateValue() {
    System.out.println("this is calculateValue.");
    return 100;
  }

  public static enum Color {
    RED(1), BLUE(2);

    private int value;
    private static int num = 1;

    private Color(int value) {
      this.value = value;
      // num++;
    }
  }

  public int getX() {
    return this.x;
  }

  public static void main(String[] args) {
    System.out.println(Color.num);
    System.out.println(Color.RED);

    TestQuiz tq = new TestQuiz();
    System.out.println(tq.getX()); // 99

    TestQuiz tq2 = new TestQuiz(80);
    System.out.println(tq2.getX()); // 99
  }
}
