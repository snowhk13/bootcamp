import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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

    ArrayList<Integer> arr1 = new ArrayList<>(List.of(10,20,30,40,50));
    System.out.println(arr1);
    for(int i=0;i<arr1.size();i++){
      if(arr1.get(i) == 30){
        arr1.remove(i);
      }
    }
    System.out.println(arr1);

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    ArrayList<String> arr2 = new ArrayList<>(List.of("Apple","Banana", "Mango","Orange"));
    boolean grapesExists = false;
    for(String x : arr2){
      if(x.equals("Grapes")){
        grapesExists = true;
      }
    }
    if(!grapesExists){
      arr2.add("Grapes");
    }
 for(int i=0;i<arr2.size();i++){
  if(arr2.get(i).equals("Mango")){
    arr2.set(i,"Peach");
  }
 }

 System.out.println(arr2);


    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.

   List<Integer> arr3 = new ArrayList<>(List.of(10, 20, 10, 30, 40, 20, 50));
   HashSet arr4 = new HashSet<>(arr3);
   System.out.println(arr4);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
HashSet<String> arr5 = new HashSet<>(List.of("USA", "India", "China", "Japan"));
arr5.add("Canada");

System.out.println(arr5);

arr5.add("India");

System.out.println(arr5);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    HashSet<Double> arr6 = new HashSet<>(List.of(1.1, 2.2, 3.3, 4.4, 5.5));
    System.out.println(arr6.contains(3.3));
    arr6.remove(2.2);
    System.out.println(arr6.size());
    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

HashSet<Integer> set1 = new HashSet<>(List.of(10, 20, 30, 40));
HashSet<Integer> set2 = new HashSet<>(List.of(30, 40, 50, 60));
HashSet<Integer> set3 = new HashSet<>();

for(int x : set2){
  if(!set1.add(x)){
  set3.add(x);
  }
}

System.out.println(set3);





    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> stringSet = new HashSet<>(List.of("Cherry", "Steve", "Chole", "Jenny", "Vicky"));
    ArrayList<String> stringArr = new ArrayList<>(stringSet);

    System.out.println(stringArr);

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

    List<Student> studentArr = new ArrayList<>(List.of(new Student(1,"Alice"),new Student(2,"Bob"),new Student(3,"Charlie")));
    
    System.out.println(studentArr);
    for(int i=0;i<studentArr.size();i++){
      if(studentArr.get(i).getName().equals("Bob")){
        studentArr.remove(i);
      }
    }
    System.out.println(studentArr);
    System.out.println(searchId(studentArr, 3));
    List<Student> studentArr2 = new ArrayList<>(List.of(new Student(1,"Alice"),new Student(2,"Bob"),new Student(3,"Charlie")));
    Collections.sort(studentArr2,new SortByName());
    System.out.println(studentArr2);


    

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
HashSet<Student> studentSet1 = new HashSet<>(List.of(new Student(1, "Alice"),
new Student(2, "Bob"),new Student(3, "Charlie")));

HashSet<Student> studentSet2 = new HashSet<>(List.of(new Student(2, "Bob"),
new Student(3, "Charlie"),new Student(4, "David")));

HashSet<Student> studentSet3 = new HashSet<>();
for(Student x : studentSet1){
  if(!(studentSet2.add(x))){
    studentSet3.add(x);
  }
}

System.out.println(studentSet3);



  }

    public static String searchId(List<Student> students,int id){
      for(int i=0;i<students.size();i++){
        if(students.get(i).getID() == id){
           return students.get(i).getName();
        }
      }

      return "Student not found";
    }

   public static class Student {
    private int id;
    private String name;

    // Constructor
    // getter, setter, etc.
    public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
  @Override
  public String toString() {
    return "Student" + "(ID=" + this.id + ",Name=" + this.name + ")";
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
  return this.id == student.getID();
 }

 @Override
 public int hashCode(){
  return Objects.hash(this.id);
 }

  public String getName() {
    return this.name;
  }

  public int getID() {
    return this.id;
  }


  }

  public static class SortByName implements Comparator<Student>  {
  @Override
  public int  compare(Student s1 , Student s2){
    return s1.getName().charAt(0) < s2.getName().charAt(0) ? -1 : 1;
  }
}
}



