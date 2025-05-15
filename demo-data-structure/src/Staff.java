import java.util.LinkedList;

public class Staff {

  private long id;

  public long getId() {
    return id;
  }

  public Staff(long id){
    this.id = id;
  }

  @Override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if(!(obj instanceof Staff)){
      return false;
    }
    Staff staff = (Staff) obj;

    return staff.getId() == this.getId();
  }
  


  
}
