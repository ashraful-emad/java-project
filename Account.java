public class Account {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    Account(int accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
}
