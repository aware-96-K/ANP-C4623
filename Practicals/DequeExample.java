package Collection;
import java.util.*;

public class DequeExample 
{

	public static void main(String[] args)
	{
		Deque<String> dq=new ArrayDeque<String>();
		//Adding elements using different methods
		dq.add("Sunflower");
		dq.addFirst("Rose");
		dq.add("lily");
		dq.addLast("Marigold");
		dq.add("Elephant");
		//printing the elements
		System.out.println("Elements are:"+dq);
		//remove and return the head of dequeue
		System.out.println("Removed element is:"+dq.pop());
		//remove and return the first element of the dequeue
		System.out.println("Element is :"+dq.pollFirst());
		//remove and return the last element of the dequeue
		System.out.println("Element is :"+dq.pollLast());
		

	}

}
