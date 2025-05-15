import java.util.Random;

public class Student {
  // A student has a bag
  // A bag has many Balls (5)

  // A ball has a color and a number
  // 3 different colors (RED, YELLOW, BLUE)
  // number 1-9

  // Student actions:
  // 1. place a ball into the bag
  // 2. random pick a ball from bag, return ball.toString() (empty bag -> "Empty Bag!!!")

  private Bag bag;

  public Student() {
    this.bag = new Bag();
  }

  public boolean place(Ball ball) {
    return this.bag.add(ball);
  }

  public Bag getBag() {
    return this.bag;
  }

  public String randomPick() {
    if (this.bag.isEmpty()) {
      return "Empty Bag!!!";
    }
    Ball ball = null;
    while (ball == null) {
      int random = new Random().nextInt(this.bag.getSize()); // 0-4
      ball = this.bag.pick(random);
      if (ball != null) {
        break;
      }
    }
    return ball.toString();
  }

  public static void main(String[] args) {
    Student john = new Student(); // Create Student Object, Bag Object, Ball Array Object

     john.randomPick();
    System.out.println(john.getBag().getSize()); // 5


  }
}
