import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape{

  private double base;
  private double height;

  public Triangle(String color,double base,double height){
    super(color);
    this.base = base;
    this.height = height;
  }

  public double getBase(){
    return this.base;
  }
  public double getHeight(){
    return this.height;
  }

  public void setBase(double base){
    this.base = base;
  }
  public void setHeight(double height){
    this.height = height;
  }
  @Override
  public double area(){
    return (BigDecimal.valueOf(this.base).multiply(BigDecimal.valueOf(this.height)))
    .divide(BigDecimal.valueOf(2),2,RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    Triangle t1 = new Triangle("RED", 7, 5);

    System.out.println(t1.area());
  }
  
}
