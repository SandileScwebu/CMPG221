public class Example
{
	
	public static void bucketSort(int[] a, int m) //parameters : the list + (largest value+1)"number of buckets"
	{
		//create array(each "array[i]" will represents a bucket)
		int[] buckets = new int[m];
		
		//P1
		//create buckets - each bucket"array[i]" initial element is 0
		for(int j=0; j<m;++j)
			buckets[j] = 0;
		
		
		//P2
		//the index of list a is going to be incremented 
		for(int i=0; i<a.length;++i)
			//the element in that index will be returned as "a[i]" 
			//the bucket for that element"value" will be incremented
			++buckets[a[i]];
		
		//P3
		//traverse buckets
		for(int i=0, j=0;j<m;++j)
			//
			for(int k=buckets[j]; k>0; --k)
				a[i++]=j; 
	}
}

//example:
// 0   1    2   3
// 5   4    2   1

//P1
//backet[0] = 0
//backet[1] = 0
//backet[2] = 0 
//backet[3] = 0
//backet[4] = 0 
//backet[5] = 0

/*P2
//backet[0] = 0
//backet[1] = 1
//backet[2] = 1 
//backet[3] = 0
//backet[4] = 1 
//backet[5] = 1
*/

/*P3
a[]=	i=0  j=0
a[1]=1  i=1  j=1
a[2]=2  i=2  j=2
a[]=    i=2  j=3
a[3]=4  i=3  j=4 
a[4]=5  i=4  j=5
*/