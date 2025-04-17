public class DemoString {
  public static void main(String[] args) {
    // Week 1: equals(), length(), charAt();
    // Week 2: Other String methods

    // 1.replace()
    System.out.println("bootcamp".replace('o', 'x')); // bxxtcamp

    System.out.println("bootcamoop".replace("oo", "lll")); // bllltcamlllp

    // 2.indexOf()
    System.out.println("hello".indexOf('o')); // 4
    System.out.println("hello".indexOf('a')); // -1
    System.out.println("hello".indexOf(' ')); // -1

    // 3. concat()
    String s1 = "hello" + "world";
    System.out.println(s1);
    // "+" -> slow performance (runtime)
    String s2 = "hello".concat("world");
    System.out.println(s2);

    // 4. lastIndexOf()
    System.out.println("hello".indexOf('l')); // 2 , indexOf -> firstIndexOf
    System.out.println("hello".lastIndexOf('l'));// 3
    System.out.println("hello world".lastIndexOf('l'));// 9

    // 5. isEmpty()
    boolean result = "".isEmpty();
    System.out.println(result); // true
    System.out.println("hello".isEmpty()); // false

    //6. trim()
    System.out.println(" hello world !!! ".trim()); // "hello world !!!"
    System.out.println(" hello world !!! ".trim().length()); // 15
    
    // Coding style: chain methods
    System.out.println(" hello ".replace('e', 'a').trim().charAt(1)); //a
    System.out.println("hello".replace('L', 'x')); // hello

    // String methods return different types

    //7. substring
    System.out.println("hello".substring(1,3)); // el  index , endindex -1
    System.out.println("hello".substring(0)); //"hello"

    String unknown = "he";

    int startIndex = 1;
    int endIndex = 2;

    if(unknown.length() < 2 ){
     startIndex = 1;
     endIndex = 0;

    }else if(unknown.length() == 2){
      endIndex = 1;
    }
    System.out.println(unknown.length());
    System.out.println(unknown.substring(startIndex,endIndex+1));

    //8. toLowerCase() , toUpperCase()

    System.out.println("HELLO!!!".toLowerCase()); //hello!!!
    System.out.println("heLLo!!!".toLowerCase()); //hello!!!
    System.out.println("hello!!!".toUpperCase()); //HELLO!!!
    System.out.println("heLLo!!!".toUpperCase()); //HELLO!!!

    //9. contains()

    System.out.println("hello".contains("ll")); // true
    System.out.println("hello".contains("lll")); // false

    String name = "Steven";
    if(name.contains("t")){
      System.out.println("Your name contain t charcater");
    }


    //10. startsWith(), endsWith()
    System.out.println("hello".startsWith("he")); //true
    System.out.println("hello".startsWith("helll")); // false
    System.out.println("hello".endsWith("lo")); // true
    System.out.println("hello".endsWith("oo")); // false


    // Check if the String value is Palindromic
    //madam
    //ada
    //abcba
    //abccba

    String s = "abcba"; //true
  
    boolean res = false;
    System.out.println(s.length()/2);

   
      if(s.length()%2 == 0){
        for(int i=0;i<s.length()/2;i++){


          if(s.charAt(((s.length()/2)-i)-1) == s.charAt((s.length()/2)+i)){
            res = true;
          }else{
            res = false;
            break;
          }
        }
      }

      if(s.length()%2 == 1){
        for(int i=0;i<s.length()/2;i++){


          if(s.charAt(((s.length()/2)-i)-1) == s.charAt(((s.length()/2)+i)+1)){
            res = true;
          }else{
            res = false;
            break;
          }
        }
      }



      System.out.println(res);
    

    
  }

}
