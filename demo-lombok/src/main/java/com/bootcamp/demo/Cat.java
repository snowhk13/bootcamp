package com.bootcamp.demo;

import java.util.Objects;

public class Cat extends Animal {
  private int age;
  // private double height;

  public Cat(String name, int age) {
    super(name);
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // equals, hashCode, toString
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Cat))
      return false;
    Cat cat = (Cat) obj;
    return this.age == cat.getAge() && super.getName().equals(cat.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.age, super.getName());
  }

  @Override
  public String toString() {
    return "Cat(" + "name=" + super.getName() + ",age=" + this.age + ")";
  }
}
