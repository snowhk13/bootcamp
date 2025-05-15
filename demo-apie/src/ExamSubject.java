import java.util.Objects;

public class ExamSubject {
  //name
  //score
  //Constructor
  //getter,setter
  //equals(),toString,hashCode()
 private static long EXAM_CODE = 0;
  private Subject subject;
  private int score;
  private long id;


  public static ExamSubject ofEnglish(){
    return new ExamSubject (Subject.ENGLISH , ++EXAM_CODE);
  }
  public static ExamSubject ofMath(){
    return new ExamSubject (Subject.MATH, ++EXAM_CODE);
  }
  public static ExamSubject ofHistory(){
    return new ExamSubject (Subject.HISTORY, ++EXAM_CODE);
  }

  public ExamSubject(Subject subject,long id){
   this.subject = subject;
   this.id = id;
  }

  public long getId() {
    return this.id;
  }

  public Subject getSubject() {
    return this.subject;
  }

  public int getScore(){
    return this.score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  


  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof ExamSubject)){
      return false;
    }

    ExamSubject examsubject = (ExamSubject) obj;

    return examsubject.getId() == this.id ;
    
  }

  @Override
  public String toString(){
    return "ExamSubject"
    + "(subject=" 
    + this.subject
    + ",id="
    + this.id
    + ")"
    ;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.id,this.subject);
  }

  public static void main(String[] args) {
    
    ExamSubject e1 = ExamSubject.ofEnglish();
    ExamSubject e2 = ExamSubject.ofEnglish();

    System.out.println(e1.equals(e2));

    System.out.println(e1);

    System.out.println(e1.hashCode());
    System.out.println(e2.hashCode());

    System.out.println(e1.getSubject().name());

  }
  
}
