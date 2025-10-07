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