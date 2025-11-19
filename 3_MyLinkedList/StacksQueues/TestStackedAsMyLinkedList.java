//2
//create test class

------------------------------CODE---------------------------------

public class TestStackAsMyLinkedList
{
	public static void main(String[] args)
	{
		Integer top = null;
		StackAsMyLinkedList<Integer> myStack = new StackAsMyLinkedList<Integer>();
		
		System.out.println("\n Initial stack: ");
		System.out.printn(myStack);
		
		System.out.println("Add one item: ");
		myStack.push(new Integer(5));
		System.out.println(myStack);
		
		System.out.println("Add a few more: ")
		myStack.push(new Integer(7));
		myStack.push(new Integer(8));
		myStack.push(new Integer(4));
		System.out.println(myStack);
		
		System.our.println("Pop one:")
		top = (Integer) myStack.pop();
		if(top!=null)
			System.out.println("Top is: " + top.intValue());
		else
			System.out.println("Empty Stack");
		System.out.println(myStack);
		
		System.out.println("Pop another one")
		top = (Integer) myStack.pop();
		if(top!=null)
			System.out.println("Top is: " + top.intValue());
		else
			System.otu.println("Empty Stack");
		System.out.println(myStack);
	}
}

------------------------------PRACTICE-----------------------------

public class TestStackMyLinkedList
{
	public static void main(String[] args)
	{
		Integer top=null;
		StackAsMyLinkedList<Integer> myStack = new StackAsMyLinkedList<Integer>();
		
		System.out.println("Test empty:" );
		System.out.println(myStack);
		
		System.out.println("Push one: ");
		myStack.prepend(new Integer(7));
		System.out.println(myStack);
		
		System.out.println("Pop one: ");
		top = (Integer) myStack.pop();
		if(top!=null)
			System.out.println("Top is: " + top.intValue());
		else
			System.out.println("Empty Stack");
		System.out.println(myStack);
		
	}
}