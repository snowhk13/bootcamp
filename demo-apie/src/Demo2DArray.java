public class Demo2DArray {
  public static void main(String[] args) {
    
    
    int[] arr = new int[] {1,2,3};
    int[] arr2 = new int[3];
    String s = "hello";
    arr2[0] = s.length();

    //2D array
    //level1,2,3
    //MAX_HP,MAX_MP,PA,PD,MA,MD

    //new int[row][column]
    //3 roles
    //10 levels
    //6 attributes

    int[][] warrior_values = new int[10][6];
    int[][] mage_values = new int[10][6];
    int[][] archer_values = new int[10][6];

    //read
    //write

    warrior_values[0] = new int [] {200,80,10,8,5,3};
    warrior_values[1] = new int [] {500,200,80,50,40,20};

    int[][] arr2d = new int[][] {{10,20,30},{100,90,-100}};

    // for(int i=0;i<2;i++){
    //   for(int j=0;j<3;j++){
    //     System.out.println(arr2d[i][j] + " ");
        
    //   }
    // }
    System.out.println(arr2d.length); // 2, number of rows
    System.out.println(arr2d[0].length); // 3 , number of columns for each row

  }
}
