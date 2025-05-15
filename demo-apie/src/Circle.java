import java.math.BigDecimal;

public class Circle extends Shape{
  private double radius;



 public Circle(String color,double redius){
  super(color);
  this.radius = redius;
 }
  
 public double getRadius() {
  return radius;
}

public void setRadius(double radius) {
  this.radius = radius;
}

@Override
public double area(){
  return BigDecimal.valueOf(this.radius).
  multiply(BigDecimal.valueOf(this.radius)).
  multiply(BigDecimal.valueOf(Math.PI)).doubleValue();

}

}
