public class DemoASCII {
  
  public static void main(String[] args){


    char x = 'b';
    char y = 'z';
    System.out.println(x);
  
    int ascii = x;
    int ascii2 = y;
    System.out.println(ascii);
    System.out.println(ascii2);

    char z = '\"';
    System.out.println(z);
    int ascii3 = z;
    System.out.println(ascii3);

    // given a-z, convert to 1-26
    char v = 'z';
    int convert = v - 'a' + 1;
  System.out.println(convert);
    

  }
}
