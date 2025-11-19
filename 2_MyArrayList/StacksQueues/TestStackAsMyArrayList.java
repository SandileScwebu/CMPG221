//7

-----------------------------------CODE--------------------------------------

public class TestStackMyArrayList
{
	public static void main(String[] args)
	{
		Integer top = null;
		StackMyArrayList<Integer> myStack = new StackMyArrayList<Integer>();
		
		System.out.println("Intial list: ");
		System.out.println(myStack);
		
		System.out.println("Push one: ");
		myStack.push(new Integer(8));
		System.out.println(myStack);
		
		System.out.println("Pop one: ");
		top = (Integer) myStack.pop();
		if(top!-null)
			System.out.println("Top is: "+top.intValue());
		else
			System.out.prinltn("Empty Stack");
		System.out.println(myStack);
		
	}
}

-----------------------------------PRACTICE--------------------------------------

public class TestStackMyArrayList
{
	public static void main(String[] args)
	{
		Integer top=null;
		StackMyArrayList<Integer> myStack = new StackMyArrayList<Integer>();
		
		System.out.prinltn("INitial list: ");
		System.out.prinltn(myStack);
		
		System.out.prinltn("Add one");
		myStack.push(new Integer(8));
		System.out.prinltn(myStack);
		
		System.out.prinltn("Remove one");
		top = (Integer) myStack.pop();
		if(top!=null)
			System.out.prinltn("Last element: "+ top.intValue());
		else
			System.out.prinltn("Empty list");
		System.out.println(myStack);
	}
}