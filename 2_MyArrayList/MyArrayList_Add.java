//3
//In MyArrayList<E> class
-----------THEORY(MEMORIZE)

-INDEX VALIDATION
-FOR LOOP LAST ELEMENT 
-INSERT


-----------CODE-------------
//create add method - add element into array
public void add(int index, E e)
{
	
	//check index
		//"index<0" means index is negative 
		//"index>=size" allows index to be 0
	if(index<0 || index >= size)
		throw new IndexOutOfBoundsException(/*"Index must not be negative and larger or equal to current number of element(size)"+*/"Index:" + index + ", Size: "+size);
	
	//code to move last position and make space for new element
	for(int i = size - 1; i >= index /*here the only time itll execute is if index = last element index*/; --i)
		data[i+1] = data [i];
	
	//add elements
	data[index] = e;
	size++;
	
}

---------------PRACTICE------------------

public void add(int index, E e)
{
	if(index<0||index>=size)
		throw new IndexOutOfBoundsException();
	
	for(int i=size-1, i>=index,i--)
	{
		data[i+1]=data[i];
	}
	
	data[index] = e;
	size++;
	
}

-----------------------------------------------------------------------------
public class MyArrayList<E>
{
	private int MAX;
	private E[] data;
	private int size;
	
	public MyArrayList()
	{
		data = (E[]) new Object[MAX];
		size=0;
	}
	
	public void add(int index, E e)
	{
		if(index<0||index>=size)
		{
			throw new IndexOutOfBoundsException();
		}
		
		for(int i=size-1;i>index;--i)
			data[i+1]=data[i];
		
		data[index]=e;
		size++;
	}
	
-------------------things i forget
ADD METHOD IS NOT AN VALUE RETURNING METHOD. SET METHOD NOT GET METHOD.	
}
-----------------------------------------------------------------------------






