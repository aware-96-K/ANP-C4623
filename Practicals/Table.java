package corejava;
import java.util.Scanner; 
public class Table 
{
	public static void main(String[] args)
	{
		// take input from the user
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		//reading a number  
		int num=sc.nextInt();  
		//loop start execution form and execute until the condition i<=10 becomes false  
		for(int i=1; i <= 10; i++)  
		{  
		//prints table of the entered number      
		System.out.println(num+" * "+i+" = "+num*i);  
		}
	}
}
