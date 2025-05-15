public class Machine {
  private boolean status;
  public Machine(){
    this.status = false;
  }
  public void turnOn(){
    this.status = true;
  }
  public void turnOff(){
    this.status = false;
  }

  public String getStatus(){
    return this.status ==  true ? "ON" : "OFF";
  }

  public static void main(String[] args) {
    Machine m1 = new Machine();
    m1.turnOn();
    System.out.println(m1.getStatus());
  }
}
