package corejava;

public class TestData
{

	public static void main(String[] args) 
	{
		//print student data line 
		System.out.println("Student data"+"\n");
		//create a variable to printing student data
		StudentData s1=new StudentData();
		//use the variable of creating student data
		s1.setId(1);
		s1.setName("Pranu");
		s1.setAge(21);
		//printing the data
		System.out.println("Student ID:"+s1.getId()+"\n"+"Student Name:"+s1.getName()+"\n"+"Student Age:"+s1.getAge());
		

	}

}