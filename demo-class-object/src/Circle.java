import java.math.BigDecimal;

public class Circle {

  private double radius;


  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getRadius(){
    return this.radius;
  }

  public double getArea(){
  double x = BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(this.radius))//
  .multiply(BigDecimal.valueOf(Math.PI))//
  .doubleValue();

  return x;

  }

  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.setRadius(3.0);
    System.out.println(c1.getArea());
  }
  
}
