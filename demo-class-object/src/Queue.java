public class Queue {
  private Person[] persons;
  
public Person[] getPersons(){
  return this.persons;
}

  public void setPerson(Person[] persons){
    this.persons = persons;
  }

  public Person getHead(){
    return this.persons[0];
  }


  public static void main(String[] args) {
    Queue q1 = new Queue();
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();
     
    p1.setHeight(1.76);
    p1.setWeight(74);
    p2.setHeight(1.64);
    p2.setWeight(70);
    p3.setHeight(1.8);
    p3.setWeight(77);

    Person[] arrP1 = new Person[] {p1,p2,p3};

    q1.setPerson(arrP1);

    System.out.println(q1.persons[0].getHeight());

    

  }

  
}
