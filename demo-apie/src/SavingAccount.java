public class SavingAccount extends SubAccount {
  private Currency currency;
  
  private SavingAccount(Currency currency) {
    this.currency = currency;
  }

  public static SavingAccount ofHKD(){
    return new SavingAccount(Currency.HKD);
  }

  public static void main(String[] args) {
    SavingAccount sa = new SavingAccount(Currency.USD);
    System.out.println(sa.getBalance()); // 0.0
    sa.credit(150);
    System.out.println(sa.debit(100)); // true
    System.out.println(sa.getBalance()); // 50.0
    System.out.println(sa.debit(60)); // false
    System.out.println(sa.getBalance()); // 50.0

    PersonalAccount pa = new PersonalAccount();
    //add $100 to saving accoount
    pa.getSavingAccount().credit(100);
    //add $500 to current account
    pa.getCurrentAccount().credit(500);
    //deduct $80 from saving account
    pa.getSavingAccount().debit(80);
    //deduct $230 from current account
    pa.getCurrentAccount().debit(230);
    //print out the balance of this personal account
    System.out.println(pa.balance());
    System.out.println(pa.getSavingAccount().getBalance());
    System.out.println(pa.getCurrentAccount().getBalance());
    
  }
}