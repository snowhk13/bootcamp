import java.util.Arrays;

public class Child {
    // 20 Candy
    // Candy has color (RED, PURPLE, YELLOW)
    // Teacher distributes candy to child (6 children)
    
    // Print out the color of candy per child

    private Candy[] candybag;


    private int idx;

    public Child(){
      this.candybag = new Candy[4];
      this.idx = 0;
    }

    public Candy[] getCandybag() {
      return candybag;
    }

    public void setCandybag(Candy[] candybag) {
      this.candybag = candybag;
    }

    public boolean isFull(){
      for(int i=0;i<this.candybag.length;i++){
        if(this.candybag[i] == null){
            return false;
        }
      }

      return true;
    }

    
    public boolean isEmpty(){
      for(int i=0;i<this.candybag.length;i++){
        if(this.candybag[i] != null){
            return false;
        }
      }

      return true;
    }

    public boolean add(Candy candy){
      if(isFull()){
          System.out.println("the bag is full");
          return false;
      }
     
      this.candybag[this.idx] = candy;
      this.idx++;
      return true;     
  }

  public String showBag(){
    
    String[] str = new String[this.candybag.length];

    for(int i=0;i<candybag.length;i++){
      // System.out.println(this.isEmpty());
      if(this.candybag[i] == null){
      break;
      }else{
        str[i] = this.candybag[i].getColor();
      }
    }
    return Arrays.toString(str);
  }



    

  }