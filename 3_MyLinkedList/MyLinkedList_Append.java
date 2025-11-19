//3
//IN MyLinkedList
---------------------------THEORY()

-CREATE NODE
-IF H EMPTY
-SET T /T.N

-------------------------CODE---------------------------
//create appended method - using 3 steps add to end of list
public void append(E item)
{
	// step 2.3 - create node w/ address
	Node<E> newNode = new Node<E>(item);
	
	// step 3.1 - check empty list
	if(head == null)
	{
		head=tail=newNode;
	}
	else
	{
		tail.next = newNode;
		tail = newNode;
	}
}

-------------------------PRACTICE----------------------------

public void append(E item)
{
	Node<E> newNode = new Node<E>(item);
	
	if(head==null)
	{
		head = tail = newNode;
	}
	else
	{
		tail.next = newNode;
		tail = newNode;
	}
}