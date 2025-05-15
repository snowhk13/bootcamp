public class IntegerPrinter {
      private Integer value;
      

    public IntegerPrinter(Integer value){
        this.value = value;
    }

    public void print(){
        System.out.println(this.value);
    }

public static void main(String[] args) {
  IntegerPrinter p1 = new IntegerPrinter(-10);
  p1.print();
}

}
