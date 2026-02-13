package ConditionalStatements;

import java.util.Scanner;

public class A3Q9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter temperature: ");
		int temp=sc.nextInt();
		
		if(temp>30) {
			System.out.println("Its hot");
		}else if(30>temp && temp>=20) {
			System.out.println("Its warm");
		}else if(19>=temp && temp>=10) {
			System.out.println("Its cold");
		}else {
			System.out.println("Its very cold");
		}
	}

}
