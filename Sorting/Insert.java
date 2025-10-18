//SORT LIST BY REPEATEDLY INSERT UNSORTED ELEMENT INTO SORTED SUBLIST
-----THEORY------

int[] myList = { 2, 9, 5, 4, 8, 1, 6};


2|	9	5	4	8	1	6
subList = {2}

2	9|	5	4	8	1	6
subList = {2, 9}
"MY NOTES - WHEN MOVING UNSORTED ELEMENT[i] 9 TO THE CORRECT PLACE IN SORTED LIST. TEST IF [i] SMALLER THAN SORTED ELEMENT[k=i-1](2): IF IT IS INSERT ON RIGHT. IF NOT DECREMENT THEN TEST"

2	5	9|	4	8	1	6
subList = {2, 5, 9}

2	4	5	9|	8	1	6
subList = {2, 4, 5, 9}

2	4	5	8	9|	1	6
subList = {2, 4, 5, 8, 9}

1	2	4	5	8	9|	6
subList = {1, 2, 4, 5, 8, 9}

1	2	4	5	6	8	9|	
subList = {1, 2, 4, 5, 8, 9}


-----CODE-----
//public class 

public static void insertionSort(int[] list)
{
	for(int i=1; i<list.length; i++) //create traverse list index
	{
		//EXAMPLE list[i]=2
		
		int currentElement = list[i];  //hold the element that will be inserted into sublist
		int k; 
		
		//if element i smaller than element k - a loop that will start at list[i], inserting list[k] into sublist"k greater than i", end when k equal/smaller zero
		for(k=i-1; k>=0 && list[k] > currentElement; k--)
		{
			//SUBLIST list k
			//EXAMPLE INDEX:    0     
			//EXAMPLE ELEMENT:  5   
			
			list[k+1]=list[k];
			
			//SUBLIST list k
			//EXAMPLE INDEX:    0   1   
			//EXAMPLE ELEMENT:  5   5
		}
		//When loop exits k=-1 
		list[k+1] = currentElement;
		
		//SUBLIST list k
		//EXAMPLE INDEX:    0   1   
		//EXAMPLE ELEMENT:  2   5
	}
}

//public static void main

//EXAMPLE list n 
//INDEX:    0   1  2
//ELEMENT:  5   2  4

---FOR PRACTISE--- 

public static void insertionSort(int[] list)
{
	for(int i=1; i<list.length;i++)
	{
		int currentElement = list[i];
		int k;
		
		for(k=i-1;k>=0 && list[k] > list[i];k--)
		{
			list[k+1]=list[k];
		}
		
		list[k+1] = currentElement;
	}
}
