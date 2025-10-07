//Example 1.3 - i ITERATION

public static void insertionSort(int[] list)
{
	for(int i=3; i<list.length; i++) //create traverse list index
	{
		//EXAMPLE list[i]=1
		
		int currentElement = list[i];  //hold the element that will be inserted into sublist
		int k; 
		
		//if element i smaller than element k - a loop that will start at list[i], inserting list[k] into sublist"k greater than i", end when k equal/smaller zero
		for(k=i-1; k>=0 && list[k] > currentElement; k--)
		{
			//SUBLIST list k
			//EXAMPLE INDEX:    0  1   2  3
			//EXAMPLE ELEMENT:  2  4   4  5
			
			list[k+1]=list[k];
			
			//SUBLIST list k
			//EXAMPLE INDEX:    0   1   2  3
			//EXAMPLE ELEMENT:  2   2   4  5
		}
		//stops executing at k=-1 because i=0
		
		//so k(-1)+1 = 0 
		list[k+1] = currentElement;
		
		//SUBLIST list k
		//EXAMPLE INDEX:    0   1  2  3
		//EXAMPLE ELEMENT:  1   2  4  5
	}
}



//EXAMPLE list n 
//INDEX:    0   1  2  3
//ELEMENT:  5   2  4  1