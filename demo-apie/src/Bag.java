public class Bag {
  private Ball[] balls;

  public Bag() {
    this.balls = new Ball[5];
  }

  public int getSize() {
    return this.balls.length;
  }

  public boolean isEmpty() {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] != null) {
        return false;
      }
    }
    return true;
  }

  public boolean isFull() {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        return false;
      }
    }
    return true;
  }

  public boolean add(Ball newBall) {
    for (int i = 0; i < this.balls.length; i++) {
      if (this.balls[i] == null) {
        this.balls[i] = newBall;
        return true;
      }
    }
    return false;
  }

  public Ball pick(int index) {
    if (index < 0 || index >= this.balls.length)
      return null;
    Ball target = this.balls[index];
    this.balls[index] = null;
    return target;
  }

  public static void main(String[] args) {
    // Primitive (default values)
    // Class (String, BigDecimal, Ball, Cat, etc) -> (default: null)
    String s = null;
    System.out.println(s.length()); // s is not able to find the string object.
  }
}
