//12
//IN MyArrayList<E>
--------------------------THEORY(MEMORIZE)

-TEST
-INSERT

------------------------CODE--------------------------
//create filter method (keep values in range)- using step 1-3
//step 2.2 - create filter method
public void filter(E low, E high)
{

	//step 2.3 - initialize list 2
	int j=0;
	//LIST3
	E[] temp = (E[]) new Object[MAX];
	
	//step 3.2  solution to two special cases	
	if(getSize()==0)
		return;
	//IF LOW>HIGH then RETURN
	if(((Comparable)low).compareTo(high)>0)
		return;
		
	//step 2.3 - traverse array and add to list 2
	for(int i=0;i<=size-1;i++)
	{
		// step 2.3 - compare array values to parm
		if(((Comparable)data[i]).compareTo(low)>=0 && ((Comparable)data[i]).compareTo(high)<=0) // if (1) && (-1)
		{
			temp[j] = data[i];
			j++;
		}
	}
	//step 2.3 - replace old list w/ new list
	data = temp;
	size = j;
}

-------------------PRACTICE------------------------------

public void filter(E low, E high)
{
	E[] temp = (E[]) new Object[MAX];
	int j=0
	
	if(this.getSize()==0)
		return;
	
	if((((Comparable)low).compareTo(high))>0)
		return;
	
	for(int i=0;i<=size-1;i++)
	{
		if((((Comparable)low).compareTo(data[i]))<=0 && (((Comparable)high).compareTo(data[i]))>=0)
		{
			temp[i] = data[i];
			j++;
		}
	}
	data=temp;
	size=j;
}

-------------------------------------------------------
