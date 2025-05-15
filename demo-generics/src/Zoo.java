import java.util.ArrayList;

public class Zoo {
  ArrayList<Animal> animals;

  public Zoo(){
    this.animals = new ArrayList<>();
  }

  public void add(Animal animal){
    this.animals.add(animal);
  }

  public static void main(String[] args) {

    Zoo zoo = new Zoo();
    zoo.add(new Lion());
    zoo.add(new Cat());
    
  }
  
}
