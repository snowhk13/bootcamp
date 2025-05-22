package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
@Test
public void testCat(){
    Cat c1 = new Cat("John",13);
// Expect result
Assertions.assertEquals(13,c1.getAge());

// Actual Result
  
}
}
