package com.sortingalgorithmns;

public class BinaryTree {

	private static Node root;

	// Constructors
	BinaryTree(int key) {
		
		this.root = new Node(key);
	}

	BinaryTree() {
		this.root = null;
	}
	
	public void preOrderTransversal(Node node)
	{
		if (node == null) 
            return; 
  
        /* first print data of node */
        System.out.print(node.key + " "); 
  
        /* then recur on left sutree */
        preOrderTransversal(node.left); 
  
        /* now recur on right subtree */
        preOrderTransversal(node.right); 
		
	}
	
	public void postOrderTransversal(Node node)
	{
		
		if (node == null) 
            return; 
  
       
  
        /* then recur on left sutree */
        preOrderTransversal(node.left); 
        
        /* first print data of node */
        System.out.print(node.key + " "); 
  
        /* now recur on right subtree */
        preOrderTransversal(node.right); 
		
	}
	
	
	public void inOrderTransversal(Node node)
	{
		
		if (node == null) 
            return; 
  
       
  
        /* then recur on left sutree */
        preOrderTransversal(node.left); 
        
       
  
        /* now recur on right subtree */
        preOrderTransversal(node.right); 
        
        /* first print data of node */
        System.out.print(node.key + " "); 
	}
	
	// Wrappers over above recursive functions 
    void inOrderTransversal()  
    {     
    	inOrderTransversal(getRoot());  
    	
    } 
    
   void postOrderTransversal()
    {
    	postOrderTransversal(getRoot());
	}

//	void printInorder()    {     printInorder(root);   } 
    void preOrderTransversal()   {     
     	preOrderTransversal(getRoot());  
    	
    } 

	public static void main(String[] Args) {
		BinaryTree tree = new BinaryTree();
		// creates a root
		tree.setRoot(new Node(1)); 
        tree.getRoot().left = new Node(2); 
        tree.getRoot().right = new Node(3); 
        tree.getRoot().left.left = new Node(4); 
        tree.getRoot().left.right = new Node(5); 
        System.out.println("Preorder traversal of binary tree is "); 
        tree.preOrderTransversal(getRoot());      
        System.out.println("Postorder traversal of binary tree is "); 
        tree.postOrderTransversal();       
        System.out.println("Inorder traversal of binary tree is "); 
        tree.inOrderTransversal(); 
	}

	public static Node getRoot() {
		return root;
	}

	public static void setRoot(Node root) {
		BinaryTree.root = root;
	}
}

class Node {
	int key;
	Node left;
	Node right;

	Node(int value) {
		this.key = value;
		left = right = null;
	}
}