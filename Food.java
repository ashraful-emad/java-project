import java.util.Scanner;

public class Food {
    public void FoodBooking() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char c;
        System.out.println("[1]-Fried Rice");
        System.out.println("[2]-Burger");
        System.out.println("[3]-Pizza");
        System.out.println("[4]-Chicken Fry");
        System.out.print("Enter Your Choice:");
        choice = scanner.nextInt();
        if(choice==1){
            System.out.println("Food Name:Fried Rice");
            System.out.println("Price:200 Tk");
            System.out.print("Are you sure to Order(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Order Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
        }
        else if(choice==2){
            System.out.println("Food Name:Burger");
            System.out.println("Price: 150 Taka");
            System.out.print("Are you sure to Order(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Order Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
        }
        else if(choice==3){
            System.out.println("Food Name:Pizza");
            System.out.println("Price:250 Taka");
            System.out.print("Are you sure to Order(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Order Confirmed");
            }
            else{
                System.out.println("Try Again");
            }
        }
        else if(choice==4){
            System.out.println("Food Name:Chicken Fry");
            System.out.println("Price:80 Taka");
            System.out.print("Are you sure to Order(y/n):");
            c= scanner.next().charAt(0);
            if(c=='y'){
                System.out.println("Order Confirmed");
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
