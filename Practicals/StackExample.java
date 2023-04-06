package Collection;
import java.util.*;

public class StackExample {

	public static void main(String[] args) 
	{
		Stack<String> st=new Stack<String>();
		//Adding object in stack
		
		st.push("mango");
		st.push("Apple");
		st.push("orange");
		st.push("Grapes");
		st.push("mango");
		st.pop();
		
		//traversing list to iterator
		Iterator itr=st.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}

	}

}
