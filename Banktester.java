public class Banktester{
  public static void main (String [] args){
    BankAccount Test1 = new BankAccount (45324,"letmein");
    Test1.deposit(40);
    System.out.println(Test1.ReturnID() );
    System.out.println(Test1.ReturnBal() );
    System.out.println(Test1.SetPassword("Hi") );
  }
}
