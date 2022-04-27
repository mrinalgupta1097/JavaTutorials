package infyjava;

public class Account {
  private static int accountNumber = 000;
  private double balance;


  public Account(double balance) {
    System.out.println("inside constructor");
    this.balance = balance;
    accountNumber++;
  }

  public static int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}

class Test {
  public static void main(String[] args) {
    // object creation
    Account acc1 = new Account(1200.00);
    System.out.println("For account 1");
    System.out.println(Account.getAccountNumber());
    System.out.println(acc1.getBalance());

    Account acc2 = new Account(1400.00);
    System.out.println("For account 2");
    System.out.println(Account.getAccountNumber());
    System.out.println(acc2.getBalance());
  }
}
//employee, country, Animal(name, legs, tail(boolean), fly(boolean), no of species(static))