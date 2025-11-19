//4
//create test class 


-----------------------------CODE--------------------------------

public class TestQueueMyLinkedList<E>
{
	public static void main(String[] args)
	{
		Integer first = null;
		QueueMyLinkedList<Integer> myQueue = new QueueMyLinkedList<Integer>();
		
		System.out.println("Test empty: ");
		System.out.println(myQueue);
		
		System.out.println("Enqueue one: ");
		myQueue.enqueue(new Integer(8));
		System.out.println(myQueue);
		
		System.out.println("Dequeue one: ");
		first = (Integer) myQueue.dequeue();
		if(first!=null)
			System.out.println("First elemen is: ");
		else
			System.out.println("Empty Queue");
		System.out.println(myQueue);
		
	}
	
}

----------------------------PRACTICE-----------------------------