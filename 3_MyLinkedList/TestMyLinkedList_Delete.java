//11
//TEST DELETE
------------------------------THEORY(MEMORIZE)


------------------------------CODE----------------------------------

public class TestMyLinkedList
{
	public static void main(String[] args)
	{
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		System.out.println("Remove from empty list");
		System.out.println(list);
		System.out.println(list.delete(new Integer(2));
		System.out.println(list);
		
		list.append(new Integer(8));
		list.append(new Integer(7));
		list.append(new Integer(6));
		list.append(new Integer(5));
		list.append(new Integer(4));
		list.append(new Integer(3));
		list.append(new Integer(2));
		
		System.out.println("Remove first element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(8)));
		System.out.println(list);
		
		System.out.println("Remove last element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(2)));
		System.out.println(list);
		
		System.out.println("Remove middle element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(5)));
		System.out.println(list);
		
		System.out.println("Remove invalid element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(10)));
		System.out.println(list);
	}
	
}

------------------------PRACTICE--------------------------

public class TestMyLinkedList
{
	public static void main(String[] args)
	{
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		
		System.out.println("Remove empty list");
		System.out.println(list);
		System.out.println(list.delete(new Integer(8)));
		System.out.println(list);
		
		list.append(new Integer(9));
		list.append(new Integer(8));
		list.append(new Integer(7));
		list.append(new Integer(6));
		list.append(new Integer(5));
		list.append(new Integer(4));
		list.append(new Integer(3));
		
		System.out.println("Remove first element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(9)));
		System.out.println(list);
		
		System.out.println("Remove last element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(3)));
		System.out.println(list);
		
		System.out.println("Remove middle element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(5)));
		System.out.println(list);
		
		System.out.println("Remove invalid element");
		System.out.println(list);
		System.out.println(list.delete(new Integer(1)));
		System.out.println(list);
		
		
	}
}