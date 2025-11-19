//12

-----------------------------------THEORY(MEMORIZE)

-EMPTY LIST 1 OR 2
-MERGE LISTS
-REMAINING LIST

-----------------------------------CODE-----------------------------------------------

public MyLinkedList merge (MyLinkedList paramList)
{
	Node<E> ptr1, ptr2;
	ptr1 = head;
	ptr2 = paramList.head;
	MyLinkedList<> returnList = new MyLinkedList<>();
	//
	if(head==null)
	{
		while(ptr2 != null)
		{
			returnList.append(ptr2.element);
			ptr2 = ptr2.next;
		}
		return returnList;
	}
	
	if(paramList.head==null)
	{
		while(ptr1!=null)
		{
			returnList.append(ptr2.element);
			ptr1 = ptr1.next;
		}
		return returnList;
	}
	
	//
	while((ptr1!= null) && (ptr2!= null))
	{
		if((((Comparable)ptr1.element).compareTo(ptr2.element))<=0)
		{
			returnList.append(ptr1.element);
			ptr1 = ptr1.next;
		}
		else
		{
			returnList.append(ptr2.element);
			ptr2 = ptr2.next;
		}
		
	}
	//
	if(ptr1==null)
	{
		while(ptr2!=null)
		{
			returnList.append(ptr2.element);
			ptr2 = ptr2.next;
		}
	}
	
	if(ptr2==null)
	{
		while(ptr1!=null)
		{
			returnList.append(ptr1.element);
			ptr1 = ptr1.next;
		}
	}
	
	return returnList;
}

----------------------------------PRACTICE------------------------------

public MyLinkedList merge (MyLinkedList paramList)
{
	Node<E> ptr1, ptr2;
	ptr1 = head;
	ptr2 = paramList.head;
	MyLinkedList<> returnList = new MyLinkedList<>();
	
	if(head==null)
	{
		while(ptr2!=null)
		{
			returnList.append(ptr2.element);
			ptr2 = ptr2.next;
		}
		return returnList;
	}
	
	if(paramList.element!=null)
	{
		while(ptr2!=null)
		{
			returnList.append(ptr1.element);
			ptr1 = ptr1.next;
		}
		return returnList;
	}
	
	while((ptr1!=null)&&(ptr2!=null))
	{
		if((((Comparable)ptr1.element).compareTo(ptr2.element))<=0)
		{
			returnList.append(ptr1.element);
			ptr1 = ptr1.next;
		}
		else
		{
			returnList.append(ptr2.element);
			ptr2 = ptr2.next;
		}
	}
	
	if(ptr1==null)
	{
		while(ptr2!=null)
		{
			returnList.append(ptr2.element);
			ptr2 = ptr2.next;
		}
	}
	
	if(ptr2==null)
	{
		while(ptr1!=null)
		{
			returnList.append(ptr1.element);
			ptr1 = ptr1.next;
		}
	}
	
	return returnList;
}






















