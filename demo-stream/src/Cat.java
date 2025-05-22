public class Cat implements Flyable {
  @Override
  public void fly() {
    System.out.println("Cat is flying");
  }

  public Cat sleep() {
    System.out.println("Cat is sleeping");
    return this;
  }

  public Cat eat() {
    System.out.println("Cat is eating");
    return this;
  }

  public static void main(String[] args) {
    // new Cat().sleep().eat();
    int x = 3;
    if (x > 2) {
      System.out.println("hello");
    } else {
      System.out.println("goodbye");
    }

    int result = sum(1, 3);
    int y;
    if (result > 3) {
      y = 10;
    } else {
      y = 12;
    }
    // send y value to vincent by sms
  }

  public static int sum(int x, int y) {
    return x + y;
  }
}
