//9
//add to the front "head" of list
--------------------------THEORY(MEMORIZE)

-
-

----------------------------CODE------------------------
public void prepend(E e)
{
	Node<E> newNode = new Node<>(e);
	newNode.next = head;
	head = newNode;
	
	//means its the only node
	if(head.next == null)
	{
		tail = head;
	}
}

--------------------------PRACTICE----------------------

public void prepend(E e)
{
	Node<E> newNode = new Node<E>(e);
	
	newNode.next = head;
	head = newNode;
	
	if(head.next== null)
	{
		tail==head;
	}
}