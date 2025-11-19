//2
//IN MyLinkedList

-------------------------THEORY(MEMORIZE)

-CREATE E/N
-SET E/N VALUE

-------------------------CODE------------------------
//create inner class - node
private static class Node<E>
{
	//initialize
	E element;
	Node<E> next;
	
	// create constructor
	public Node(E element)
	{
		this.element = element;
		next = null;
	}
}

--------------------------PRACTICE----------------------

public static class Node<E>
{
	E element;
	Node<E> next;
	
	public Node(E element)
	{
		this.element=element;
		next = null;
	}
}