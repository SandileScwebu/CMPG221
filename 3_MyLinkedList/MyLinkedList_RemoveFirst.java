//8
//remove first value in linked list 
---------------------THEORY(MEMORIZE)

-IF H NULL
-REPLACE H W/ H.N
-RETURN TEMP	

-------------------CODE----------------------
public E remove()
{
	if(head==null)
		return null;
	
	//hold to return removed
	E temp = head.element;
	head = head.next;
	if(head==null)
		tail=null;
	return temp;
	
}

---------------------PRACTICE----------------------

public E remove()
{
	if(head==null)
		return null;
	
	E e = head.element;
	head=head.next;
	
	if(head==null)
		tail = null;
	
	return e;
}