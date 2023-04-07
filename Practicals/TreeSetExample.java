package Collection;
import java.util.*;

public class TreeSetExample
{

	public static void main(String[] args) 
	{
		Set<String> s=new TreeSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
	
		System.out.println("Elements are:"+s);
		String r="P";
		System.out.println("Add the element p :"+s.add(r));
		System.out.println("Elements are:"+s);
		
		System.out.println("Remove the element p :"+s.remove(r));
		System.out.println("Elements are:"+s);
		
		
		

	}

}
