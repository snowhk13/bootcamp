public class BirdOwner {

  private Bird head;

  public BirdOwner(){

  }

  public BirdOwner(Bird head){
    this.head = head;
  }


  public void add(Bird bird){
    if(this.head == null){
      this.head = bird;
      return;
    }
    Bird temp = this.head;
    while(temp != null){
      if(temp.getNext() == null){
        break;
      }
      temp = temp.getNext();
    }
    temp.setNext(bird);
  }

  public Bird lastBird(){
       if(this.head == null){    
      return null;
    }
    Bird temp = this.head;
    while(temp.getNext() != null){
      temp = temp.getNext();
    }
    return temp;
  }

  public static void main(String[] args) {
    BirdOwner bo = new BirdOwner(
    new Bird("vincent", new Bird("niko",new Bird("ricky",null))));

    Bird jacky = new Bird("jacky",null);
    bo.add(jacky);
    bo.add(new Bird("alex",null));
    System.out.println(bo.lastBird().getName());
  }
  
}
