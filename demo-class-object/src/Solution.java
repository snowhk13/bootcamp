class Solution {
  public int scoreOfString(String s) {
      int sum = 0;
      char[] arrc = s.toCharArray();

      for(int i=0; i<arrc.length-1;i++){
        sum = sum + (Math.abs(arrc[i]-arrc[i+1]));
      }

      
      return sum;
  }


  public static void main(String[] args) {
    Solution s1 = new Solution();
   System.out.println( s1.scoreOfString("zaz"));

  }
}