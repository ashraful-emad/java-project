
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FoodOperations implements IFoodOperations {
Food fd;
File file=new File("JNE.txt");
FileWriter writer=null;
FileReader read=null;
	public void insertAnFood(Food fd) {
	this.fd=fd;
	Scanner input=new Scanner(System.in);
	try{
		System.out.println("Enter food name:");
		String i=input.nextLine();
		fd.setName(i);
		System.out.println("Enter food price:");
		String price=input.next();
		fd.setPrice(price);
		System.out.println("Enter the quantity:");
		int quantity=input.nextInt();
		fd.setQuantity(quantity);
		
		System.out.println("Given Informations are : ");
		System.out.println("Name:"+fd.getName());
		System.out.println("Food price:"+fd.getPrice());
		System.out.println("Quantity:"+fd.getQuantity());
		
		System.out.print("Are all the informations correct?(y/n):");
		char ch=input.next().charAt(0);
		if(ch=='y') {
			writer=new FileWriter(file,true);
			writer.write("Food Price :"+fd.getPrice()+"\r"+"\n");
			writer.write("Name:"+fd.getName()+"\r"+"\n");	
			writer.write("Quantity:"+fd.getQuantity()+"\r"+"\n");
			
			System.out.println("The informations have been succesfully recorded");
			writer.flush();
			writer.close();
		}
		else {
			System.out.println("Please,Give the Informations Again");
		}
	}catch(Exception e) {
		System.out.println(e);
		System.out.println("Exception Caught!!");
	}
	finally {
		try {
			writer.close();
		}
		catch(IOException ioe) {
			
		}

}
	}
	public void showAllFood(Food fd) {
		this.fd=fd;
		try {
			read=new FileReader(file);
			BufferedReader buff=new BufferedReader(read);
			String x="",temp;
			while((temp=buff.readLine())!=null) {
				x=x+temp+"\n"+"\r";
			}
			System.out.println(x);
			read.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void searchAnFood(Food fd) {
		boolean search=false;
		int count=0;
		int linetoprint=4;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the food price to search:");
		String st=in.next();
		fd.setPrice(st);
		try {
			read=new FileReader(file);
			BufferedReader bf1=new BufferedReader(read);
			String temp=null;
			while((temp=bf1.readLine())!=null) {
				if(temp.contains(fd.getPrice())) {
					search=true;
					System.out.println(temp);
					count++;
					continue;
				}
				else if(search && count<linetoprint) {
					count++;
					System.out.println(temp);
				
				}
				else if(search && count==linetoprint) {
					System.out.println(temp);
					search=false;
				}
			}
			if(count==0) {
				System.out.println("Food Not Found");
			}

		}catch(IOException e) {
			System.out.println(e);
			System.out.println("Exception Caught!!");
		}
	}
	@Override
	public void deleteAnFood(Food fd) {
		this.fd=fd;
		Scanner input=new Scanner(System.in);
		boolean isFound=false;
		String temp=null;
		int count=0;
		int linestodelete=4;
		String inp="";
		System.out.println("Enter the food price to delete all the informations:");
		String np=input.next();
		fd.setPrice(np);
		try {
			read=new FileReader(file);
			BufferedReader bfr2=new BufferedReader(read);
			while((temp=bfr2.readLine())!=null) {
				if(temp.contains(fd.getPrice())) {
					isFound=true;
					temp=null;
					count++;
					continue;
				}
				else if(isFound && count<linestodelete) {
					count++;
					temp=null;
				}
				else if(isFound && count==linestodelete) {
					temp=null;
					isFound=false;
				}
				else {
					inp+=temp +'\n'; 
				}
				
			}
			writer=new FileWriter(file);
			writer.write(inp);
			switch(count) {
			case 0:{
				System.out.println("There is no food price found,Please Try Again!!");
				break;
			}
			default:{
                System.out.println("Food Succesfully Deleted!!!");
				break;
			}
			}
			
		}catch(IOException e) {
			System.out.println(e);
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
				read.close();
			}
			catch(IOException io) {
				System.out.println("Can not close the resource!!");
			}
		}
		
	}
}
