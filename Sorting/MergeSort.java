
public MyArrayList<E> merge(MyArrayList<E> param)
{
	//initialize counters
	int i=0;
	int j=0;
	int k=0;
	
	//create returnArray
	MyArrayList<E> returnArray = new MyArrayList();
	
	
	//special cases
	if(this.getSize()==0) //list 1 empty
		return param;
		
	if(param.getSize()==0) //list 2 empty
		return this;
	
	if((this.getSize()+ param.getSize())>MAX) //list 3 too large
		throw new IndexOutOfBoundsException("Combined list out of bound")
	
	
	
	
	//part 1 of list 3
	while(i<this.getSize() && j<param.getSize())
	{
		//add to list 3 - -1 data i smaller /1 data j smaller
		//compare list 1 & 2
		if(((Comparable)data[i]).compareTo(param.data[j])<0)
		{
			//insert into list 3
			returnArray.data[k] = this.data[i];
			k++;
			//increment from inserted list
			i++;
		}
		else
		{
			//insert into list 3
			returnArray.data[k] = param.data[j];
			k++;
			//increment from inserted list
			j++;
		}
	}
	
	//part2 of list 3 -remaining array
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