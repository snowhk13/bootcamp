public class Weapon {

       private static final int[][] DoranValue = new int[][]{{10,0},{20,0},{30,0}};
  private static final int[][] HexdrinkerValue = new int[][]{{20,0},{40,0},{60,0}};
     private static final int[][] RecurveValue = new int[][]{{10,0},{20,0},{30,0}};
     private static final int[][] GuinsooValue = new int[][]{{20,0},{40,0},{60,0}};

   private static final int[][] ArchangelValue = new int[][]{{0,10},{0,20},{0,30}};
     private static final int[][] LiandryValue = new int[][]{{0,20},{0,40},{0,60}};

     

  public static int getPhysicalAttack(WeaponName weaponName, int weaponLevel){
    switch(weaponName){

      case Doran:
      return DoranValue[weaponLevel-1][0];
      
      case Hexdrinker:
      return HexdrinkerValue [weaponLevel-1][0];
      
      case Recurve:
      return RecurveValue[weaponLevel-1][0];
      
      case Guinsoo:
      return GuinsooValue[weaponLevel-1][0];
      
      case Archangel:
      return ArchangelValue[weaponLevel-1][0];
      
      case Liandry:
      return LiandryValue [weaponLevel-1][0];
      
      default:
      return 0;
    }
  }

  public static int getMagicalAttack(WeaponName weaponName, int weaponLevel){
    switch(weaponName){

      case Doran:
      return DoranValue[weaponLevel-1][1];
      
      case Hexdrinker:
      return HexdrinkerValue [weaponLevel-1][1];
      
      case Recurve:
      return RecurveValue[weaponLevel-1][1];
      
      case Guinsoo:
      return GuinsooValue[weaponLevel-1][1];
      
      case Archangel:
      return ArchangelValue[weaponLevel-1][1];
      
      case Liandry:
      return LiandryValue [weaponLevel-1][1];
      
      default:
      return 0;
    }
  }


}
