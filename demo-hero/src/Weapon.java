public class Weapon {

       private static final int[][] DoranValue = new int[][]{{10,0},{20,0},{30,0}};
  private static final int[][] HexdrinkerValue = new int[][]{{20,0},{40,0},{60,0}};
     private static final int[][] RecurveValue = new int[][]{{10,0},{20,0},{30,0}};
     private static final int[][] GuinsooValue = new int[][]{{20,0},{40,0},{60,0}};

   private static final int[][] ArchangelValue = new int[][]{{0,10},{0,20},{0,30}};
     private static final int[][] LiandryValue = new int[][]{{0,20},{0,40},{0,60}};

  private WeaponName name;
  private int level;

  public Weapon(){
    this.name = WeaponName.empty;
    this.level = 1;
  }
  
  public Weapon(WeaponName name,int level){
    this.name = name;
    this.level = level;
    
  }

  public WeaponName getName() {
    return name;
  }

  public int getLevel() {
    return level;
  }

  public boolean levelUp(){
    if(this.level >= 3){
      this.level = 3;
      return false;
    }else{
    this.level++;
     return true;
    }
  }

  public int getPhysicalAttack(){
    switch(this.name){

      case Doran:
      return DoranValue[this.level-1][0];
      
      case Hexdrinker:
      return HexdrinkerValue [this.level-1][0];
      
      case Recurve:
      return RecurveValue[this.level-1][0];
      
      case Guinsoo:
      return GuinsooValue[this.level-1][0];
      
      case Archangel:
      return ArchangelValue[this.level-1][0];
      
      case Liandry:
      return LiandryValue [this.level-1][0];
      
      default:
      return 0;
    }
  }

  public int getMagicalAttack(){
    switch(this.name){

      case Doran:
      return DoranValue[this.level-1][1];
      
      case Hexdrinker:
      return HexdrinkerValue [this.level-1][1];
      
      case Recurve:
      return RecurveValue[this.level-1][1];
      
      case Guinsoo:
      return GuinsooValue[this.level-1][1];
      
      case Archangel:
      return ArchangelValue[this.level-1][1];
      
      case Liandry:
      return LiandryValue [this.level-1][1];
      
      default:
      return 0;
    }
  }


}
