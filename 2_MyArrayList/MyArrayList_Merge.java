//14
//MERGE MyArrayList
//IMPORTANT lists must be first sorted 
--------------------------THEORY(MEMORIZE)

-TEST
-INSERT
-INSERT REMAINING

----------------------------------CODE-------------------------------
//create merge method - using step 1-3
//step 2.2 - create method
public MyArrayList<E> merge(MyArrayList<E> param)
{
	//step 2.3 - initialize counters
	int i=0;
	int j=0;
	int k=0;
	
	//step 2.3 - create returnArray
	MyArrayList<E> returnArray = new MyArrayList();
	
	//step 3.1 - special cases. list 1 empty.list 2 empty. list 3 too large
	if(this.getSize()==0) //list 1
		return param;
		
	if(param.getSize()==0) //list 2
		return this;
	
	if((this.getSize()+ param.getSize())>MAX)
		throw new IndexOutOfBoundsException("Combined list out of bound")
	
	//step 2.3 - compare list 1/list 2 and copy remaining
	while(i<this.getSize() && j<param.getSize())
	{
		//add to list 3
		if(((Comparable)data[i]).compareTo(param.data[j])<0)
		{
			returnArray.data[k] = this.data[i];
			k++;
			i++;
		}
		else
		{
			returnArray.data[k] = param.data[j];
			k++;
			j++;
		}
	}
	
	//remaining array
	if(i<this.getSize())
	{
		for(i=i;i<this.getSize();i++)
		{
			returnArray.data[k] = this.data[i];
			k++;
		}
	}
	
	if(j<param.getSize())
	{
		for(j=j;j<param.getSize();j++)
		{
			returnArray.data[k] = this.data[j];
			k++;
		}
	}
	
	returnArray.size = k;
	return returnArray;
}

---------------------------PRACTICE----------------------------

public MyArrayList<E> merge (MyArraylist<E> param)
{
	int i=0;
	int j=0;
	int k=0;
	
	MyArrayList<E> returnArray = new MyArrayList();
	
	//test
	if(this.getSize()==0)
		return param;
	
	if(param.getSize()==0)
		return this;
	
	if((this.getSize()+param.getSize())>MAX)
		throw new IndexOutOfBoundsException("Combined list out of bound");
	
	//insert part 1
	while(i<this.getSize()&& j<param.getSize())
	{
		if(((Comparable)data[i]).compareTo(param.data[j])<0)
		{
			returnArray.data[k] = this.data[i];
			k++;
			i++;
		}
		else
		{
			returnArray.data[k] = param.data[j];
			k++;
			j++;
		}
	}
	
	//insert part 2 - remaing array
	
	if(i<this.getSize())
	{
		for(i=i;i<this.getSize();i++)
		{
			returnArray.data[k] = this.data[i];
			k++;
		}
	}
	
	if(j<param.getSize())
	{
		for(j=j;j<para.getSize();j++)
		{
			returnArray.data[k] = param.data[j];
			k++;
		}
	}
	
	returnArray.size = k;
	return returnArray;
	
}

-------------------------------------------------------------------------------

public MyArrayList<E> merge (MyArrayList<E> param);
{
	int i = 0;
	int j = 0;
	int k = 0;
	
	MyArrayList<E> returnArray = new MyArrayList
	
	if(this.getSize()==0)
		return param;
	
	if(param.getSize()==0)
		return this;
	
	if((this.getSize()+param.getSize())>MAX)
		throw new IndexOutOfBoundsException();
	
	while(i<this.getSize()&& j<param.getSize)
	{
		if(((Comparable)data[i])compareTo(param.data[j])<0)
		{
			returnArray.data[k]= data[i];
			k++;
			i++;
		}
		else
		{
			returnArray.data[k]=param.data[j];
			k++;
			j++;
		}
	}
	
	if(i<this.getSize())
	{
		for(int i=i;i<this.getSize();i++)
		{
			returnArray.data[k]=data[i];
			k++;
			i++;
		}
	}
	
	if(j<param.getSize())
	{
		for(int j=j;j<this.getSize();j++)
		{
			returnArray.data[k]=data[j];
			k++;
			j++;
		}
	}
	
	
	returnArray.size = k;
	return returnArray;
	
}











































