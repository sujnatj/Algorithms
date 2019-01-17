package com.algorithm.solutions;

public class MergeBinaryTrees {
	
	
	static class TreeNode
	{
		int val;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int val)
		{
			this.val = val;
			left = right = null;
			
		}
	}
	
	
	public static void main(String[] args)
	{
		TreeNode firstTreeNode = new TreeNode(1);
		firstTreeNode.left= new TreeNode(3);
		firstTreeNode.right= new TreeNode(2);
		firstTreeNode.left.left= new TreeNode(5);
		
		TreeNode secondTreeNode = new TreeNode(2);
		secondTreeNode.left= new TreeNode(1);
		secondTreeNode.right= new TreeNode(3);
		secondTreeNode.left.right= new TreeNode(4);
		secondTreeNode.right.right= new TreeNode(3);
		
		
		MergeBinaryTrees tree = new MergeBinaryTrees();
		
		tree.mergeTrees(firstTreeNode, secondTreeNode);
		
		
	}
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		
		if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
		
		
		
		
	
	
	

}
