public class test1 {
  public static void main(String[] args) {
    String s1 = "bootcamp";

    System.out.println(s1.substring(1));

    System.out.println(s1.charAt(3));

    int[]  num = new int[] {4,0,3,2,1};

    int[] num2 = new int[num.length];
    for(int i=0;i<num.length;i++){
      num2[i] = num[num[i]];
    }

    for(int xxx : num2){
   System.out.println(xxx);
    }
  }
}
