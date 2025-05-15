public class ExceptionTest extends Exception {

  public ExceptionTest(String massage){
    super(massage);
  }

  public static void main(String[] args) {
    String s1 = "1234";
    try{
    ExceptionTest.checkid(s1);
    }catch (ExceptionTest e){
     System.out.println(e.getMessage());
    }
  }

  public static boolean checkid(String id) throws ExceptionTest {

    if(id == null || id != null && id.length() < 8){
      throw new ExceptionTest("The ID null of length < 8");
      
    }

    return true;
  }
  
}
