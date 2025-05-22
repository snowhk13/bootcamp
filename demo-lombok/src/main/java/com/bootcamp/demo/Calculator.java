package com.bootcamp.demo;

import java.util.List;
import java.util.Optional;

public class Calculator {

  public Calculator() {

  }

  // Method A -> Method B -> C -> D -> E -> F

  public int sum(int x, int y) {
    return x + y;
  }

  public static Optional<Dog> findTargetDog(List<Dog> dogs, double superpower,
      String name, double weight, int age) {
    for (Dog dog : dogs) {
      if (dog.equals(new Dog(superpower, name, weight, age))) {
        return Optional.of(dog);
      }
    }
    return Optional.empty();
  }
}
