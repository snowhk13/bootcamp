import java.math.BigDecimal;
import java.math.RoundingMode;

public class Archer extends Hero{

  public Archer(){
    super();
    super.maxHp = 60;
    super.maxMp = 100;
    super.hp = 80;
    super.mp = 100;
    super.pa = 7;
    super.pd = 7;
    super.ma = 5;
    super.md = 5;
    super.ag = 10;
    super.cc = 10;
    super.cd = 2;
  }

  @Override
  public void levelUp(){
    super.level += 1;
    super.maxHp += 7;
    super.maxMp += 5;
    super.hp = super.maxHp;
    super.mp = super.maxMp;
    super.pa += 2;
    super.pd += 2;
    super.ma += 2;
    super.md += 2;
    super.ag += 4;
    super.cc += 3;
    super.cd = BigDecimal.valueOf(super.pa).multiply(BigDecimal.valueOf(1.5)).setScale(0,RoundingMode.UP).intValue();
  }
  
}
