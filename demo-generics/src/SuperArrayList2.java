import java.util.ArrayList;

public class SuperArrayList2<T> {

  private T[] values;

  public SuperArrayList2(){
    this.values = (T[]) new Object[0];
  }

  public T[] getValues(){
    return (T[])this.values;
  }

  public void add(T value){
    T[] newValues = (T[]) new Object[this.values.length+1];
    for(int i=0;i<this.values.length;i++){
      newValues[i] = this.values[i];
    }
    newValues[newValues.length -1] = value;
    this.values = newValues;
  }

  public T get(int index){
    return this.values[index];
  }
  
  
  public static void main(String[] args) {
    
    SuperArrayList2<Integer> s1 = new SuperArrayList2<Integer>();

    s1.add(11);
     
    System.out.println(s1.get(0));
  }
}
