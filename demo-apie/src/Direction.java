public enum Direction {

  EAST(1),
  SOUTH(2),
  WEST(3),
  NORTH(4),
  ;

  private int value;

  private Direction(int value){
   this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  public static void main(String[] args) {
    System.out.println();
  }

  
}
