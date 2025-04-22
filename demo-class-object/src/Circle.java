import java.math.BigDecimal;

public class Circle {

  private double radius;


  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public double getArea() {
    double x = BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))//
        .multiply(BigDecimal.valueOf(Math.PI))//
        .doubleValue();

    return x;

  }
  // BIG (>= 5.0) or SMALL

  public String checkSize() {
    if (this.getArea() >= 5.0)
      return "BIG";
    return "SMALL";
  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setRadius(3.0);
    System.out.println(c1.getArea());
    System.out.println(c1.checkSize());

    Circle c2 = new Circle();
    c2.setRadius(1.0);
    System.out.println(c2.getArea());
    System.out.println(c2.checkSize());
  }

}
