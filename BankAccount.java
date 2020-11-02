public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String b){
    balance = 0;
    accountID = a;
    password = b;
  }

  public int getAccountID () {
    return accountID;
  }

  public double ReturnBal () {
    return balance;
  }

  public String SetPassword (String NewPassword){
    password = NewPassword;
    return "Your new password is " + NewPassword;
  }

  public boolean deposit(double amount){
    if (amount >= 0){
      balance = balance + amount;
      return true;
    }
    else{
      return false;
    }
  }

  public boolean withdraw(double amount){
    if (amount < 0 || amount > balance){
      return false;
    }
    else{
      balance = balance - amount;
      return true;
    }
  }

  public String toString(){
    String a = "";
    a = a + "#" + accountID;
    a = a + "\t";
    a = a + "$" + balance;
    return a;
  }

  private boolean authenticate (String password){
    return ((this.password).equals(password) );
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if (authenticate(password) && withdraw(amount)){
      balance = balance - amount;
      other.balance = other.balance + amount;
      return true;
    }
    else {
      return false;
    }
  }
}
