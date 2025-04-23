// ! One to One: One Person has one height and one weight

// ! One to Many

import java.util.Arrays;

public class Classroom {
  private String[] names; //stores String array address
  private String tutor;

  public void setNames(String[] names){
    this.names = names;
  }

  public void setTutor(String tutor){
    this.tutor = tutor;
  }

  public String[] getNames(){
    return this.names;
  }
 
  public static void main(String[] args) {
    Classroom c1 = new Classroom();
     String[]  students = new String[]{"John","Mary"};
    c1.setNames(students);

    System.out.println(c1.getNames()[0]);
    
    

    for(int i=0; i<c1.getNames().length;i++){
        System.out.println(c1.getNames()[i]);
    }

    for(int i=0; i<c1.getNames().length;i++){
      if(c1.getNames()[i].equals("Mary")){
        c1.getNames()[i] = "Steven";
        break;
      }
    }
  System.out.println(Arrays.toString(c1.getNames()));
  }
  
}
