import java.math.BigDecimal;

public abstract class SubAccount { // cannot be "new"
  private double balance;

  public SubAccount() {
    this.balance = 0.0;
  }

  public double getBalance() {
    return this.balance;
  }

  public void credit(double amount) {
    this.balance = BigDecimal.valueOf(this.balance)
        .add(BigDecimal.valueOf(amount)).doubleValue();
  }

  public boolean debit(double amount) {
    if (this.balance < amount)
      return false;
    this.balance = BigDecimal.valueOf(this.balance)
        .subtract(BigDecimal.valueOf(amount)).doubleValue();
    return true;
  }
}