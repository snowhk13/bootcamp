package com.bootcamp.demo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK -> has no lombok
// pom.xml -> add dependency (lombok framework) -> load into your Java project
// So, your project is able to use JDK + lombok

// ! Compile time: java -> class
// Java compiler -> convert Annotation(i.e. @Getter) to normal java code
// JVM executes class files (include generated code by lombok)

// ! Why we can call set/get in VSCode before compilation.
// VSCode -> implicitly compile your java code.

// Special Cases:
// 1. Field level annotation (i.e. Getter, Setter, EqualsAndHashCode)
// 2. callSuper (Parent Class)

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Dog extends SuperAnimal {
  private String name;
  // @ToString.Exclude
  private double weight;
  private int age;

  public Dog(double superpower, String name, double weight, int age) {
    super(superpower);
    this.age = age;
    this.name = name;
    this.weight = weight;
  }

  // All args constructor
  // getter, setter
  // equals, toString, hashCode

  public static List<Dog> findDogAgeGreaterThan(List<Dog> dogs, int age){
    return dogs.stream().filter(d -> d.getAge() > age).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Dog d1 = new Dog();
    d1.setAge(13);
    d1.setName("Peter");
    System.out.println(d1);
    Dog d2 = new Dog("John", 3.76, 10);
    System.out.println(d2);
    Dog d3 = new Dog("John", 3.76, 10); // generated
    System.out.println(d2.equals(d3)); // true
    System.out.println(d3.getName());
    System.out.println(d3.getAge());

    Dog d4 = new Dog(9.99, "John", 3.76, 10);
    Dog d5 = new Dog(100, "John", 3.76, 10);
    System.out.println(d4.equals(d5)); // false
    System.out.println(d4);

    Dog d6 = new Dog(100, "John", 3.76, 10);
    System.out.println(d5.equals(d6));
  }

}
