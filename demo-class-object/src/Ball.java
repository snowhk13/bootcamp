public class Ball {

  // attributes
  private String name;
  private String color;
  private double size;

  // constructor

  // ! by default, implicitly empty constructor exists
  // ! but once you define a new constructor, the empty constructor will dissappear
  public Ball() {

  }

  // Can be more than one constructor
  // All
  public Ball(double size) {
    this.size = size;
  }


  public void setname(String name) {
    this.name = name;
  }

  public void setcolor(String color) {
    this.color = color;
  }

  public void setsize(double size) {
    this.size = size;
  }

  public String getname() {
    return this.name;
  }

  public String getcolor() {
    return this.color;
  }

  public double getsize() {
    return this.size;
  }

  public static void main(String[] args) {

    Ball b1 = new Ball();
    b1.setname("Ball-1");
    b1.setcolor("red");
    b1.setsize(5);

    Ball b2 = new Ball(10);
    b2.setname("Ball-2");
    b2.setcolor("blue");
    

    System.out.println(b1.getname() + "," + b1.getcolor() + "," + b1.getsize());
    System.out.println(b2.getname() + "," + b2.getcolor() + "," + b2.getsize());


  }

}
