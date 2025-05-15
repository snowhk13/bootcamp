import java.math.BigDecimal;
import java.math.RoundingMode;

public class Mage extends Hero{
  
  public Mage(){
    super();
    super.maxHp = 80;
    super.maxMp = 50;
    super.hp = 80;
    super.mp = 50;
    super.pa = 2;
    super.pd = 2;
    super.ma = 10;
    super.md = 10;
    super.ag = 2;
    super.cc = 5;
    super.cd = 5;
  }

  @Override
  public void levelUp(){
    super.level += 1;
    super.maxHp += 6;
    super.maxMp += 10;
    super.hp = super.maxHp;
    super.mp = super.maxMp;
    super.pa += 1;
    super.pd += 1;
    super.ma += 3;
    super.md += 3;
    super.ag += 1;
    super.cc += 2;
    super.cd = BigDecimal.valueOf(super.pa).multiply(BigDecimal.valueOf(2)).setScale(0,RoundingMode.UP).intValue();
  }
}
