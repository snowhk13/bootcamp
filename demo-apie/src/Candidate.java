public class Candidate {

  private String name;
  private ExamSubject[] examSubjects;

  public Candidate(String name){
    this.name = name;
    this.examSubjects = new ExamSubject[3];
  }

  public void attendEnglishSubject(){
    this.examSubjects[0] = ExamSubject.ofEnglish();
  }
  public void attendMathSubject(){
    this.examSubjects[1] = ExamSubject.ofMath();
  }
  public void attendHistorySubject(){
    this.examSubjects[2] = ExamSubject.ofHistory();
  }

  public String getName() {
    return name;
  }
  public ExamSubject[] getExamSubjects() {
    return examSubjects;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof Candidate)){
      return false;
    }

    Candidate candidate = (Candidate) obj;

    return candidate.getName().equals(this.name);
  }

  public void setEnglish(int score){
    this.examSubjects[0].setScore(score);
  }
  public void setMath(int score){
    this.examSubjects[1].setScore(score);
  }
  public void setHistory(int score){
    this.examSubjects[2].setScore(score);
  }

  public int getEnglishSocre(){
    if(this.examSubjects[0] != null){
    return this.getExamSubjects()[0].getScore();
    }else{
      System.out.println("The candidate didn't attend the English Exam");
      return -1;
    }
  }
  public int getMathSocre(){
    if(this.examSubjects[1] != null){
      return this.getExamSubjects()[1].getScore();
      }else{
        System.out.println("The candidate didn't attend the Math Exam");
        return -1;
      }
  }
  public int getHistorySocre(){
    if(this.examSubjects[2] != null){
      return this.getExamSubjects()[2].getScore();
      }else{
        System.out.println("The candidate didn't attend the History Exam");
        return -1;
      }
  }

  public ExamSubject getEnglishSubject(){
    return this.examSubjects[0];
  }
  public ExamSubject getMathSubject(){
    return this.examSubjects[1];
  }
  public ExamSubject getHistorySubject(){
    return this.examSubjects[2];
  }

  public static void main(String[] args) {
    Candidate c1 = new Candidate("Peter");
    c1.attendEnglishSubject();
    c1.setEnglish(70);
    // c1.setMath(80);
    // c1.setHistory(40);

    Candidate c2 = new Candidate("Mary");
    c2.attendEnglishSubject();
    c2.setEnglish(30);
    // c2.setMath(50);
    // c2.setHistory(100);

    System.out.println(c1.getEnglishSocre());
    // System.out.println(c1.getMathSocre());
    // System.out.println(c1.getHistorySocre());

    System.out.println(c2.getEnglishSocre());
    // System.out.println(c2.getMathSocre());
    // System.out.println(c2.getHistorySocre());


    System.out.println(c1.getExamSubjects()[0].equals(c2.getExamSubjects()[0]));
    System.out.println(c1.getEnglishSubject().getId());
  }
  
}
