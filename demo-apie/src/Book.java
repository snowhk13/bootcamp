public class Book {
  
  private static int count = 0;
  private int id;
  private String bookname;

  public Book(String name){
    count++;
    this.id = count;
    this.bookname = name;
  }

  public int getId() {
    return id;
  }

  public String getBookName(){
  return this.bookname;
  }

  public String toString() {
    return "Book(" 
        + "bookname=" + this.bookname 
        + ")";
  }

  public boolean equals(Object obj){
    if(this == obj) // object address
      return true;
      if(!(obj instanceof Book)) // ! check of obj is an object of Book Class
      return false;

      Book book = (Book) obj;
      return this.id == book.getId();
  }
}
