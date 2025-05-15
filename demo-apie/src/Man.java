public class Man {
  private static final int FIXED_TURN_DEGREE = 10;
  private int degree = 0;
  
  public int getDegree() {
    return degree;
  }

  public String getDirection(){
    if(this.degree < 45 ){
      return "NORTH"; 
    }else if(this.degree >= 45 && this.degree <135){
      return "EAST";
    }else if(this.degree >=135 && this.degree < 225){
      return "SOUTH";
    }else if(this.degree >= 225 && this.degree < 315){
      return "WEST";
    }else if(this.degree >= 315 && this.degree < 360){
      return "NORTH";
    }else{
      return "UNKNOW";
    }
  }

  public void turnLeft(){
    this.degree -= FIXED_TURN_DEGREE;
    if(this.degree < 0){
      this.degree += 360;
    }
  }

  public void turnRight(){
    this.degree += FIXED_TURN_DEGREE;
    if(this.degree >=360 ){
      this.degree -= 360;
    }
  }

  public static void main(String[] args) {
    Man m1 = new Man();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
   m1.turnLeft();
  
   System.out.println(m1.degree);
   System.out.println(m1.getDirection());

    
  }
}
