//13
//NEW TestMyArray FOR Filter
--------------------------THEORY(MEMORIZE)

-TEST EMPTY
-TEST LOW>HIGH
-TEST HIGH>LOW

--------------------------CODE--------------------------------
//create filter test class
public class TestMyArray
{
	public static void main(String[] args)
	{
		//create wrapper class - empty list
		MyArrayList<Integer> list = new MyArrayList<>();
		
		//step 3.2 - check empty list
		System.out.println("Test empty list:"+list);
		list.filter(new Integer(3), new Integer(5));
		System.out.println("Test filtering empty list:"+list);
		
		//add to list
		list.add(0,new Integer(6));
		list.add(1,new Integer(5));
		list.add(2,new Integer(4));
		list.add(3,new Integer(3));
		list.add(4,new Integer(2));
		list.add(5,new Integer(5));
		list.add(6,new Integer(6));
		
		//step 3.2 - check low/high order
		System.out.println("Test w/ low>high");
		list.filter(new Integer(5),new Integer(3));
		System.out.println(list);
		
		System.out.println("Test w/ high>low");
		list.filter(new Integer(3),new Integer(5));
		System.out.println(list);
	}
	
}
------------------------------PRACTICE-------------------------
public class TestMyArray
{
	public static void main(String[] args)
	{
		MyArrayList<Integer> list = new MyArrayLIst<>();
		
		System.out.println("Test: "+list);
		list.filter(new Integer(3), new Integer(5));
		System.out.println;
		
		list.add(0,new Integer(6));
		list.add(1,new Integer(5));
		
		System.out.println("Test w/ low>high");
		list.filter(new Integer(5), new Integer(2));
		System.out.println(list);
		
		System.out.println("Test w/ high>low");
		list.filter(new Integer(3), new Integer(5));
		System.out.println(list);
	}
	
}

--------------------------------------------------------------

public class TestMyArrayList
{
	public static void main(String[] args)
	{
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		
		System.out.println("Filter empty list:");
		list.filter(new Integer(7), new Integer(11));
		System.out.println(list);
		
		list.add(0,new Integer(5));
		list.add(1,new Integer(4));
		list.add(2,new Integer(6));
		
		System.out.println("Test high low:");
		list.filter(new Integer(8),new Integer(4));
		System.out.println(list);
		
		System.out.println("Test filter correctly: ");
		list.filter(new Integer(3),new Integer(9));
		System.out.println(list);
		
		
	}
	
}









































