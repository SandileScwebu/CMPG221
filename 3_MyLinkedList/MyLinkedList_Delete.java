//10
//delete from list using two pointers

---------------------------------CODE---------------------------------
public boolean delete(E item)
{
	//ptr starts at head
	Node<E> ptr = head;
	//only one element
	Node<E> prvPtr = null;
	
	//if 0 they are equal
	while(ptr!=null && ((Comparable)ptr.element).compareTo(item)!=0)
	{
		//"selects" head with prvPtr and head.next with ptr
		prvPtr=ptr;
		ptr=ptr.next;
	}
	
	//check item - null = cant delete
	if(ptr == null)
		return false;
		
	//check item first number
	if (ptr==head)
		head=head.next;
	else
		prvPtr.next=ptr.next;
		
	//check last element
	if(ptr==tail)
		tail=prvPtr;
	
	return true;
}
---------------------------------PRCATICE-----------------------------

public boolean delete(E e)
{
	Node<E> ptr1 = head;
	Node<E> ptr2 = null;
	
	//search
	while(ptr1!=null&&((Comparable)ptr.element)compareTo(e)!=0)
	{
		ptr2 = ptr1;
		ptr1 = ptr1.next;
	}
	
	if(ptr1==null)
		return false;
	
	//delete
	if(ptr1==head)
		head=head.next;
	else
		ptr2.next = ptr1.next;
	
	if(ptr1==tail)
		tail=ptr2;
	
	return true;
}