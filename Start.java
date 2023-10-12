import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        AccountOperations AccountOperations=new AccountOperations();
        HotelReservation reservation=new HotelReservation();
        Food food=new Food();
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Welcome to Electronic Token Device");
        do{
            System.out.println("Welcome to the menu,");
            System.out.println("[1]-Bank");
            System.out.println("[2]-Hotel");
            System.out.println("[3]-Restaurant");
            System.out.println("[4]-Exit Menu");
            System.out.print("Enter your choice:");
            choice= sc.nextInt();
            switch (choice){
                case 1:{
                    int ch;
                    System.out.println("[1]-Open Account");
                    System.out.println("[2]-Search Account");
                    System.out.println("[3]-Deposit Money");
                    System.out.println("[4]-Withdraw Money");
                    System.out.println("[5]-Remove Account");
                    System.out.println("[6]-Show All Accounts");
                    System.out.print("Enter your Choice:");
                    ch= sc.nextInt();
                    if(ch==1){
                        System.out.println("Enter the Account Holder Name:");
                        String accountHolderName= sc.next();
                        System.out.println("Enter the Account Number:");
                        int accountNumber=sc.nextInt();
                        System.out.println("Enter the Initial Balance to Deposite:");
                        double balance= sc.nextDouble();
                        Account Account=new Account(accountNumber,accountHolderName,balance);
                        AccountOperations.insertAccount(Account);
                        break;
                    }
                    else if(ch==2){
                        System.out.print("Enter the Account Number:");
                        int accno= sc.nextInt();
                        AccountOperations.searchAccount(accno);
                    }
                    else if(ch==3){
                        System.out.print("Enter the Account Number:");
                        int acno= sc.nextInt();
                        System.out.print("Enter the Amount:");
                        double amount= sc.nextDouble();
                        AccountOperations.deposit(acno,amount);
                    }
                    else if(ch==4){
                        System.out.print("Enter the Account Number:");
                        int acno= sc.nextInt();
                        System.out.print("Enter the Amount:");
                        double amount= sc.nextDouble();
                        AccountOperations.withdraw(acno,amount);
                    }
                    else if(ch==5){
                        System.out.print("Enter the Current Account Number:");
                        int Number= sc.nextInt();
                        AccountOperations.removeAccount(Number);
                    }
                    else if(ch==6){
                        AccountOperations.showAllAccounts();
                    }
                    else{
                        System.out.println("Wrong Choice");
                    }
                    break;

                }
                case 2:{
                    System.out.println("Welcome to Hotel Reservation System");
                    reservation.reservation();
                    break;
                }
                case 3:{
                    food.FoodBooking();
                    break;
                }
                case 4:{
                    System.out.println("=============================");
                    System.out.println("Program Exiting.......");
                    break;
                }
                default:{
                    System.out.println("Wrong Choice, Please Try again!");
                }
            }
        }while(choice!=4);{
            System.out.println("Thanks for Banking with us");
        }
    }

}
