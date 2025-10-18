------THEORY------
	
	IF BINARY TREE EMPTY 
		CREATE ROOT NODE W/ ELEMENT
	ELSE
		LOCATE PARENT NODE OF ELEMENT TO BE INSERTED(NEW ELEMENT)
		IF NEW ELEMENT LESS THAN PARENT 
			NEW ELEMENT BECOMES PARENT LEFT CHILD
		ELSE IF NEW ELEMENT GREATER THAN PARENT 
			NEW ELEMENT BECOMES PARENT RIGHT CHILD

------CODE-----
//create node for insert element
public boolean insertElement(E element)
{
	
	if(root==null)//Special case 1
	{
		//create root node with new element
		root = new TreeNode(element);
	}
	else//Special case 2
	{
		//locate parent node
		current = root;
		while(current!=null)
		{
			if(element<current.element )
			{
				parent = current;
				current = current.left;
			}
			else if(element>current.element)
			{
				parent = current;
				current = current.right;
			}
			else
			{
				return false; //dont insert duplicate element / node 
			}
		}
		
		//give the new element a node under the correct side of the parent
		if(element<parent.element)
		{
			//create node with new element
			
			parent.left = new TreeNode(element);
		}
		else
		{
			//create node with new element
			parent.right = new TreeNode(element);
		}
		
		return true; //insert element
		
	}
}

------PRACTISE-----

public boolean insertElem(E element)
{
	if(root==null)
	{
		root = new TreeNode(element);
	}
	else
	{
		current=root;
		
		while(current!=null)
		{
			if(element<current.element)
			{
				parent=current;
				current = current.left;
			}
			else if(element>current.element)
			{
				parent=current;
				current = current.right;
			}
			else
			{
				return false;
			}
		}
		
			if(element<parent.element)
			{
				parent.left = new TreeNode(element);
			}
			else if(element> parent.element)
			{
				parent.right = new TreeNode(element);
			}
		return true;
	
	}
}











































