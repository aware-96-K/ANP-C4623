package corejava;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		// Creating scanner to take input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a;
		a=sc.nextInt();
		do
		{
			System.out.println(a + " is a prime number");
            a++;
		}
		while(a%2==1);
        
        if(a%2==1)
        {
        do
        { 
            System.out.println(a+ " is NOT a prime number");
            a++;
        }
        while (a%2==0);
        }
		
		
	}

}
