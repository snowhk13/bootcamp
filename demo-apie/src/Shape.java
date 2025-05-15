import java.math.BigDecimal;

public abstract class Shape {
  private String color;
  
  public Shape(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }
  public abstract double area();

  public static void main(String[] args) {
    
    // Shape shape = new Shape("RED");
    // Circle c1 = new Circle("BLUE",12);

    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle("RED",6);
    shapes[1] = new Triangle("BLUE",3,3);
    shapes[2] = new Triangle("YELLOW",5,2);

    double totalArea = 0;
    for(int i=0;i<shapes.length;i++){
      totalArea = BigDecimal.valueOf(totalArea).
      add(BigDecimal.valueOf(shapes[i].area())).
      doubleValue();
    }

    System.out.println(totalArea);


  }

}
