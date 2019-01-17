package com.algorithm.solutions;

public class BinaryTreeSearch {

	private static TreeNode root;

	static class TreeNode {
		int key;
		TreeNode right;
		TreeNode left;

		TreeNode(int value) {
			key = value;
			right = left = null;
		}

		

	}

	public  TreeNode searchBST(TreeNode node, int val) {
			
		TreeNode returnNode = node; 
		
		
		if (returnNode == null)
			return null;
		 
		else if (node.key == val) {
			return returnNode;
		}
		
			
			searchBST(node.right, val);
		
		
		return returnNode;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		root = new  TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		
		BinaryTreeSearch search = new BinaryTreeSearch();
		
		
		
		
		TreeNode node = search.searchBST(root, 2);
		System.out.println(node.key);
		System.out.println(node.left.key);

		
		
		
		

		

		// System.out.println(tree1.key);
		// System.out.println(tree1.left.key);
		// System.out.println(tree1.right.key);

	}

	public static TreeNode getRoot() {
		return root;
	}

	public static void setRoot(TreeNode root) {
		BinaryTreeSearch.root = root;
	}

}
