public class SuperArrayList<T> {
  private T[] values;

  // constructor
  public SuperArrayList() {
    this.values = (T[]) new Object[0];
  }

  // get
  // public T[] getValues() {
  // return this.values;
  // }
  public T get(int index) {
    if (index < 0 || index >= this.values.length)
      return null;
    return this.values[index];
  }

  public int size() {
    return this.values.length;
  }

  // set

  // add
  public void add(T value) {
    T[] newValues = (T[]) new Object[this.values.length + 1];
    for (int i = 0; i < this.values.length; i++) {
      newValues[i] = this.values[i];
    }
    newValues[newValues.length - 1] = value;
    this.values = newValues;
  }

  public static void main(String[] args) {
    SuperArrayList<String> strings = new SuperArrayList<>();
    strings.add("abc");
    strings.add("def");
    // ArrayList -> naturally support for-each
    // for (String s : strings) { }

    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    }
  }


}
