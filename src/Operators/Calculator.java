package Operators;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a and b: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition value is : "+(a+b));
		System.out.println("Subtraction result is: "+(a-b));
		System.out.println("Multiply result is: "+(a*b));
		System.out.println("Division result is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
	}

}
