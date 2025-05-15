public class Panda extends Animal {

  public Panda(String name){
    super(name);
  }

  public static void main(String[] args) {
    Animal p1 = new Panda("Peter");

    System.out.println(p1.getName());
  }

  
}
