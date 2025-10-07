//Method
public boolean search(E element)
{
	
	TreeNode<E> current = root; //start from root node
	
	//left&right initially null 
	while(current != null)
	{
		//search left then right
		
		if(element < current.element) //left "smaller"
		{
			current = current.left; //Go Left
		}
		else if(element>current.element) //right 
		{
			current = current.right; //Go Right
		}
		else
			return true; //element found
		
	}
	
	return false; //not found
}