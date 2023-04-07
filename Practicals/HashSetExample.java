package Collection;
import java.util.*;

public class HashSetExample 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> hs=new HashSet<Integer>();
		//add elements
		hs.add(7);
		hs.add(8);
		hs.add(1);
		
		//printing the elements
		System.out.println("Elements are:"+hs);
		
		Integer c=8;
		//check whether the integer is available or not
		System.out.println("Element contains :"+c+" "+hs.contains(c));
		
		
	}

}
