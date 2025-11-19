//7
//IN MyArrayList<E>
------------------Theory(Memorize)

-Result variable
-For Loop List To String 
-Return Result

-----------------------CODE---------------------
//create toString method
public String toString()
{
	String result= "[";
	
	//create array list string
	for(int i=0;i<size;i++)
	{
		result += data[i];
		
		// add comma end of each element
		if(i<=size-1)
			result += ",";
	}
	
	//toString from Super Object class
	return result.toString()+"]";
}

-----------------------PRACTICE-------------------

public String toString()
{
	String result = "[";
	
	for(int i=0;i<size;i++)
	{
		result += data[i];
		if(i!=size-1)
			result += ","
	}
	
	return result.toString() + "]";
}



-------------------------------------------------------


public String toString()
{
	String result = "[";
	
	for(int i=0; i<size;i++)
	{
		result+=data[i];
		if(i<size)
			result+=",";
		
	}
	return result.toString() + "]";
}