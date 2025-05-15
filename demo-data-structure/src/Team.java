import java.util.ArrayList;
import java.util.LinkedList;

public class Team {
  // array, ArrayList

  // Usage: 99% same as ArrayList
  private LinkedList<Staff> staffs;

  public Team() {
    this.staffs = new LinkedList<>();
  }

  // Add to tail -> LinkedList
  public void add(Staff staff) {
    this.staffs.add(staff); // No array implementation
  }

  // ArrayList
  public int size() {
    return this.staffs.size();
  }

  public boolean remove(long staffId) {
    return this.staffs.remove(new Staff(staffId));
  }

  public static void main(String[] args) {
    Team team = new Team();
    team.add(new Staff(1L));
    team.add(new Staff(2L));
    System.out.println(team.size()); // 2

    // Staff's equals()
    team.remove(2L);
    System.out.println(team.size()); // 1

    // Difference between ArrayList and LinkedList
    // - Underlying Data Structure: ArrayList (array); LinkedList (object links object)
    // Array
      // 1. Fixed Length, recreate array -> copy elements
      // 2. Locate the element by array position
    // LinkedList
      // 1. stores first and last
      // 2. Each node contains the "previous" and the next

  }
}