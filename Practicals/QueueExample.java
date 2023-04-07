package Collection;
import java.util.*;

public class QueueExample 
{

	public static void main(String[] args)
	{
		//Creating an object of Queue interface
		Queue<Integer> que=new LinkedList<Integer>();
				
		//Add elements in the queue using for loop
		for(int i=0;i<5;i++) 
		{
			que.add(i);
		}
		
		//Display the elements of the queue	
		System.out.println("Elements of queue: "+q);

		//To remove the head of queue
		int r=q.remove();
		System.out.println("Remove element is:"+r);
		System.out.println("Elements of queue: "+q);//after removal
		
		//To view the head element of queue
		int h=q.peek();
		System.out.println("Head of queue:"+h);
		
		//size of queue
		int s=q.size();
		System.out.println("Size of queue:"+s);

	}

}
