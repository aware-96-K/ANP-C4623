package corejava;
import java.util.Scanner;

public class EvenNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a positive integer: ");
	    int num = sc.nextInt();
	    int i = 2;
	    while (i <= num) 
	    {
	        if (i % 2 == 0)
	        {
	            System.out.print(i + " ");
	        }
	        i++;
	    }
	}
}