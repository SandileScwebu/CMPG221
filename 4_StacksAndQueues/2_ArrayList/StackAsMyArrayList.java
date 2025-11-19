//6
// stack class for array list

----------------------------------CODE-------------------------------
public class StackAsMyArrayList<E>
{
	MyArrayList<E> theStack;
	
	public StackAsMyArrayList()
	{
		theStack = new MyArrayList<E>(); 
	}
	
	//check space
	public void push(E newElement)
	{
		if(!theStack.checkSpace())
		throw new IndexOutOfBoundsException("Stack out of bounds");
		theStack.add(theStack.getSize(),newElement);
	}
	
	public E pop()
	{
		//return removed value
		E temp = null;
		
		boolean isDone = false;
		if(theStack.getSize()>0)
			temp = theStack.remove(theStack.getSize()-1);
		return temp;
	}
	
	public String toString()
	{
		return theStack.toString;
	}

}
-----------------------------------PRACTICE----------------------------

public class StackMyArrayList<E>
{
	private MyArrayList<E> theStack;
	
	public StackMyArrayList()
	{
		theStack = new MyArrayList<E>();
	}
	
	public void push(E newElement)
	{
		if(!theStack.checkSpace())
			throw new IndexOutOfBoundsException();
		theStack.add(theStack.getSize(),newElement);
	}
	
	public E pop()
	{
		E temp = null;
		
		boolean isDone=false;
		if(theStack.getSize()>0)
		{
			temp = theStack.remove(theStack()-1)
		}
		return temp;
		
	}
	
	public String toString()
	{
		return theStack.toString();
	}
	
	
	
	
	
	
	
	
	
	
}