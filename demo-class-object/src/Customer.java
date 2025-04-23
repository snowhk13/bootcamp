import java.math.BigDecimal;

public class Customer { // blueprint 藍圖
//! Class content

// Attributes
// private -> by default, this object is not readable
private String name;
private String email;
private Order[] orders;

public Customer(){
  this.orders = new Order[0];
}

//VIP ->   >= 10000 (boolean method isVIP())
private boolean isVIP(){

  double orderMoney = 0;
  for(int i=0; i<this.orders.length;i++){
   orderMoney = BigDecimal.valueOf(this.orders[i].Amount()).add(BigDecimal.valueOf(orderMoney)).doubleValue();
  }

  return (orderMoney >= 10000);

}
// ...

// Setter
public void setOrder(Order[] orders){
  this.orders = orders;
}

public void setName(String name){
   this.name = name;
}

public void setEmail(String email){
  this.email = email;
}

//Getter
public Order[] getOrders(){
  return this.orders;
}

public String getName(){
  return this.name;
}

public String getEmail(){
  return this.email;
}
public void add(Order order) {
  Order[] neworder = new Order[this.orders.length + 1];
  for (int i = 0; i < this.orders.length; i++) {
    neworder[i] = this.orders[i];
  }
  neworder[neworder.length - 1] = order;

  this.orders = neworder;
}

// main method is NOT a must for a class file
  public static void main(String[] args) {
    // ! Create Object (new ...)
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");
    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");
    
    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());



    Order order1 = new Order();
    order1.add(new Item(15.3,9));
    order1.add(new Item(2.5,3));
    john.add(order1);

    Order order2 = new Order();
    order2.add(new Item(1000.3,9));
    mary.add(order2);

    System.out.println(mary.isVIP());

    Order order3 = new Order();
    order3.add(new Item(200.5,10));
    mary.add(order3);

    System.out.println(mary.isVIP());
    
    


  }  
}
