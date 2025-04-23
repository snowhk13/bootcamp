import java.math.BigDecimal;

public class Order {
   // Static variable (Not related to Object, common values for all objects)
  private static long counter = 0;
  // ! Attributes (belongs to object)
  private long id;
  private Item[] items;


  // ! Constructors
  public Order() {
    this.items = new Item[0];
    ++counter;
    this.id = counter;
  }
//Once we have static variable design, id is not required inputted by user;
 // public Order(long id) {
 //   this.items = new Item[0];
 //   this.id = id;
  //}

  // ! Methods

  public long getId(){
    return this.id;
  }
  public void setItems(Item[] items) {
    this.items = items;
  }

  public Item[] getItems() {
    return items;
  }

  public double Amount() {
    double result = 0;
    for (int i = 0; i < this.items.length; i++) {
      result = BigDecimal.valueOf(this.getItems()[i].amount())
          .add(BigDecimal.valueOf(result)).doubleValue();
    }
    return result;
  }

  public void add(Item item) {
    Item[] newitem = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      newitem[i] = this.items[i];
    }
    newitem[newitem.length - 1] = item;

    this.items = newitem;
  }

  public static void main(String[] args) {
    Item apple = new Item(6.5, 3);
    Order o1 = new Order();
    Order o2 = new Order();
    Order o3 = new Order();
    o1.add(apple);

    System.out.println(o1.Amount());
  }


}
