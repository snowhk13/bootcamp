public class SuperString {

  private char[] chs;

  public void setString(String str) {

    this.chs = new char[str.length()];

    for (int i = 0; i < str.length(); i++) {
      this.chs[i] = str.charAt(i);
    }

  }

  public char charAt(int index) {
    return this.chs[index];
  }

  public boolean equals(SuperString ss) {
    if (this.chs.length != ss.chs.length) {
      return false;
    }
    for (int i = 0; i < ss.chs.length; i++) {
      if (this.chs[i] != ss.chs[i]) {
        return false;
      }
    }
    return true;
  }

  // replace

  public static void main(String[] args) {

    SuperString ss1 = new SuperString();

    ss1.setString("abc");

    System.out.println(ss1.charAt(0));

    SuperString ss2 = new SuperString();

    ss2.setString("abcd");

    System.out.println(ss1.equals(ss2));

    SuperString ss3 = new SuperString();
    ss3.setString("abd");
    System.out.println(ss1.equals(ss3));

    SuperString ss4 = new SuperString();
    ss4.setString("abc");
    System.out.println(ss1.equals(ss4));


  }

}
