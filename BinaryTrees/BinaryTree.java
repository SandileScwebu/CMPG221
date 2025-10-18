----THEORY----

"Binary tree is hierarchical structure either empty or contains element"

length
depth
level
sibling
leafs
height
outdegree
indegree
total degree


-----CODE-----

//method for a node 
public class TreeNode<E>
{
	//node value
	E element;
	
	TreeNode<E> left;
	TreeNode<E> right;
	
	//constructor
	public Treenode(E o)
	{	//node initial value
		element = o;
	}
}
	
	
----PRACTICE----

public class TreeNode<E>
{
	E element;
	TreeNode<E> left;
	TreeNode<E> right;
	
	public TreeNode(E o)
	{
		element = o;
	}
}















