package Lec10_Abstraction.AbstractAccount;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        return "Savings account";
    }
    
}
