//3
//create queue class to add to the tail and remove from the head of linked list

--------------------------------CODE-----------------------------------------

public class QueueAsMyLinkedList<E>
{
	private MyLinkedList<E> theQueue;

	public QueueAsMyLinkedList()
	{
		theQueue = new MyLinkedList<E>;
	}
	
	public void enqueue(E newElement)
	{
		theQueue.append(newElement);
	}
	
	public E dequeue()
	{
		E temp = null;
		boolean isDone = false;
		
		temp = theQueue.getFirst();
		if(temp!=null)
		{
			isDone=theQueue.delete(temp);
		}
		if(isDone)
			return temp;
		else
			return null;
	}
	
	public String toString()
	{
		return theQueue.toString();
	}
	
}

-----------------------------------PRACTICE---------------------------------

public class QueueMyLinkedList<E>
{
	private MyLinkedList<E> theQueue;
	
	public QueueMyLinkedList()
	{
		theQueue = new MyLinkedList<E>;
	}
	
	public void enqueue(E newElement)
	{
		theQueue.append(newElement);
	}
	
	public E dequeue()
	{
		E temp = null;
		boolean isDone = false;
		
		temp = theQueue.getFirst();
		if(temp!=null)
		{
			isDone = theQueue.delete(temp);
		}
		if(isDone)
		{
			return temp;
		}
		else
		{
			return null;
		}
		
		public String toString()
		{
			return theQueue.toString();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}