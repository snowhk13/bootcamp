import java.math.BigDecimal;

public class Cart {

  private Item[] items;

  public Cart(){
    this.items = new Item[0];
  }

  public int size(){
    return this.items.length;
  }

  // Item.java -> price , quantity
  public void add(Item item){
  Item[] newitem = new Item[this.items.length+1];
  for(int i=0;i<this.items.length;i++){
    newitem[i] = this.items[i];
  }
  newitem[newitem.length-1] = item;

  this.items = newitem;
  }

  public void setItems(Item[] items){
    this.items = items;
  }

  public Item[] getItems(){
    return this.items;
  }

  // checkoutAmount()

  public double checkoutAmount(){
    double result = 0;
 for(int i=0;i<this.items.length;i++){
  result =  BigDecimal.valueOf(this.getItems()[i].amount()).add(BigDecimal.valueOf(result)).doubleValue();
 }

 return result;
  }


  public static void main(String[] args) {
    Item i1 = new Item();
    Item i2 = new Item();
    Item i3 = new Item();

    i1.setPrice(99);
    i1.setQuantity(2);

    i2.setPrice(33);
    i2.setQuantity(3);

    i3.setPrice(20);
    i3.setQuantity(1);

    Cart c1 = new Cart();

    Item[] arrI = new Item[] {i1,i2,i3};
    c1.setItems(arrI);

    Item i4 = new Item();
    i4.setPrice(50);
    i4.setQuantity(1);

    c1.add(i4);

    System.out.println(c1.checkoutAmount());
    System.out.println(c1.size());

    Item i5 = new Item(20,2);
    c1.add(i5);

    System.out.println(c1.checkoutAmount());
    System.out.println(c1.size());


    

  }
  
}
