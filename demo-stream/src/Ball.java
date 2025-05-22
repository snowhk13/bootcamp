public class Ball {
  private Color color;
  private int number;

  public Ball(Color color, int number) {
    this.color = color;
    this.number = number;
  }

  public static enum Color {
    RED, BLUE,;
  }

  @Override
  public String toString() {
    return "Ball("
      + "color=" + this.color.name()
      + ",number=" + this.number
      + ")";
  }
}
