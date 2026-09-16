package Lec10_Abstraction.AbstractAccount;
public abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public abstract String getAccountType();
    public void display(){
        System.out.println("Account Type : " + getAccountType());
        System.out.println("Balance : " + getBalance());
    }
}
