package corejava;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// Creating Scanner to take input from user
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter number between 10 to 20:");
		 a=sc.nextInt();
		while(a<10 || a>20)
		{
			System.out.println("Invalid input please Enter a number between 10 and 20");
			System.out.println("Enter number between 10 to 20:");
			 a=sc.nextInt();
		}
		System.out.println("you Enter a number:"+a);
	}

}
