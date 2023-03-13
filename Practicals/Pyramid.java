package corejava;

public class Pyramid {

	public static void main(String[] args) {
		//5 rows we have to insert
		int rows= 5;
		System.out.println("Prints a pyramid of asterisks");
		for (int i=1;i <=rows; ++i)
		{
			for(int j=1;j <=i; ++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}