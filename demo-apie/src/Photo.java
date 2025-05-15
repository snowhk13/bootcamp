public class Photo {
  private static long counter = 0;
  private long id;



  public Photo(){
    this.id = ++counter;
  }

  public long getId(){
    return this.id;
  }

  public boolean equals(Photo phone){
    return this.id == phone.getId();
  }

  public String toString(){
    return "Photo" +
    "(id=" + this.id +
    ")";
  }

  public static void main(String[] args) {
    Photo photo1 = new Photo();
    Photo photo2 = new Photo();
    System.out.println(photo2.getId());
    System.out.println(photo2.toString());
  }
  
}
