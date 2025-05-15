// weapon + PA MA
// weapon level
// warrior -> SWORD
// archer -> BOW
// mage -> STAVE



public class Warrior extends Hero {
  // revise to 2D array

  private Weapon weapon;


  public static final int[][] levelValue = new int[][] {
      {200, 50, 10, 5, 8, 4, 20, 40, 5}, {300, 100, 15, 8, 8, 4, 20, 40, 5},
      {400, 200, 20, 12, 8, 4, 20, 40, 5}};

  public Warrior() {
    super(1, levelValue[0][0], levelValue[0][1]); // All objects should start with level 1
  }

  public int getMaxHp() {
    return Warrior.levelValue[super.getLevel() - 1][0];
  }

  public double getCDPercent() {
    int myCDP = -1;
    myCDP = Warrior.levelValue[super.getLevel() - 1][6];
    int extraCDP = isLowHP() ? 20 : 0;
    return (myCDP + extraCDP) / 100.0;
  }

  public boolean isLowHP() {
    int myMaxHP = -1;
    myMaxHP = Warrior.levelValue[super.getLevel() - 1][0];
    return super.getHp() / myMaxHP < 0.2;
  }

  public boolean equipWeapon(WeaponName name,int level){
    System.out.println(name.getJob().equals(this.getClass().getName()));
    this.weapon = new Weapon(name, level);
    return true;
  }

    public Weapon getWeapon() {
    return weapon;
  }



  public static void main(String[] args) {
    Warrior w1 = new Warrior();
    // System.out.println(w1.getClass().getName()); // 200
    w1.equipWeapon(WeaponName.Doran,1);

    // System.out.println(w1.getWeapon().getName());



  }

}
