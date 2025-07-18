package simpleProjects;

import java.util.Scanner;

public class FactorialFinder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a non-negative integer: ");
		
		String choice;
		
		do {
			int number = scan.nextInt();
			if(number<=0) {
				System.err.println("please enter non-negative integer only!!");
			}
			else{
				double factorial = 1;
				for(int i =1 ; i<=number ; i++) {
					factorial *= i;
				}
				System.out.println("factorial of "+number + "is " +factorial);
				
			}
			System.out.println("Do you want to try again (yes/no)");
			scan.nextLine();
			choice = scan.nextLine().toLowerCase();
			System.out.println("Enter non-negative integer: ");
		}while(choice.equals("yes"));
		System.out.println("Thank you using Factorial finder!");
		scan.close();
	}

}
