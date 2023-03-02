package corejava;
//Using inheritance we used extend keywords.
public class AbstractionData extends AbstractionExample
{
private double salary;
	//create parameterized constructor.
public AbstractionData(int id, String name, String address, double salary) {
	super(id, name, address);
	this.salary = salary;
}
public void mailcheck() {
	System.out.println("Mailing check to :"+getName());
}

}
