package Main;

import Main.MainSolution.TreeNode;

public class isSubTree {
	
	public boolean isSubtree(TreeNode s, TreeNode t) {
	    
		if(s==null && t!=null) return false;
		if(s==null && t == null) return true;
		if(s.val == t.val) return checkSubtree(s,t);
		
		return isSubtree(s.left,t)|| isSubtree(s.right,t);
	}
	
	private boolean checkSubtree(TreeNode node, TreeNode t) {
		
		if(node == null && t==null) return true;
		if(node ==null || t==null) return false;
		if(node.val != t.val) return false;
		
		return checkSubtree(node.left,t.left) && checkSubtree(node.right,t.right);
		
	}
}
