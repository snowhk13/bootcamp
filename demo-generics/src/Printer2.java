public class Printer2<T> {

  private T value;

  public Printer2(T value){
  this.value = value;
  }

  public T getValue(){
    return this.value;
  }
  public void setValue(T value){
    this.value = value;
  }
  public static void main(String[] args){

     Printer2<String> p1 = new Printer2<String>("hello");
     Printer2<Integer> p2 = new Printer2<Integer>(11);

     System.out.println(p1.getValue());
     System.out.println();

  }
}
