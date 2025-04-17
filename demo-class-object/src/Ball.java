public class Ball {

  private String name;
  private String color;
  private char size;

  public void setname(String name){
    this.name = name;
  }
  public void setcolor(String color){
    this.color = color;
  }
  public void setsize(char size){
    this.size = size;
  }

  public String getname(){
    return this.name;
  }
  public String getcolor(){
    return this.color;
  }
  public char getsize(){
    return this.size;
  }

  public static void main(String[] args) {

    Ball b1 = new Ball();
    b1.setname("Ball-1");
    b1.setcolor("red");
    b1.setsize('L');

    Ball b2 = new Ball();
    b2.setname("Ball-2");
    b2.setcolor("blue");
    b2.setsize('M');

    System.out.println(b1.getname()+","+b1.getcolor()+","+b1.getsize());
    System.out.println(b2.getname()+","+b2.getcolor()+","+b2.getsize());

    
  }
  
}
