public class DemoIf {

  public static void main(String[] args){
    int x = 3;
// asking if x > 3;
// x > 3 -> true / false
boolean result = x > 3;
System.out.println(result);  // false

boolean result2 = x >= 3;
System.out.println(result2); // true

// if 條件
if (x > 3){ // false -> skip code block
  System.out.println("x is larger than 3");
}

if (x >= 3){

  System.out.println("x is >= 3");
}

if (x > 3 || x == 3){
  System.out.println("x > 3 || x = 3");
}

// if + else

if(x > 3) {
System.out.println("do something....");
}else { // implication: x <= 3
  
  System.out.println("do something else.....");

}

// x = 3, "=" -> assignment (assign 3 to x)
// ! "==" -> asking if they are same value
char gender = 'F';
if(gender == 'M'){
  System.out.println("He id male.");
}else{
  System.out.println("She is female.");
}

// "!=" -> asking if they are not equal

if(gender != 'M'){
  System.out.println("Not a male.");
}

if(x == 3){
  System.out.println("superman");
}

//Math Operators: +,-,*,/,%
int r = 14 / 3;
System.out.println(r);

// "%" -> remainder
int r2 = 14 % 3;
System.out.println(r2);

// Comparsion operators: >, <, >=, <=, !=, ==
// Apply for all primitives
// if + String eqauls()

String s2 = "Bootcamp";
if(s2.equals("Bootcamp")){
  System.out.println("12345");
}
// Approach 1
// Step 1: s2.equals("Bootcamp") -> true
// Step 2: true == false -> false
// Step 3: Skip code block
if(s2.equals("Bootcamp") == false){
  System.out.println("23456");
}

// Approach 2
// Step 1: s2.equals("Bootcamp") -> true
// Step 2 !true -> false
// Step 3: Skip code block
if(!s2.equals("Bootcamp")){
  System.out.println("555555");
}

String name1 = "Wellcome";

if(name1.length() < 10){
System.out.println("name1 length < 10");
}


// Step 1: s2.length() -> 8
// Step 2: 8 - 1 -> 7
// Step 3: charAt(7) -> 'p'
// Step 4: 'p' == 'a' -> false
// Step 5: print no

if(s2.charAt(s2.length() -1) == 'a'){
System.out.println("yes");
}else{
  System.out.println("no");
}

// Question: Find the middle char of the string
// i.e. abcde -> c (5 / 2 -> 2)
// abcd -> b (4 / 2 -> 2)
// ab -> a( 2 / 2 -> 1)
// a -> a (1 / 2 -> 0)

String s99 = "abcd";

System.out.println(s99.length() / 2);

if((s99.length() % 2) == 0){  
//字的長度是雙數
System.out.println(s99.charAt((s99.length() / 2)-1));

}else{ 
//字的長度是單數
  System.out.println(s99.charAt(s99.length() / 2));

}

//odd number
int x5 = 7;
// Assignment ( right to left)
boolean isOdd = x5 % 2 == 1;
System.out.println(isOdd); // true

boolean isLargerThan5 = x5 > 5;
System.out.println(isLargerThan5); // true

// && -> AND
if(isOdd && isLargerThan5){
  System.out.println("It is an odd number and larger than 5");
}

//even number and larger than 5

if(!isOdd && isLargerThan5){
  System.out.println("It is an even number and larger than 5");
}

    // Basic approach
    if (x5 % 2 == 1 && x5 > 5) {
      System.out.println("basic approach");
    }

// || -> or
if(isOdd || isLargerThan5){
  System.out.println("It is an odd number or larger than 5");
}

int x6 = 10;
// Step 1: x6 < 9. If true, exit criteria checking; if false, go step 2.
// Step 2: x6 % 2 == 0 && x6 > 0
if(x6 < 9 || x6 % 2 == 0 && x6 > 0){
  System.out.println("yes");
}



// Question:
String s5 = "hello world";
//Count how many character 'o' in s5

int counter = 0;

for(int i = 0; i < s5.length(); i = i + 1){ 
  System.out.println("i=" + i);
if(s5.charAt(i) == 'o'){
 
  counter = counter + 1;
}
}

System.out.println("出現 o 的次數是 " + counter +" .");


//2


  }
}

