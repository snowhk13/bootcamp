public class Zoo {
  private Animal[] animals;
  // private Cat cat;
  // private Dog dog;

  public Zoo() {
    this.animals = new Animal[3];
    this.animals[0] = new Cat("John", 2);
    this.animals[1] = new Dog("Peter");
    this.animals[2] = new Panda("Vincent");
    // this.cat = new Cat("John", 2);
    // this.dog = new Dog("Peter");
  }
public Animal getPanda(){
  return this.animals[2];
}
public Animal getDog(){
  return this.animals[1];
}
public Animal getCat(){
  return this.animals[0];
}

  public static void main(String[] args) {
    Zoo zoo2 = new Zoo();
    zoo2.getCat().sound();
    zoo2.getDog().sound();

  }
}