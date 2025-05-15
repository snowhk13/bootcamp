public class File implements Readable{
  
 private String content;

  @Override
  public void read(){
    System.out.println("I am reading the file: " + this.content);
  }

  public static void main(String[] args) {
    File f1 = new File();

    f1.read();
  }
}
