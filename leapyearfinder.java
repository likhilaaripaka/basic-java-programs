package simpleProjects;

import java.util.Scanner;

public class Leapyearfinder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice="";
         do{
        	 System.out.print("Enter year: ");
    		 int year = scan.nextInt();
        	 if(year%400 ==0 || (year%4 ==0 && year%100!=0)){
        	  System.out.println("yahhh! "+ year + " is a leap year");
        	}
        	else {
        	  System.out.println(year +" is not a leap year!");	
        	}
        	 System.out.println("DO you want to try again? if (yes/ no)");
    		 scan.nextLine();
             choice = scan.nextLine().toLowerCase();
             
         }while(choice.equals("yes"));
          System.out.println("Thanks for using leapYear finder!");
           scan.close();
	   }

}
