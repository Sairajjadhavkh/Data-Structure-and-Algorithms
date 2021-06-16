

class BinaryTree{
	public static void main(String args[])
	{
		TreeEx obj=new TreeEx();
		obj.insert(3);
			obj.insert(2);
				obj.insert(6);
		obj.Inorder(obj.root);
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

class TreeEx{
	Node root;
	void insert(int data1)
	{
		Node n1=new Node(data1);
		Node temp=n1;
		if(root==null){
			root=n1;
		}
		while(temp!=null){
			if(data1<temp.data1){
				temp=temp.left;
			}
			else{
				temp=temp.right;
			}
		}
		
	}
	void Inorder(Node node)
	{
		if(node == null)
			return;
		Inorder(node.left);
		System.out.print(node.data+" ");
		Inorder(node.right);
	}
	
	
}


