package corejava;

public class TestData
{

	public static void main(String[] args)
	{
		// creating object of class StudentData
		StudentData a=new StudentData();
		// object is used to access the methods of a class
		a.setId(1);
		a.setName("Pranita");
		a.setAge(21);
		System.out.println(" Sudent Id:"+a.getId()+"\n"+" Student Name:"+a.getName()+"\n"+" Student Age:"+a.getAge());

	}

}