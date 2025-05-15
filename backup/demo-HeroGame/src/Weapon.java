public class Weapon {

  private static final int[][] DoranValue = new int[][]{{10,20,30},{0,0,0}};
  private static final int[][] HexdrinkerValue = new int[][]{{20,40,60},{0,0,0}};

  private WeaponName name;
  private int level;



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


}
