


public abstract class Hero {
    private int level;
    private int hp;
    private int mp;
    private Weapon weapon;
  


    public Hero(int level, int hp, int mp) {
      this.level = level;
      this.hp = hp;
      this.mp = mp;
      this.weapon = new Weapon();
    }
  
    public int getLevel() {
      return this.level;
    }
  
    public int getHp() {
      return this.hp;
    }

    public Weapon getWeapon() {
      return weapon;
    }
  
    public boolean isAlive() {
      return this.hp >= 0;
    }
  
    public void levelUp() {
      this.level++;
      if(this.level > 3){
        this.level = 3;
      }
        this.hp = Warrior.levelValue[this.getLevel()-1][0];
        this.mp = Warrior.levelValue[this.getLevel()-1][1];

    }

    public boolean equipWeapon(WeaponName name,int level){
      if(name.getJob().equals(this.getClass().getName())){
      this.weapon = new Weapon(name, level);
      System.out.println("The " +this.getClass().getName() + " equip a " + name +".");
      return true;
      }else{
        System.out.println("Your job cannot equip this Weapon!!");
        return false;
      }
    }

    public String className(){
      return this.getClass().getName();
    }
  }