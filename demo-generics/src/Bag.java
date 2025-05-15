import java.util.ArrayList;

public class Bag<T extends LifeGood> {

  private ArrayList<T> things;

  public Bag(){
    this.things = new ArrayList<>();
  }

  public ArrayList<T> getThings(){
    return this.things;
  }

  public void add(T thing){
    this.things.add(thing);
  }
  
  public T get(int x){
    return this.things.get(x);
  }

  public int getSize(){
    return this.things.size();
  }

  public static void main(String[] args) {
    Bag<LifeGood> bag1 = new Bag<>();
    Bag<Food> bag2 = new Bag<>();
    Bag<Water> bog3 = new Bag<>();

    


  }

  
}
