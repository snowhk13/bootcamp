public class DemoArray {
  public static void main(String[] args) {
    // assign int value 3 into int variable
    int x1 = 3;
    int x2 = 4;
    int x3 = -7;

    // array []
    // right hand side -> creating an array with size 3.
    // left hand side -> assign int array object to int array type (variable)
    int[] arr = new int[3]; // now, we got 3 int boxes able to store 3 int values.

    // write
    // First box (index)
    arr[0] = 3;
    // second box
    arr[1] = 4;
    // third box
    arr[2] = -7;

    for (int i = 0; i < arr.length; i++) { // arr.length -> 3, 0,1,2
      System.out.println(arr[i]);
    }

    // Question: int array with size 5.
    // 10, 7, 4, -100, 6
    int[] arr2 = new int[5]; // 0,1,2,3,4
    arr2[2] = 4;
    arr2[3] = -100;
    arr2[4] = 6;
    arr2[0] = 10;
    arr2[1] = 7;

    // Question: double array with size 4.
    // assign 4 double values into the array
    double[] arr3 = new double[4];
    arr3[0] = 10.3;
    arr3[1] = -4.2;
    arr3[2] = 7.8;

    // read
    System.out.println(arr3[0]); // 10.3
    System.out.println(arr[0]); // 3
    System.out.println(arr2[0]); // 10

    double amount = 99.9;
    arr3[0] = amount; // assign double value into a double variable
    System.out.println(arr3[0]); // 99.9

    // String array
    // size 3, with 3 String value


    // double array, for loop + sysout print out values
    double[] amounts = new double[6];
    amounts[0] = 10.9;
    amounts[3] = 14.1;
    amounts[5] = 99.9;
    for (int i = 0; i < amounts.length; i++) {
      System.out.println(amounts[i]);
    }

    // add 1.5 to all array values
    for (int i = 0; i < amounts.length; i++) {
      // amounts[i] = amounts[i] + 1.5;
      amounts[i] += 1.5;
      System.out.println(amounts[i]);
    }

    // for + if
    // print out those values > 100
    for (int i = 0; i < amounts.length; i++) {
      if (amounts[i] > 100) {
        System.out.println(amounts[i]);
      }
    }

    for (int i = 0; i < amounts.length; i++) {
      if (amounts[i] <= 100) {
        continue;
      }
      System.out.println(amounts[i]);
    }

    // int array
    // Find even number, and then print out "Age=x"
    int[] ages = new int[4];
    ages[0] = 19;
    ages[1] = 14;
    ages[2] = 10;
    ages[3] = 65;
    for (int i = 0; i < ages.length; i++) {
      if (ages[i] % 2 == 0) {
        System.out.println("Age=" + ages[i]);
      }
    }

    // array + for + if
    // find the max value in the array
    int max = Integer.MIN_VALUE;
    int[] numbers = new int[6];
    numbers[0] = -1;
    numbers[1] = -10;
    numbers[2] = -2;
    numbers[3] = -3;
    numbers[4] = -10;
    numbers[5] = -100;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    System.out.println("Max value=" + max);


    // find min. salary
    int[] salaries = new int[4];
    salaries[0] = 14000;
    salaries[1] = 19000;
    salaries[2] = 21000;
    salaries[3] = 34000;

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < salaries.length; i++) {
      if (salaries[i] < min) {
        min = salaries[i];
      }
    }
    System.out.println("Min. value=" + min);

    // John, Steven, Eric
    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Steven";
    names[2] = "Eric";

    String longestName = ""; // empty String
    // Find the longest name in the array
    for (int i = 0; i < names.length; i++) {
      if (names[i].length() > longestName.length()) {
        longestName = names[i];
      }
    }
    System.out.println("Longest Name=" + longestName);


    // nums is an array, a set of int values
    int[] nums = new int[4];
    System.out.println(nums.length); // array length -> 4
    nums[0] = 9;
    nums[1] = 8;
    nums[2] = 7;
    nums[3] = 10;
    // Print out the first even number -> break
    int firstEven = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 == 0) {
        firstEven = nums[i];
        break; // exit for loop
      }
    }
    System.out.println("First even number is " + firstEven);

    char[] directions = new char[5];
    // l -> left
    // r -> right
    directions[0] = 'l';
    directions[1] = 'l';
    directions[2] = 'r';
    directions[3] = 'l';
    directions[4] = 'r';
    // l -> score + 3
    // r -> score - 2
    int score = 0;
    for (int i = 0; i < directions.length; i++) {
      if (directions[i] == 'l') {
        score += 3;
      } else {
        score -= 2;
      }
    }
    System.out.println("Total score=" + score);

    // Swapping
    int w1 = 2;
    int w2 = 3;

    int backup = w1;
    w1 = w2;
    w2 = backup;
    System.out.println("w1=" + w1);
    System.out.println("w2=" + w2);

    int[] marksix = new int[6];
    marksix[0] = 5;
    marksix[1] = 20;
    marksix[2] = 47;
    marksix[3] = 43;
    marksix[4] = 39;
    marksix[5] = 2;
    for (int i = 0; i < marksix.length; i++) {
      System.out.println(marksix[i]);
    }
    // 5 20 47 43 39 2
    // ! i = 0, j = 0,1,2,3,4 (marksix[4+1] > marksize[4])
    // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 47 43 39 3
    // round 2: 20 vs 47 (47 > 20, no swap) -> 5 20 47 43 39 3
    // round 3: 47 vs 43 (43 < 47, swap) -> 5 20 43 47 39 3
    // round 4: 47 vs 39 (39 < 47, swap) -> 5 20 43 39 47 3
    // round 5: 47 vs 3 (3 < 47, swap) -> 5 20 43 39 3 47

    // ! i = 1
    // round 1: 5 vs 20 (20 > 5, no swap) -> 5 20 43 39 3 47
    // ...
    // ...
    // round 4: -> 5 20 39 3 43 47

    // ! i = 2
    // ...
    // ...
    // round 3:  -> 5 20 3 39 43 47

    // ! i = 3
    // ...
    // round 2: ->  5 3 20 39 43 47

    // ! i = 4
    // round 1: -> 3 5 20 39 43 47

    // Finally -> 2 5 20 39 43 47
    // ! Sorting (5 x 5)
    // Swapping
    int temp = -1;
    for (int i = 0; i < marksix.length - 1; i++) { // i = 0 (how many numbers I need to swap)
      for (int j = 0; j < marksix.length - i - 1; j++) { // j=0,1,2,3,4 | j=0,1,2,3
        if (marksix[j + 1] < marksix[j]) {
          temp = marksix[j + 1];
          marksix[j + 1] = marksix[j];
          marksix[j] = temp;
        }
      }
    }
    for (int i = 0; i < marksix.length; i++) {
      System.out.println(marksix[i]);
    }

    // counting
    char[] chs = new char[] {'o', 'p', 'a', 'p'};
    // count the number of 'p'
    int count = 0;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] == 'p') {
        count++;
      }
    }

    char[] chs2 = new char[] {'a', 'b', 'a', 'b', 'z'};
    // 有多少character, which 數量 > 1 -> o and p
    // 2
    int[] counts = new int[26]; // 0-25
    for (int i = 0; i < chs2.length; i++) {
      int index = chs2[i] - 'a';
      counts[index]++;
    }
    int result = 0;
    for (int i = 0; i < counts.length; i++) {
      if (counts[i] > 1) {
        result++;
      }
    }
    System.out.println(result); // 2

    // 0 9 1 9 2 0 9 9
    // is there any number appear 3 times more?
    // true

    String[] lastNames = new String[] {"Lau", "Wong", "Chan"};
    // 8 primitives + String

  }
}