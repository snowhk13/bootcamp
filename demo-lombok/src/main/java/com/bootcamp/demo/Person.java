package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Person {
  private String name;
  private int age;

  public static void main(String[] args) {
    Person p1 = new Person("Tom", 22);
    Person p2 = new Person("Tom", 22);
  System.out.println(p1.getAge());
  System.out.println(p2.getName());
    System.out.println(p1.equals(p2));
  }
}
