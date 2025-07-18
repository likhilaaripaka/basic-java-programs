package simpleProjects;

import java.util.Scanner;

class Calculatorapp{
	
	public double add(double a , double b) {
		return a+b;
	}
	public double sub(double a , double b) {
		return a-b;
	}
	public double mul(double a , double b){
		return a*b;
	}
	public double div(double a , double b) {
		if(b==0) {
			System.out.println("second number should be nonzero!!");
		}
		return a/b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculatorapp calcapp = new Calculatorapp();
		System.out.print("Enter first number: ");
        double number1 = scan.nextDouble();
        
        System.out.println("Select operator (+ , - , * , / )");
        char operator = scan.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double number2 = scan.nextDouble();
        double result = 0;
        switch(operator) {
        case '+' :
        	result = calcapp.add(number1 , number2);
        break;
        case '-' :
        	result = calcapp.sub(number1, number2);
        break;
        case '*' :
        	result = calcapp.mul(number1, number2);
        break;
        case '/' :
        	result = calcapp.div(number1, number2);
        break;
        default:
        	System.out.println("give this operators only: + , - , * , /");
        	return ;
        }
        System.out.println("result : " + result);
	}

}
