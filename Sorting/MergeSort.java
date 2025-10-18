-----THEORY - MERGE SORT---
2	9	5	4	8	1	6	7
[DIVIDE-SPLIT]
SPLIT
2	9	5	4							|							8	1	6	7
SPLIT
2	9	|	5	4						|						8	1	|	6	7
SPLIT
2	|	9		|		5	|	4		|		8	|	1		|		6	|	7

[CONQUER-SORT&MERGE]

(2	|	9)		|		(5	|	4)		|		(8	|	1)		|		(6	|	7)
MERGE
(2	9			|		4	5)			|			(1	8			|		6	7)
MERGE
(2	4	5	9							|							1	6	7	8)
MERGE
1	2	4	5	6	7	8	9

-----THEORY - MERGE TWO SORTED LISTS ---

LIST 1				 LIST 2
*2	4	5	9		|		*1	6	7	8

LIST 3 - "COMPARE *2 AND *1. ENTER LOWEST INTO LIST 3. INCREMENT POINTER"
-	-	-	-	-	-	-	-

	A.INSERT 1

LIST 1				 LIST 2
*2	4	5	9		|		1	*6	7	8

LIST 3 - "AFTER INSERT 1"
1	-	-	-	-	-	-	-

	B.INSERT 2

LIST 1				 LIST 2
2	*4	5	9		|		1	*6	7	8

LIST 3 - "AFTER INSERT 2"
1	2	-	-	-	-	-	-

	C.INSERT 9

LIST 1				 LIST 2
2	4	5	*9		|		1	6	7	*8

LIST 3 - "AFTER INSERT 9"
1	2	4	5	6	7	8	9

-----CODE----
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