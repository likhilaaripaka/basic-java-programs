package simpleProjects;

import java.util.Scanner;

public class Vowelsconsonants {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word ="";

	do {
	System.out.println("Enter a word: ");
	 word = scan.nextLine().toLowerCase();
	 int vowels=0;
	 int consonants = 0;
	 for(int i=0 ; i<word.length();i++) {
		 char ch = word.charAt(i);
	 if(Character.isLetter(ch)) {
	 if(ch== 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u') {
		 vowels++;
	 }
	 else {
		 consonants++;
	 }
	 }
	 }
	 System.out.println(vowels + " is a vowel");
	 System.out.println(consonants + " is a consonant");
	 System.out.println("Do you want to try again? if (yes/no)");
	}while(scan.nextLine().equalsIgnoreCase("yes"));
	System.out.println("Thank you for using v&c checker!");
	scan.close();
	
	}

}
