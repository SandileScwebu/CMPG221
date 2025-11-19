//2
--------THEORY(MEMORIZE)

-ARRAY
-ARRAY MAX NUMBER ELEMENT
-ARRAY CURRENT ELEMENTS
	
----------CODE--------------
//create array class
public class MyArrayList<E>
{
	
	//initialize array & size variable
	private int size;
	private E[] data;
	private int MAX = 100;
	
	//create array method
	public MyArrayList()
	{
		
		//define array
		//Object from super super Java class
		data = (E[]) new Object[MAX];
		size = 0;
	}
	
}

------------PRACTICE-------------

public class MyArrayList<E>
{
	private int size;
	private E[] data;
	private int MAX;
	
	public MyArrayList()
	{
		data = (E[]) new MyArrayList[MAX]
		size=0;
	}
}