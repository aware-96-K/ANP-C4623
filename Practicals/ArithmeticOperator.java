package Operators;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int sum=num1+num2;//addition
		System.out.println("Addition:"+sum);
		int sub=num1-num2;//subtraction
		System.out.println("subtraction:"+sub);
		int mul=num1*num2;//Multiplication
		System.out.println("Multiplication:"+mul);
		int Div=num1/num2;//Division
		System.out.println("Division:"+Div);
		int Mod=num1%num2;//Modulus
		System.out.println("Modulus:"+Mod);
		sc.close();
	}
}
