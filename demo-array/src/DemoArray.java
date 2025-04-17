public class DemoArray {
  public static void main(String[] args) {
    int x1 = 3;
    int x2 = 4;
    int x3 = -7;
    
    // array[]
    // right hand side -> creating an array with size 3.
    // left hand side -> assign int array object to int array type(variable)
    int[] arr = new int[3];

    // write
    // First box (index)
    arr[0] = 3;
    arr[1] = 4;
    arr[2] = -7;

    // 10, 7, 4, -100, 6

    int[] arr1 = new int[5];
    arr1[0] = 10;
    arr1[1] = 7;
    arr1[2] = 4;
    arr1[3] = -100;
    arr1[4] = 6;

    //

    double[] arrD = new double[4];
    arrD[0] = 1.11;
    arrD[1] = 2.22;
    arrD[2] = 3.33;
    arrD[3] = 4.44;

    


    // read
System.out.println(arrD[0]);
double amount = 99.9;
arrD[0] = amount;
System.out.println(arrD[0]);

String[] arrs = new String[3];
arrs[0] = "Hello";
arrs[1] = "Yes";
arrs[2] = "Pet";

for(int i=0;i<3;i++){
  System.out.println(arrs[i]);
}

double[] amounts = new double[6];

amounts [0] = 10.9;
amounts [3] = 14.1;
amounts [5] = 99.9;


for(int i = 0; i < amounts.length; i++){
  amounts[i] += 1.5;
}

for(int i = 0;i < amounts.length; i++){
  System.out.println("arr's value is " +amounts[i]);
}

for(int i = 0;i < amounts.length; i++){
 
   if(amounts[i] > 100){
    System.out.println(amounts[i]);
   }
  }
//int array
// Fing even number, and then print out "Age=x"

int[] ages = new int[5];
ages[0] = 11;
ages[1] = 22;
ages[2] = 33;
ages[3] = 44;
ages[4] = 55;

for(int i = 0; i < ages.length; i++){

 if(ages[i] % 2 == 1){
  continue;
 }
 
 System.out.println("Age=" +ages[i]);
}

int[] number = new int[6];

number[0] = 34;
number[1] = 99;
number[2] = 21;
number[3] = 72;
number[4] = 30;
number[5] = 60;

int max = Integer.MIN_VALUE;

for(int i = 0; i<number.length; i++){
 if(max <= number[i]){
  max = number[i];
 }
}

System.out.println("Max number is " +max);

//find min.value
int[] salaries = new int[4];
salaries[0] = 14000;
salaries[1] = 19000;
salaries[2] = 21000;
salaries[3] = 34000;

int min = Integer.MAX_VALUE;

for(int i = 0; i < salaries.length; i++){
  if(salaries[i] < min){
    min = salaries[i];
  }
}

System.out.println("Min salaries is " +min);

String[] name = new String[3];
name[0] = "John";
name[1] = "Steven";
name[2] = "Eric";

String longestName = "";

for(int i = 0; i < name.length; i++){
  if(name[i].length() > longestName.length()){
    longestName = name[i];
  }
}

System.out.println("longestName is " + longestName);

int[] nums = new int[4];
nums[0] = 9;
nums[1] = 8;
nums[2] = 7;
nums[3] = 10;

for(int i = 0; i < nums.length; i++){
  if(nums[i] % 2 ==0){
    System.out.println("First even number is " +nums[i]);
    break;
  }
}

char[] directions = new char[5];
directions[0] = 'l';
directions[1] = 'l';
directions[2] = 'r';
directions[3] = 'l';
directions[4] = 'r';

int score = 0;

for(int i = 0; i<directions.length;i++){
  if(directions[i] == 'l'){
     score += 3;
  }else if(directions[i] == 'r'){
    score -= 2;
  }
}

System.out.println("score is " + score);

// Swapping

int w1 = 2;
int w2 = 3;

int backup = w1;
w1 = w2;
w2 = backup;

System.out.println("w1=" +w1);
System.out.println("w2=" +w2);

int[] marksix = new int[6];

marksix[0] = 5;
marksix[1] = 20;
marksix[2] = 47;
marksix[3] = 43;
marksix[4] = 39;
marksix[5] = 3;

int temp = 0;



 //counting

 char[] chs = new char[] {'o','p','a','p'};
 // count the number of 'p'

 int countNum = 0;
 for(int i =0; i<chs.length;i++){

  if(chs[i] == 'p'){
     countNum += 1;
  }

 }
 System.out.println(countNum);

 char c1 = 97;
 System.out.println(c1);

 char[] arrC = new char[26];

 for(int i=0;i < arrC.length;i++){
  
  arrC[i] = (char)(97 + i);
 }

 System.out.println(arrC[0]);
 System.out.println(arrC[25]);


 countNum = 0;
 char[] chs2 = new char[] {'o','p','a','p','o'};
 int[] counts = new int[26];
 
for(int i =0; i<chs2.length;i++){
  int index;
  index = chs2[i] - 'a';
  counts[index]++;
}

int countsnum = 0;
for(int i =0;i<counts.length;i++){
  if(counts[i]>1){
     countsnum++;
  }
}
System.out.println(countsnum);

char t1;
for(int i =0;i<counts.length;i++){
  if(counts[i]>1){
     t1 = (char)(i + 97);
     System.out.print(t1 + " ");
  }
}
System.out.println(" ");
String[] lastNames = new String[] {"Lau","Wong","Chan"};

// 0 9 1 9 2 0 9 9
// is there any number appear 3 times more?
// true


char[] chs3 = new char[] {'0','9','1','9','2','2','9','9'};

int[] numcount = new int[10];

for(int i=0;i<chs3.length;i++){
  int index;
  index = chs3[i] - '0';
  numcount[index] = numcount[index] + 1;
}
boolean isMoreThan3 = false;
for(int i=0;i<numcount.length;i++){
    if(numcount[i] > 3){
      isMoreThan3 = true;
    }
}

System.out.println(isMoreThan3);

for(int i=0;i<numcount.length;i++){
  if(numcount[i] > 1){
    System.out.print(i + " ");
  }
}








}
}
