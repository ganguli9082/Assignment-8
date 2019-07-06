
public class BinaryTree {
	
	Node root;
	
	public void add (String value)
	{
		Node nodeToAdd = new Node(value);
		if (root == null)
			root = nodeToAdd;
		
		
		traverseAndAddNode(root, nodeToAdd);
		//if (value < traversingNode.value)
		
	}
private void traverseAndAddNode (Node node, Node nodeToAdd )
{
	if(((Comparable<String>)nodeToAdd.value).compareTo(node.value)<0)
		{
		if (node.left ==null)
			{
			node.left = nodeToAdd;
			}
		
		else
			{
			traverseAndAddNode(node.left, nodeToAdd);
			}
		}
	else if (((Comparable<String>)nodeToAdd.value).compareTo(node.value)>0)
		{
		if (node.right == null)
			{
			node.right= nodeToAdd;
			}
		else
			{
			traverseAndAddNode(node.right, nodeToAdd);
			}
}
}

public void traverse()
{
	if (root != null)
	{
		Node nodeToTraverse = root;
		if (nodeToTraverse.left == null && nodeToTraverse.right == null)
			{
			System.out.println(nodeToTraverse.value);
			
			}
		else 
		{
			if(nodeToTraverse.left != null)
			{
			InOrderTraversal(nodeToTraverse.left);
			}
			if (nodeToTraverse.right != null)
			{
			InOrderTraversal(nodeToTraverse.right);
			}
		
		}
	}
}


public void InOrderTraversal(Node node)
	{
		if (node.left!=null)
			{
				InOrderTraversal(node.left);
			}
		
		System.out.println(node.value);
		
		if (node.right != null)
			{
			InOrderTraversal(node.right);
			}
	}
	
}


