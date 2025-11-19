//9

-----------------------CODE------------------------------

public class TestQueueMyArrayList
{
	public static void main(String[] args)
	{
		Integer first =null;
		QueueMyArrayList<Integer> myQueue = mew QueueMyArrayList<Integer>();
		
		System.out.println("Initial list");
		System.out.println(myQueue);
		
		System.out.println("Add one:");
		myQueue.enqueue(new Integer(7));
		System.out.println(myQueue);
		
		System.out.println("Delete one: ");
		first = (Integer) myQueue.dequeue();
		if(first!=null)
			System.out.println("First item: "+first.intValue());
		else
			System.out.println("Empty list");
		System.out.println(myQueue);
	}
}

----------------------PRACTICE-------------------------------------

public class QueueMyArrayList
{
	public static void main (String[] args)
	{
		Integer first=null;
		QueueMyArrayList<Integer> myQueue = new QueueMyArrayList<Integer>();
		
		System.out.println("Initial:");
		System.out.println(myQueue);
		
		System.out.println("Add one:");
		myQueue.enqueue(new Integer(5);
		System.out.println(myQueue);
		
		System.out.println("Delete one:");
		first = (Integer) myQueue.dequeue();
		if(first!=null)
			System.out.println("First: "+first.intValue());
		else
			System.out.println("Empty");
		System.out.println(myQueue);
	}
}

