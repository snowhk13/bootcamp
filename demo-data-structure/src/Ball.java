import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private int num;


  private Color color;
  public Ball(int num,Color color){
    this.num = num;
    this.color = color;
  }

  @Override
  public int compareTo(Ball ball){
    if(this.color.equals(Color.BLUE) && ball.color.equals(Color.YELLOW)){
        return -1;
    }
    else if(this.color.equals(Color.YELLOW) && ball.color.equals(Color.RED)){
      return -1;
    }
   else if(this.color.equals(Color.BLUE) && ball.color.equals(Color.RED)){
        return -1;
    }else{
       return 1;
    }
}
  

  public int getNum(){
    return this.num;
  }

    public void setNum(int num) {
    this.num = num;
  }
  public Color getColor(){
    return this.color;
  }

  public static enum Color{
  RED,BLUE,YELLOW;
  }

  public String toString(){
    return "Ball("
    + "num=" + this.num
    + " ,Color=" + this.color
    + ")";
  }

  public static void main(String[] args) {
    Ball ball1 = new Ball(1, Color.BLUE);
    Ball ball2 = new Ball(2, Color.YELLOW);
    Ball ball3 = new Ball(3, Color.RED);

    List<Ball> balls = new ArrayList<>();
    balls.add(ball1);
    balls.add(ball2);
    balls.add(ball3);

    ball1.setNum(7);

    // ArrayList<String> arr1 = new ArrayList<>();
    // String t = "1";
    // String y = "2";
    // String z = "3";

    // arr1.add(t);
    // arr1.add(y);
    // arr1.add(z);

    // System.out.println(arr1);

    // t = "8";

    // System.out.println(arr1);

    
    Collections.sort(balls , new SortedByNum());

    // for(Ball x : balls){
    //   System.out.println(x);
    // }

    // Collections.sort(balls);

    System.out.println(balls);
  }
  
}
