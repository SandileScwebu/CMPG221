//4
//IN MyArrayList<E>
-----------------THEORY(MEMORIZE)

-FOR LOOP TREVERSE CHECK
-RETURN

--------------CODE------------
//create contains"equals" method
public boolean isContains(Object e)
{
	
	//check multiple times (traverse) - check each element for e
	for(int i=0; i<size;i++)
		if(e.equals(data[i]))
			return true;
	return false;
}

-----------PRACTICE-------------

public boolean isContains(Object e)
{
	for(int i=0;i<size;i++)
	{
		if(e.equals(data[i]))
			return true;
	}
	return false;
}

-----------------------------------------------------------------------------
public boolean isContains(Object e)
{
	for(int i=0;i<size;i++)
		for(e.equals(data[i]))
			return true;
	return false;
	
}

--------------things i forget
when comparing use the equals method on e"the element"
dont verify index