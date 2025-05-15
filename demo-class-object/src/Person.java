import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight
  private double height;
  private double weight;

  public Person(){

  }

  public Person(double height,double weight){
    this.height = height;
    this.weight = weight;
  }

  // getter
  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  // setter
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  // getBMI (weight / height^2)
  public double getBMI() { // presentation
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }
  public static double getBMI(double weight,double height){
    
    return BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(Math.pow(height, 2)),2,RoundingMode.HALF_UP).doubleValue();
 
  }

  public static String getWeightStatus(double weight,double height){
   double bmi = BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(Math.pow(height, 2)),2,RoundingMode.HALF_UP).doubleValue();

   if (bmi < 18.5) {
    return "Underweight"; // "return" -> exit method
  } else if (bmi >= 18.5 && bmi < 25.0) {
    return "Normal";
  } else if (bmi >= 25.0 && bmi < 30.0) {
    return "Overweight";
  }
  return "Obese";

  }

  // getWeightStatus (presentation)
  public String getWeightStatus() {
    double bmi = this.getBMI();
    if (bmi < 18.5) {
      return "Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >= 25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public boolean equals(Person person){
    return this.height == person.getHeight()
    && this.weight == person.getWeight();
  }
  public String toString(){
    return "Person(Height is " + this.getHeight() +" , Weight is "+ this.getWeight() + ")";
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    System.out.println(p1.getHeight()); // 0.0
    System.out.println(p1.getWeight()); // 0.0

    p1.setHeight(1.76);
    p1.setWeight(79);
    System.out.println(p1.getBMI()); // 24.54
    System.out.println(p1.getWeightStatus()); // Overweight

    Person p3 = new Person(1.80,80);

    System.out.println(p3.getHeight());
    System.out.println(p3.getWeight());

    System.out.println(getBMI(76, 1.76));

    System.out.println(getWeightStatus(76, 1.76));

    System.out.println(p3.toString()); //Person(Height is 1.8 , Weight is 80.0)
     //自動CALL toString()
    System.out.println(p3); // Person(Height is 1.8 , Weight is 80.0)

    Person p4 = new Person(1.80,80);

    System.out.println(p3.equals(p4));
    System.out.println(p3.equals(p1));

  }
}