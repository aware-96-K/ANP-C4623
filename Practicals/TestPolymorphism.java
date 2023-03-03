package corejava;

public class TestPolymorphism {

	public static void main(String[] args)
	{
		PolymorphismAnimal pa=new PolymorphismAnimal();
		Dogss d=new Dogss();
		Catss c=new Catss();
		pa.makesound();
		d.makesound();
		c.makesound();
		//Creating another object class Animal that refer to 
		//the object of type Dog
		PolymorphismAnimal a1=new Dogss();
		a1.makesound();
	}
}
