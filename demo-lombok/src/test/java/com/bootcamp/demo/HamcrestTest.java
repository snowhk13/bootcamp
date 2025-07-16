package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testFindDogListByAge(){
    Dog d1 = new Dog(3.3, "ABC", 3.3, 5);
    Dog d2 = new Dog(3.4, "DEF", 10, 5);
    Dog d3 = new Dog(3.4, "XYZ", 10, 2);
    List<Dog> dogs = new ArrayList<>(Arrays.asList(d1,d2,d3));
    List<Dog> acutalResult = Dog.findDogAgeGreaterThan(dogs, 3);
    assertThat(acutalResult, hasItem(new Dog(3.3,"ABC",3.3,5)));
    assertThat(acutalResult, hasItem(new Dog(3.4,"DEF",10,5)));
    assertThat(acutalResult, not(hasItem(new Dog(3.4,"XYZ",10,2))));
    assertThat(acutalResult, hasSize(2));
  }

  @Test
  void testBasicSyntax(){
    String s1 = "hello";
    String s2 = "world";

    assertThat(s1.concat(s2), is(equalTo("helloworld")));
    assertThat(s1.concat(s2), not(equalTo("hello world")));
    int i1 = 10;
    int i2 = 15;
    assertThat(i1+i2, not(greaterThan(26)));
    assertThat(i1+i2, is(greaterThan(23)));
  
  }
  
}
