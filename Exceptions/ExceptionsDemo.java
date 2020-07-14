package Exceptions;

import java.util.*;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int sum=0,diff=0,prod=0,div=0;
		try {
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sum = a+b;
		diff = a-b;
		prod = a*b;
		div = a/b;
		
		
		}
		catch(ArithmeticException ae) {
			System.out.println("Division by 0 not allowed");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Non-digits not allowed");
		}
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("Enter exactly two numbers");
		}
		catch(Exception e) {
			System.out.println("Exception caught... ");
		}

		System.out.println("Sum: " + sum + " Diff: "+diff+" Prod: "+prod+" Div: "+div);
	}

}
