public class BirdOwner {
  // ! Array implementation
  // private Bird[] birds;
  // ! ArrayList implementation
  // private ArrayList<Bird> birds;

  // ! LinkedList underlying implementation
  private Bird head;

  public BirdOwner() {

  }

  public BirdOwner(Bird head) {
    this.head = head;
  }

  public void add(Bird bird) {
    if (this.head == null) {
      this.head = bird;
      return;
    }
    Bird temp = this.head;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(bird);
  }

  public Bird lastBird() {
    if (this.head == null) {
      return null;
    }
    Bird temp = this.head;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    return temp;
  }

  // equals(), toString(), hashCode()

  public static void main(String[] args) {
    BirdOwner bo = new BirdOwner();
    bo.add(new Bird("vincent", null));
    bo.add(new Bird("niko", null));
    bo.add(new Bird("jacky", null));
    bo.add(new Bird("alex", null));
    System.out.println(bo.lastBird().getName()); // alex
  }
}