import java.time.LocalDate;

// ! Builder Pattern
public class User {
  private String userid;
  private String email;
  private LocalDate joinDate;

  public User(String userid, String email, LocalDate joinDate) {
    this.userid = userid;
    this.email = email;
    this.joinDate = joinDate;
  }

  public String getUserid() {
    return this.userid;
  }

  public String getEmail() {
    return this.email;
  }

  public LocalDate getJoinDate() {
    return this.joinDate;
  }

  public static Builder builder() {
    return new Builder();
  }

  // Encapsulation (private)
  private User(Builder builder) {
    this.userid = builder.userid;
    this.email = builder.email;
    this.joinDate = builder.joinDate;
  }

  public static class Builder {
    private String userid;
    private String email;
    private LocalDate joinDate;

    public Builder userid(String userid) {
      this.userid = userid;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder joinDate(LocalDate joinDate) {
      this.joinDate = joinDate;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  public static void main(String[] args) {
    // User user = new User(xxx, xxx, xxx);
    User user = User.builder() //
        .userid("john") //
        .email("john@gmail.com") //
        .joinDate(LocalDate.of(2025, 2, 20)) //
        .build();

    User user2 = User.builder() //
        .email("john@gmail.com") //
        .build();

    User user3 =
        new User("vincentlau", "vincent@gmail.com", LocalDate.of(2020, 1, 2));
  }
}
