


public abstract class Hero {
    private int level;
    private int hp;
    private int mp;
  
    public Hero(int level, int hp, int mp) {
      this.level = level;
      this.hp = hp;
      this.mp = mp;
    }
  
    public int getLevel() {
      return this.level;
    }
  
    public int getHp() {
      return this.hp;
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
  }