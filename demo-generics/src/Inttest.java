import java.util.ArrayList;

public class Inttest {
  private int[] values;

 
  public Inttest(){
    this.values = new int[]{1,2,3};
  }

   public int[] getValues() {
    return values;
  }

    public void setValues(int[] values) {
    this.values = values;
  }

  public static void main(String[] args) {

    Inttest i1 = new Inttest();

    System.out.println(i1.getValues()[0]);
  }
  
  
}
