package corejava;

class PolymorphismAnimal 
{

	public void makesound() {
		System.out.println("Animal makes a sound");
	}
}
class Dogss extends PolymorphismAnimal
{
	public void makesound() 
	{
		System.out.println("Barks....");
	}
}
class Catss extends PolymorphismAnimal
{
	public void makesound()
	{
		System.out.println("Meow Meow");
	}
}
