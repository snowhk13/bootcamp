


public abstract class Hero {
    private int level;
    private int hp;
    private int mp;
    private WeaponName weaponName;
    private int weaponLevel;
  
    public Hero(int level, int hp, int mp) {
      this.level = level;
      this.hp = hp;
      this.mp = mp;
      this.weaponName = weaponName.empty;
      this.weaponLevel = 1;
    }
  
    public int getLevel() {
      return this.level;
    }
  
    public int getHp() {
      return this.hp;
    }

    public WeaponName getWeaponName() {
      return weaponName;
    }

    public int getWeaponLevel() {
      return weaponLevel;
    }

    public boolean weaponLevelUp(){
      if(this.weaponName.equals(weaponName.empty)){
        System.out.println("You do not have weapon.");
        return false;
      }

      if(this.weaponLevel >= 3){
        this.weaponLevel = 3;
        return false;
      }else{
      this.weaponLevel++;
       return true;
      }
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

    public boolean equipWeapon(WeaponName name,int weaponLevel){
      if(name.getJob().equals(this.getClass().getName())){
        this.weaponName = name;
        this.weaponLevel = weaponLevel;
      System.out.println("The " +this.getClass().getName() + " equip a " + this.weaponName +".");
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