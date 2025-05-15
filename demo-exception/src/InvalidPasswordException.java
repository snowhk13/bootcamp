public class InvalidPasswordException extends Exception{

  public static void main(String[] args) {
    try{
      int result = isValidPassword("abcd1$");
      System.out.println(result);
    }catch(InvalidPasswordException e){
      System.out.println("this is InvalidPasswordException: " + e.getMessage());
    }
  }
  
  public static int isValidPassword(String password) throws InvalidPasswordException{
   
    if(password == null || password != null && password.length() <= 8){
      throw new InvalidPasswordException();
    }
      boolean foundNumber = false;
      boolean foundEnglish = false;
      boolean foundSpChar = false;
     for(char ch : password.toCharArray()){ 
       if(ch >= '0' && ch <= '9'){
        foundNumber = true;
       }else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
        foundEnglish = true;
       }else if(ch == '$' || ch == '#' || ch == '!'){
        foundSpChar = true;
       }
     }
    if(foundNumber && foundEnglish) {
      if(foundSpChar){
      return 3;
    }
    return 2;
    }
  return 1;
  }

  // public void checknum(int count) {
  //      if(count < 3){
  //   throw new InvalidPasswordException();
  //  }
  // }


}
