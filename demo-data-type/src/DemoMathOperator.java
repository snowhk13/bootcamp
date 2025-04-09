public class DemoMathOperator {
  public static void main(String[] args) {
    // + 1
    int x = 3;
    x = x + 1;
    x += 1;
    x++;
    ++x;
    System.out.println("x=" + x);

    // -1
    int y = 5;
    y = y -1;
    y -= 1;
    y--;
    --y;
    System.out.println("y=" + y);  //1

    // + or - non 1 number
    int z = 10;
    z = z + 2;
    z += 2;
    z = z - 3;
    z -= 3;
    System.out.println("z=" + z); //8

    // * or /
    int a = 6;
    a = a * 2;
    a *= 2;
    a = a / 2;
    a /= 2;
    System.out.println("a=" + a);
  
// Count number of even number between 0 - 9

int countNumber = 0;

for(int i = 0; i < 10; i++){
if(i % 2 == 0){
  countNumber += 1;
}
  }

  System.out.println("0至9的雙數有 " + countNumber + "個.");

// Max

 int num1 = 100;
 int num2 = 12;
 int num3 = 13;

 int max = 0;

 if(num1 > num2){
  max = num1;
 }
 else{
  max = num2;
 }

 if(num3 > max){
  max = num3;
 }
 System.out.println(max);

 // Find Min. number
 // 40, 32, -19

 int num4 = 40;
 int num5 = 32;
 int num6 = -19;

 int min = 0;

 if(num4 < num5){
 min = num4;
 }
 else{
  min = num5;
 }
 if(num6 < min){
  min = num6;
 }

 System.out.println(min);

  }
}
