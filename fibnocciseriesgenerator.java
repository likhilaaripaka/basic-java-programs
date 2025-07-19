package simpleProjects;

import java.util.Scanner;

public class Fibnocciseries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice;
	do {
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		int a=0;
		int b =1;
		
		for(int i=1;i<=number;i++) {
			System.out.println(a + " ");
			int nextterm = a + b;
			a = b;
			b = nextterm;
			}
		System.out.print("Do you want to try again (yes/no)");
		scan.nextLine();
		choice = scan.nextLine();
	}while(choice.equalsIgnoreCase("yes"));
		scan.close();
		
	}

}
