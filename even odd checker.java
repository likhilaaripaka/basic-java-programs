package simpleProjects;

import java.util.Scanner;

public class Evenoddcheck {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number : ");
	String choice;
	
	
	do{
		int number = scan.nextInt();
		if(number%2==0) {
	
		System.out.println(number +" is even!");
		}
	 else{
		System.out.println(number + " is odd!");
	}
	System.out.print("do you want to try once again! if enter yes/no : ");
	scan.nextLine();
	choice = scan.nextLine().toLowerCase();
	
	}
	while (choice.equals("yes"));
	System.out.println("Thank you for choosing even or odd checker!");

}
}