package Operators;

import java.util.Scanner;

public class LogicalOperator 
{

	public static void main(String[] args) 
	{
		//take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second no:");
		int num2=sc.nextInt();
		//Check both the numbers are even
		if(num1 % 2==0 && num2 % 2==0)
		{
			System.out.println("Both numbers are even.");
		}
		else 
		{
			System.out.println("Atleast one number is odd.");
		}
		//Check if either number is negative
		if(num1 < 0 || num2 < 0)
		{
			System.out.println("Atleast one number is negative.");
		}
		else 
		{
			System.out.println("Both numbers are non-negative.");
		}
		//Check both numbers are equal or not
		if(num1 == num2)
		{
			System.out.println("Both numbers are equal.");
		}
		else
		{
			System.out.println("Both numbers are not equal.");
		}
	}

}
