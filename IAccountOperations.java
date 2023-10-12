public interface IAccountOperations {
    public boolean insertAccount(Account a);
    public boolean searchAccount(int accountNumber);
    public boolean deposit(int accountNumber,double amount);
    public boolean withdraw(int accountNumber,double amount);
    public boolean removeAccount(int accountNumber);
    public void showAllAccounts();
}
