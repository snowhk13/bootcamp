package com.bootcamp.demo;

public abstract class Animal {
  private String name;

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Cat c1 = new Cat("John", 13);
    Cat c2 = new Cat("John", 13);
    System.out.println(c2.equals(c2)); // true
  }
}