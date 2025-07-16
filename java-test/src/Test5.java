import java.util.Arrays;

public class Test5 {
  public static void main(String[] args) {
    
    int[] arr = new int[]{5,4,3,2,1};
    int temp = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }
}
