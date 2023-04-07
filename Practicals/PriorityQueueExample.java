package Collection;
import java.util.*;

public class PriorityQueueExample
{

	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		//Adding elements
		pq.add(11);
		pq.add(67);
		pq.add(99);
		pq.add(89);
		//display the elements
		System.out.println("Total elements are :"+pq);
		//printing the top element
		System.out.println("Top element is :"+pq.peek());
		//Removing the top element
		System.out.println("Removed element is:"+pq.poll());
		
		System.out.println("Total elements are:"+pq);
		
		

	}

}
