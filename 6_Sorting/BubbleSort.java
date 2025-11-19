//2
----THEORY---

2	9	5	4	8	1

Go to first element[i]
Test element 1 (i) greater than element 2 (j+1): 
			If i larger swap. 
			
			If i smaller compare next two element

1ST PASS
2	|9	5|	4	8	1
2	5	|9	4|	8	1
2	5	4	|9	8|	1
2	5	4	8	|9	1|
2	5	4	8	1	9

2ND PASS
2	|5	4|	8	1	
2	4	|5	8|	1	
2	4	5	|8	1|	
2	4	5	1	8	

3RD PASS
2	|4	5|	1		
2	4	|5	1|		
2	4	1	5		

4TH PASS
2	|4	1|			
2	1	4			

5TH PASS
|2	1|	
1	2	




----CODE-----
//create sort method
public boolean sortList()
{
	E hold;
	
	//first for loop - traverse array 
	for(int i=0;i<size-1;i++)
	{
	
		//second for loop - swap elements
		for(int j=0;j<size-1;j++)
		{
			//swap elements - if "-1" data[j+1] larger 
			//					 "1" data[j] larger 

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

---PRACTICE----

public boolean sortList()
{
	E hold;
	
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size-1;j++)
		{
			if((Comparable)data[j].compareTo(data[j+1])>0)
			{
				hold = data[j+1];
				data[j+1] = data[j];
				data[j] = hold;
			}
		}
	}
	
	return true;
	
}
