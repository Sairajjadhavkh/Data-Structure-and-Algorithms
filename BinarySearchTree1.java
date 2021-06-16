

class BinarySearchTree1{
	public static void main(String args[])
	{
		BSTEcample1 obj=new BSTEcample1();
		Node root=null;
		root=obj.insert(root,8);
		root=obj.insert(root,3);
		obj.inOrder(root);
	}
}

class Node{
	int data;
	Node left,right;
	Node(int data){
	this.data=data;
	left=right=null;
	}
}


class BSTEcample1{
	Node root;
	public Node insert(Node n,int val)
	{
		if(n==null){
			return new Node(val);
		}	
		if(val<n.data){
			n.left=insert(n.left,val);
		}
		else if(val>n.data){
			n.right=insert(n.right,val);
		}
		return n;
	}
	void inOrder(Node n){
		if(n==null){
			return;
		}
		inOrder(n.left);
		System.out.println(n.data);
		inOrder(n.right);
		
	}
	
}