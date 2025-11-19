//13
//
-------------------------------THEORY(MEMORY)

-CREATE LISTS
-TEST BOTH EMPTY
-TEST ONE EMPTY AT A TIME

---------------------------CODE-----------------------

public class TestMyLinkedList
{
	public static void main(String[] args)
	{
		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
		MyLinkedList<Integer> list3 = new MyLinkedList<Integer>();
		
		System.out.println("Test: empty lists");
		list3=list1.merge(list1);
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		System.out.println("List 3: "+list3);
		
		System.out.println("Test: List 2 empty");
		list1.append(new Integer(6));
		list1.append(new Integer(7));
		list1.append(new Integer(8));
		list3=list1.merge(list2);
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		System.out.println("List 3: "+list3);
		
		System.out.println("Test: List 1 empty");
		list1.clear();
		list2.append(new Integer(3));
		list2.append(new Integer(4));
		list2.append(new Integer(5));
		list3=list1.merge(list2);
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		System.out.println("List 3: "+list3);
		
		
	}
}

---------------------------PRACTICE--------------------------