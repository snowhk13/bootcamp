public class DemoSwitchExpression {


  // Java 14
  public static void main(String[] args) {
    // ! switch cannot do:
    // ! 1. range checking
    // ! 2. AND OR

    int score = 95;
    char grade = ' ';
    switch (score) {
      case 90:
        grade = 'A';
        break;
      case 91:
        grade = 'A';
        break;
      // ....
      default:
        break;
    }

    // But for enum, it is better to use switch, because the number of enum values is finite
    // ! still cannot use OR
    // ! normal switch cannot support missing value checking
    WEEKDAY weekday = WEEKDAY.WED;
    switch (weekday) {
      case MON:
        System.out.println("Learn Java");
        break;
      case TUE:
        System.out.println("Learn Java");
        break;
      // ! forgot to write the code for Wednesday
      case THU:
        System.out.println("Sleep");
        break;
      case FRI:
        System.out.println("Take a rest");
        break;
      default:
        System.out.println("I don't know what happen...");
        break;
    }
    WEEKDAY weekday2 = WEEKDAY.MON;
    // Java 14: Switch Expression
    switch (weekday2) {
      case MON, TUE -> {
        System.out.println("I am learning Java ...");
        System.out.println("I am learning Maths ...");
      }
      case WED -> System.out.println("I am learning Python ...");
      case THU -> System.out.println("Sleep ...");
      // case THU -> System.out.println("Sleep ..."); // ! check if duplicated
      // case FRI -> System.out.println("Take rest ..."); // ! After Java 21, cannot check missing value
      default -> System.out.println("I do nothing ...");
    }
  }

  public static enum WEEKDAY {
    MON, TUE, WED, THU, FRI,;
  }
}
