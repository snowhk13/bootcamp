public class Staff {
  private long id;

  public Staff(long id) {
    this.id = id;
  }

  public long getId() {
    return this.id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Staff))
      return false;
    Staff staff = (Staff) obj;
    return staff.getId() == this.id;
  }
}