public class Test4 {
  public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0;
       for(int i =0;i<students.length;i++){
        int min = 102;
        int index = 102;
        int move = 0;
      // int[] seats = new int[]{4,1,5,9};
      // int[] students = new int[]{1,3,2,6};
        for(int j =0;j<seats.length;j++){
          move = Math.abs(students[i] - seats[j]);
          System.out.println(i +": " +move);
            if(min > move){
                min = move;
                index = seats[j];
            }
        }
        System.out.println("count: " +min);
            count += min;
            for(int j =0;j<seats.length;j++){
              if(seats[j] == index){
                seats[j] = 102;
                break;
              }
            }
       }
       return count;
    }

    public static void main(String[] args) {
      int[] seats = new int[]{4,1,5,9};
      int[] students = new int[]{1,3,2,6};

      Test4 t1 = new Test4();
     int result= t1.minMovesToSeat(seats,students);
     System.out.println(result);
    }
}
