import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class DemoForEach {
  public static void main(String[] args) {
    // List<User>
    // forEach Consumer -> print joinDate, email, userid
    List<User> users = new LinkedList<>();
    User user1 = User.builder().userid("johnwong").email("john@gmail.com")
        .joinDate(LocalDate.of(2024, 10, 24)).build();
    User user2 = User.builder().userid("peterchan").email("peter@gmail.com")
        .joinDate(LocalDate.of(2024, 12, 24)).build();
    User user3 = User.builder().userid("jessiecheung").email("jessie@gmail.com")
        .joinDate(LocalDate.of(2024, 11, 24)).build();
    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.forEach(u -> {
      System.out.println("User: " + u.getUserid() + "," + u.getEmail() + "," + u.getJoinDate());
    });
  }
}
