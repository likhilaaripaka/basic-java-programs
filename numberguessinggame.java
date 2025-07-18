package simpleProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int numberToGuess = rand.nextInt(100)+1;
		int guess;
		int attempts=0;
		
		System.err.println("-------------------WELCOME TO NUMBERGUESSING GAME------------------");
		System.err.print("guess a number between 1 and 100 - ");
		
		do {
			guess = scan.nextInt();
			attempts++;
			
			if(guess < numberToGuess ) {
				System.out.println("your number is too low!");
			}
			else if(guess > numberToGuess ) {
				System.out.println("your numberis too high!");
			}
			else {
				System.out.println(" yahhhhhh! you got it  "+ guess + " its correct");
			}
		}while(guess != numberToGuess);
	    scan.close();	
	}

}8q
