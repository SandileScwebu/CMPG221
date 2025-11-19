//8

----------------------------CODE--------------------------------

public class QueueMyArrayList<E>
{
	private MyArrayList<E>	theQueue;
	
	public QueueMyArrayList()
	{
		theQueue = new MyArrayList<E>();
	}
	
	public void enqueue(E newElement)
	{
		if(theQueue.getSize()==theQueue.checkSpace())
			throw new IndexOutOfBoundsException();
		theQueue.add(theQueue.getSize(),newElement);
	}
	
	public E dequeue()
	{
		E temp = null;
		boolean isDone = false;
		
		if(theQueue.getSize()>0)
			temp.theQueue.remove(0);
		return temp;
	}
	
	public String toString()
	{
		return theQueue.toString();
	}
}

--------------------------PRACTICE----------------------------------

public class QueueMyArrayList<E>
(
	private MyArrayList<E> theQueue;
	
	public QueueMyArrayList()
	{
		theQueue = new MyArrayList<E>();
	}
	
	public void enqueue(E newElement)
	{
		theQueue.add(theQueue.getSize(),newElement);
	}
	
	public E dequeue()
	{
		E temp = null;
		boolean isDone = false;
		
		if(theQueue.getSize()>0)
			temp.theQueue.remove(0);
		return temp;
	}
	
	public String toString()
	{
		return theQueue.toString();
	}
	
)