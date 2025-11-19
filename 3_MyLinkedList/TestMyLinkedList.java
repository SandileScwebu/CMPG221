//5
//create linked list 
-------------------------THEORY(MEMORIZE)

-CREATE LIST
-ADD ELEMENTS
-DISPLAY

-------------------------CODE---------------------------
public class TestMyLinkedList
{
	public static void main(String[] args)
	{
		//create wrapper class object
		MyLinkedList<Integer> list = new MyLinkedLink<Integer>();
		
		//append
		list.append(new Integer(6));
		list.append(new Integer(5));
		list.append(new Integer(3));
		list.append(new Integer(2));
		list.append(new Integer(5));
		list.append(new Integer(1));
		
		//explicit toString
		System.out.println(list.toString())
	}
}

---------------------------PRACTICE-------------------------

public class TestMyLinkedList
{
	MyLinkedLink<Integer> list = new MyLinkedLink<Integer>();
	
	list.append(new Integer(6));
	list.append(new Integer(5));
	list.append(new Integer(4));
	list.append(new Integer(3));
	list.append(new Integer(5));
	list.append(new Integer(1));
	
	System.out.println(list);
	
}
