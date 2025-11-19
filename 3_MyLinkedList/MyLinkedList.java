//1
//create outerclass - linked list
---------------------------THEORY(MEMORIZE)

-CREATE H/T ADDRESS
-SET H/T VALUE TO NULL

-------------------------CODE-------------------------
public class MyLinkedList<E>
{
	//initialize
	private Node<E> head, tail;
	
	//constructor
	public MyLinkedList()
	{
		head=null;
		tail=null;
	}
}

--------------------------PRACTICE---------------------

public MyLinkedList<E>
{
	private Node<E> head,tail;
	
	public MyLinkedList()
	{
		head = tail = null;
	}
	
}