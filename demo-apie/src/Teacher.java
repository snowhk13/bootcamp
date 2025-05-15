import java.util.Arrays;

public class Teacher {

    private Candy[] candybag;
    private Child[] childs;



    private int idx;
    private int childIdx;

    public Teacher(){
        this.candybag = new Candy[20];
        this.childs = new Child[6];
        this.idx = 0;
        this.childIdx = 0;
    }

    public Child[] getChilds() {
        return childs;
    }

    public Candy[] getCandybag() {
        return candybag;
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

    public boolean classIsFull(){
        for(int i=0;i<this.childs.length;i++){
          if(this.childs[i] == null){
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

    public boolean addChild(Child child){
        if(classIsFull()){
            System.out.println("the Class is full");
            return false;
        }
       
        this.childs[this.childIdx] = child;
        this.childIdx++;
        return true;     
    }

    public boolean autoFill(){
        if(isFull()){
            System.out.println("the bag is full");
            return false;
        }
        String candyColor = "RED"; 
        for(int i=0;i<candybag.length;i++){
            if(!isFull()){
                this.candybag[i] = new Candy(candyColor);
            }
            if(candyColor.equals("RED")){
              candyColor = "PURPLE";
            }else if(candyColor.equals("PURPLE")){
                candyColor = "YELLOW";
            }else if(candyColor.equals("YELLOW")){
                candyColor = "BLUE";
            }else{
                candyColor = "RED";
            }
        }
        this.idx = 19;
        return true;
    }

    public boolean distributes(){
        int count = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<this.childs.length;j++){
          if(isEmpty()){
            return false;
          }else{
           Candy tempCandy = this.candybag[count];
           
           this.childs[j].add(tempCandy);
           this.candybag[count] = null;           
           count++;
          }
        }
        }
        return true;
    }

      public String showBag(){
    
    String[] str = new String[this.candybag.length];

    for(int i=0;i<candybag.length;i++){
      if(this.candybag[i] == null){
      break;
      }else{
        str[i] = this.candybag[i].getColor();
      }
    }
    return Arrays.toString(str);
  }


    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Child c1 = new Child();
        Child c2 = new Child();
        Child c3 = new Child();
        Child c4 = new Child();
        Child c5 = new Child();
        Child c6 = new Child();
        t1.addChild(c1);
        t1.addChild(c2);
        t1.addChild(c3);
        t1.addChild(c4);
        t1.addChild(c5);
        t1.addChild(c6);
        
         t1.autoFill();

        System.out.println(t1.showBag());
        System.out.println(t1.childIdx);
        t1.distributes();
       
        
        
        //  System.out.println(t1.childs[0].showBag());
        //  System.out.println(t1.childs[1].showBag());
        //  System.out.println(t1.childs[2].showBag());
        //  System.out.println(t1.childs[3].showBag());
        //  System.out.println(t1.childs[4].showBag());
        //  System.out.println(t1.childs[5].showBag());

        // System.out.println(t1.getCandybag().length);
        // System.out.println(t1.isEmpty());

        // for(int i=0;i<t1.getCandybag().length;i++){
        //     System.out.println(t1.getCandybag()[i].getColor());
        // }


  
    }
    
}
