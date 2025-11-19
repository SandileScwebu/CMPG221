//5
//IN MyArrayList<E>
------------------THEORY(MEMORIZE)

-Return value
-Index validation

---------------code----------------
//create get method - get element from array
public E getElement(int index)
{
	
	//check index
	if(index<0||index>=size)
		throw new IndexOutOfBoundsException("Index: "+index+", Size:"+size);
	
	//return element
	return data[index];
}

---------------PRACTICE------------------

public E get(int index)
{
	if(index<0||index>=size)
		throw new IndexOutOfBoundsException();
	
	return data[index];
}

-----------------------------------------------------------------------------
public E get(int index)
{
	if(index<0||index>=size)
		throw new IndexOutOfBoundsException();
	
	return data[index];
}