package com.bootcamp.demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerOwner {

  private List<Integer> integers;
  private Calculator calculator;

  public IntegerOwner(Calculator calculator,List<Integer> integers){
    this.integers = integers;
    // this.calculator = new Calculator(0, 0);
    this.calculator = calculator;
  }

    public int sumAll(){
    int total = 0;
    for(Integer integer : this.integers){
      //total = new Calculator(total,integer).sum();
      total = this.calculator.sum(total,integer);
    }
    return total;
  }
  
}
