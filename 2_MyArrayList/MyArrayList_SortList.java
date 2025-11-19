//9
//IN MyArrayList<E>
-------------------------------THEORY(MEMORIZE)

-INITIALIZE HOLD
-FOR LOOP COMPARE ELEMENTS
-RETURN TRUE 

--------------------------------CODE------------------------
//create sort method
public boolean sortList()
{
	E hold;
	
	//first for loop - traverse array - example if size=10 and i=5 then 1-4 has been sorted, itll continue until j = 9 
	for(int i=0;i<size-1;i++)
	{
	
		//second for loop - swap elements
		for(int j=0;j<size-1;j++)
		{
			//swap elements - if "1" data[j+1] larger 
			if(((Comparable)data[j]).compareTo(data[j+1])>0)
			{
				hold = data[j+1];
				data[j+1]=data[j];
				data[j]=hold;
			}
		}
	}
	
	return true;
}

--------------------------------PRACTICE--------------

public boolean sortList()
{
	E hold;
	
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;i<size-1;j++)
		{
			if(((Comparable)data[j]).compareTo(data[j+1])>0)
			{
				hold = data[j];
				data[j]=data[j+1];
				data[j+1]=hold;
			}
		}
	}
	return true;

}