package corejava;
class Animal4 {
	//method 
		public void display()
		{
			System.out.println("Inside parent class");
		}
	}
	//child class
	class Dog3 extends Animal4
	{
	public void bark()
	{
		System.out.println("Barks...");
	}
	}
	class Cats extends Animal4
	{
		public void meow()
		{
			System.out.println("meow meow....");
		}
	}
class HierarchicalAnimal {

	public static void main(String[] args) {
		
		Dog3 d=new Dog3();//creating object of child class 
		d.display();
		d.bark();
		Cats c=new Cats();
		c.display();
		c.meow();
	}
}

