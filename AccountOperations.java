public class AccountOperations implements IAccountOperations {

    Account[] Accounts=new Account[100];

    public boolean insertAccount(Account ca){
        boolean inserted=false;
        for(int i=0; i<Accounts.length; i++){
            if(Accounts[i]==null){
                Accounts[i]=ca;
                inserted=true;
                System.out.println("Account Inserted!");
                break;
            }
        }
        return inserted;
    }

    public boolean searchAccount(int accountNumber){
        boolean found=false;
        for(int i=0; i<Accounts.length; i++){
            if(Accounts[i]!=null){
                if(Accounts[i].getAccountNumber()==accountNumber){
                    System.out.println("Account Found!!!");
                    System.out.println("Account Number:"+Accounts[i].getAccountNumber());
                    System.out.println("Account Holder Name:"+Accounts[i].getAccountHolderName());
                    System.out.println("Balance:"+Accounts[i].getBalance());
                    break;
                }
            }
            else{
                found=true;
            }
        }
        if(found){
            System.out.println("Account Not Found");
        }
        return found;
    }

    public boolean deposit(int accountNumber,double amount){
        boolean deposited=false;
        for(int i=0; i<Accounts.length; i++){
            if(Accounts[i]!=null){
                if(Accounts[i].getAccountNumber()==accountNumber){
                    if(amount>0){
                        Accounts[i].balance+=amount;
                        System.out.println("Amount Successfully Deposited!!!");
                        break;
                    }
                    else{
                        System.out.println("Amount cannot be zero or negative");
                    }
                }
            }
            else{
                deposited=true;
            }
        }
        if(deposited){
            System.out.println("No Account Found to Deposit");
        }
        return deposited;
    }

    public boolean withdraw(int accountNumber, double amount){
        boolean withdrawn=false;
        for(int i=0; i<Accounts.length; i++){
            if(Accounts[i]!=null){
                if(Accounts[i].getAccountNumber()==accountNumber){
                    if(amount<=Accounts[i].getBalance()){
                        Accounts[i].balance-=amount;
                        System.out.println("Amount Successfully Withdrawn!!!");
                        break;
                    }
                    else{
                        System.out.println("Amount cannot be zero or negative");
                    }
                }
            }
            else{
                withdrawn=true;
            }
        }
        if(withdrawn){
            System.out.println("No Account Found to Deposit");
        }
        return withdrawn;
    }

    public boolean removeAccount(int currentAccountNumber){
        boolean removed=false;
        for (int i=0; i<Accounts.length; i++){
            if(Accounts[i]!=null) {
                if(Accounts[i].accountNumber==currentAccountNumber){
                    Accounts[i]=null;
                    System.out.println("Account Removed!");
                    break;
                }
            }
            else{
                removed=true;
            }
        }
        if(removed){
            System.out.println("No Such ID Found");
        }
        return removed;
    }

    public void showAllAccounts(){
        for(int i=0; i<Accounts.length; i++){
            if(Accounts[i]!=null){
                System.out.println("\nAccount Number:"+Accounts[i].getAccountNumber());
                System.out.println("Account Holder Name:"+Accounts[i].getAccountHolderName());
                System.out.println("Balance:"+Accounts[i].getBalance());
            }
        }
    }
}
