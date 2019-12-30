package mypackage;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two integer numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int mul = num1*num2;
		int div = num1/num2;
		
		System.out.println("Mutliplication is "+mul);
		System.out.println("Division is "+div);
	}
}
