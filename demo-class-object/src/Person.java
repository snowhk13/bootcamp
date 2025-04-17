import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  private String name;
  private double height;
  private double weight;


  public void setName(String name){
    this.name = name;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }


  public String getName(){
    return this.name;
  }
  public double getHeight(){
    return this.height;
  }
  
  public double getWeight(){
    return this.weight;
  }
  

  
  public double getBmi(){
    double x;
    BigDecimal tempH = BigDecimal.valueOf(this.height).divide(BigDecimal.valueOf(100));
    x = BigDecimal.valueOf(this.weight).divide(tempH.pow(2),2,RoundingMode.HALF_UP).doubleValue();
    
    return x;
  }

  public String getWeightStatus(){
    double x = this.getBmi();

    if(x < 18.5){
      return "Underweight";
    }else if(x >= 18.5 && x < 25.0){
      return "Normal";
    }else if(x >= 25.0 && x < 30.0){
      return "Overweight";
    }else{
      return "Obese";
    }
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("Peter");
    p1.setHeight(175);
    p1.setWeight(65);

    Person p2 = new Person();
    p2.setName("Tom");
    p2.setHeight(176);
    p2.setWeight(79);

    System.out.println(p1.getName() + " BMI is " + p1.getBmi());

    System.out.println(p2.getName() + " BMI is " + p2.getBmi());

    System.out.println(p1.getName() + " Weight Status is " + p1.getWeightStatus());
    
    System.out.println(p2.getName() + " Weight Status is " + p2.getWeightStatus());

  }
  
}
