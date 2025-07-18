package simpleProjects;

import java.util.Scanner;

public class Palindromechecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String choice ;
		do {
			System.out.println("Enter a word to check if it is palindrome or not");
			String original = scan.nextLine();
			String reversed = "";
			
			for(int i=original.length()-1;i>=0;i--) {
				reversed += original.charAt(i);
			}
			
			if(original.equals(reversed)) {
				System.out.println("yahhhh your word "+ original + " is palindrome!");
			}
			else {
				System.out.println("sorry your word "+ original + " is not palindrome!");
			}
			
			System.out.println("Do you want to try again : (yes/no)");
			
			choice = scan.nextLine().toLowerCase();
		}while(choice.equals("yes"));
		System.out.println("thank you for using palindrome checker !");
		scan.close();
	}

}
