import java.util.Scanner;

public abstract class Hotel {

    public void HotelBooking(){
        Scanner scanner=new Scanner(System.in);
        int choice;
        char c;
        System.out.println("[1]-White House");
        System.out.println("[2]-Radisson");
        System.out.println("[3]-Hotel Sheraton");
        System.out.println("[4]-Hotel Shonargaon");
        System.out.print("Enter Your Choice:");
        choice= scanner.nextInt();
        if(choice==1){
            System.out.println("Hotel Name:White House");
            System.out.println("Hotel Type:Middle");
            System.out.println("Location: Malibag");
            System.out.println("Rent: 700 per day");
            System.out.print("Are you sure to Book(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Reservation Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
            }
        else if(choice==2){
            System.out.println("Hotel Name:Radisson");
            System.out.println("Hotel Type:VIP");
            System.out.println("Location: Airport Road");
            System.out.println("Rent: 5000 per day");
            System.out.print("Are you sure to Book(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Reservation Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
        }
        else if(choice==3){
            System.out.println("Hotel Name:Sheraton");
            System.out.println("Hotel Type: VIP");
            System.out.println("Location: Banani");
            System.out.println("Rent: 8000 per day");
            System.out.print("Are you sure to Book(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Reservation Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
        }
        else if(choice==4){
            System.out.println("Hotel Name:Shonargaon");
            System.out.println("Hotel Type: V I P");
            System.out.println("Location: Kazi Nazrul Islam Avenue");
            System.out.println("Rent: 10000 per day");
            System.out.print("Are you sure to Book(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Reservation Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
        }
        else{
            System.out.println("Wrong Choice");
        }
        }
    }



