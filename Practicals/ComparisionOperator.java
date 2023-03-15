package Operators;

import java.util.Scanner;

public class ComparisionOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Number");
		int num1=sc.nextInt();
		System.out.println("Enter a Second Number");
		int num2=sc.nextInt();
		
		 // == operator
	    System.out.println(num1 == num2);  

	    // != operator
	    System.out.println(num1 != num2); 

	    // > operator
	    System.out.println(num1 > num2);  

	    // < operator
	    System.out.println(num1 < num2);  

	    // >= operator
	    System.out.println(num1 >=num2);  

	    // <= operator
	    System.out.println(num1 <= num2); 
	  }

}
