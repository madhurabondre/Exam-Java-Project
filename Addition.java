package mypackage;

import java.util.Scanner;

public class Addition 
{
	public static void main(String[] args) 
	{
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int add = num1+num2;
		int sub = num1-num2;
		
		System.out.println("Addition = "+add);
		System.out.println("Subtraction = "+sub);
	}
}
