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

  }
}
