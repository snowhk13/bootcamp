import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class DataStructureExercise {
    public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    List<Integer> list1 = new ArrayList<>(List.of(10,20,30,40,50));
System.out.println(list1);
list1.removeIf(n->n == 30);

System.out.println(list1.size());


    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    List<String> list2 = new ArrayList<>(List.of("Apple", "Banana", "Mango","Orange"));
if(!(list2.contains("Grapes"))){
  list2.add("Grapes");
}

System.out.println(list2);

for(int i=0;i<list2.size();i++){
  if(list2.get(i).equals("Grapes")){
    list2.set(i,"Peach");
  }
}

System.out.println(list2);
 
    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
List<Integer> list3 = new ArrayList<>(List.of(10, 20, 10, 30, 40, 20, 50));
HashSet<Integer> set3 = new HashSet<>(list3);
System.out.println(set3);

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
HashSet<String> set4 = new HashSet<>(List.of("USA", "India", "China", "Japan"));
set4.add("Canada");
set4.add("India");
System.out.println(set4);
    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
HashSet<Double> set5 = new HashSet<>(List.of(1.1, 2.2, 3.3, 4.4, 5.5));
if(set5.contains(3.3)){
  set5.removeIf(n->n == 2.2);
}

System.out.println(set5.size());
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
HashSet<Integer> set6a = new HashSet<>(List.of(10, 20, 30, 40));
HashSet<Integer> set6b = new HashSet<>(List.of(30, 40, 50, 60));
List<Integer> list6 = new ArrayList<>();
for(int x : set6a){
  if(set6b.contains(x)){
    list6.add(x);
  }
}

System.out.println(list6);
    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
HashSet<String> set7 = new HashSet<>(List.of("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
ArrayList<String> list7 = new ArrayList<>(set7);
System.out.println(list7);
    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    ArrayList<Student> list8 = new ArrayList<>();
    list8.add(new Student(1,"Alice"));
    list8.add(new Student(2,"Bob"));
    list8.add(new Student(3,"Charlie"));
list8.removeIf(p->p.getName().equals("Bob"));


System.out.println(findStudent(list8, 1));
List<Student> list8b = new ArrayList<>();
for(Student s : list8){
  if(s.getName().startsWith("A")){
    list8b.add(s);
  }
}
for(Student s : list8b){
System.out.println(s.getName());
}

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
HashSet<Student> set9a = new HashSet<>(List.of(new Student(1,"Alice"),new Student(2,"Bob"),new Student(3,"Charlie")));
HashSet<Student> set9b = new HashSet<>(List.of(new Student(2,"Bob"),new Student(3,"Charlie"),new Student(4,"David")));
HashSet<Student> set9c = new HashSet<>();
for(Student s:set9a ){
  if(set9b.contains(s)){
    set9c.add(s);
  }
}

System.out.println(set9c);
  }

  public static String findStudent(List<Student> students,int id){
    for(Student s:students){
      if(s.getId()==id){
        return s.getName();
      }
    }
    return "Student not found";
  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id,String name){
      this.id = id;
      this.name = name;
    }

    public int getId(){
      return this.id;
    }
    public String getName(){
      return this.name;
    }

    public void setId(int id){
      this.id = id;
    }

    public void setName(String name){
      this.name = name;
    }
    @Override
    public String toString(){
      return "Student(id="
      +id
      +",name="
      +name
      +")";
    }
    @Override
    public boolean equals(Object obj){
      if(this == obj){
        return true;
      }

      if(!(obj instanceof Student)){
        return false;
      }

      Student student = (Student) obj;

      return Objects.equals(this.id, student.getId());
    }

    @Override
    public int hashCode(){
      return Objects.hash(this.id);
    }
    // getter, setter, etc.
  }
}
