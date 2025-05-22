package com.bootcamp.demo;

import static org.mockito.Mockito.times;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
  @Mock
  private Calculator calculator;

  @Test
  void testFindDog() {
    Dog d1 = new Dog(3.3, "John", 1.76, 13);
    Dog d2 = new Dog(3.3, "John", 1.76, 13);
    List<Dog> dogs = new ArrayList<>(Arrays.asList(d1, d2));
    Optional<Dog> actualResult =
        Calculator.findTargetDog(dogs, 3.3, "John", 1.76, 13);
    Assertions.assertEquals(true, actualResult.isPresent());
  }

  @Test
  void testSum() {
    int actualResult = new Calculator().sum(3, 5);
    Assertions.assertEquals(8, actualResult);

    Assertions.assertEquals(6, new Calculator().sum(2, 4));
    Assertions.assertEquals(0, new Calculator().sum(0, 0));
    Assertions.assertEquals(-1, new Calculator().sum(-1, 0));
  }

  @Test
  void testSumAll() { // Testing sumAll()
    // Mock Behavior
    Mockito.when(this.calculator.sum(0, 1)).thenReturn(100);
    Mockito.when(this.calculator.sum(100, 2)).thenReturn(3000);
    Mockito.when(this.calculator.sum(3000, 3)).thenReturn(-1);

    // Prepare data
    List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));

    // Start Testing for sumAll()
    int actualResult = new IntegerOwner(this.calculator, integers).sumAll(); // for loop -> sum()
    // compare result
    Assertions.assertEquals(-1, actualResult);

    Mockito.verify(this.calculator, times(1)).sum(0,1);
    Mockito.verify(this.calculator, times(1)).sum(100,2);
    Mockito.verify(this.calculator, times(1)).sum(3000,3);
  }
}



