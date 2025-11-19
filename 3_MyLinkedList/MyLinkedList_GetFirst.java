//6
//IN MyLinkedList
----------------------THEORY

-IF NULL
-RETURN ELEMENT


----------------------CODE-------------------------
//create get method for first element
public E getFirst()
{
	//check list empty
	if(head==null)
		return null;
	else 
		return head.element;
}

----------------------PRACTICE--------------------

public E getFirst()
{
	if(head==null)
	{
		return null;
	}
	else
	{
		return head.element;
	}
}