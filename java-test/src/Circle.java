public class Circle {
  String name;
  int length;
  int size;

  public Circle(String name, int length, int size){
    this.name = name;
    this.length = length;
    this.size = size;
  }

  public void displaydata(){
    System.out.println(name);
    System.out.println(length);
    System.out.println(size);
  }

  public int reName(){
  int res1 = this.size + this.length;
  return res1;
  }

  public static void main(String[] args){
    Circle cir1 = new Circle("tom",10,100);

  }
}
