//6
//IN MyArrayList<E>
--------------------THEORY(MEMORIZE)---------------

-VALIDATE INDEX
-FOR LOOP CLOSE GAP
-REMOVE ELEMENT

--------------------CODE-------------------------

//create remove method
public E remove(int index)
{
	
	//check index
	if(index<0 || index>=size)
		throw new IndexOutOfBoundsException("Index: "+index+", Size:"+size);
	
	E e = data[index];
	
	//shuffle elements - to the left
	for(int j=index; j<=size-1;j++)
		data[j]=data[j+1];
		
	data[size-1]=null;
	size--;
	return e;
}

-----------------PRACTICE----------------

public E remove(int index)
{
	if(index<0||index>=size)
		throw new IndexOutOfBoundsException();
	
	E e = data[index];
	
	for(int j=index;j<size-1;j++)
	{
		data[j]=data[j+1];
	}
	
	data[size-1]=null;
	size--;
	
	return e;
	
}

-------------------------------------------------------

public E remove(int index)

{
	if(index<0||index>=size)
		throw new IndexOutOfBoundsException();
	
	E e = data[index];
	
	for(int i=index;i<=size-1;i++)
		data[i]=data[i+1];
	
	data[size-1]=null;
	size--;
	return e;
}
