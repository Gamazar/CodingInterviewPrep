package Main;

public class PathSum3 {
	int count = 0;
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	  }
	  public int pathSum(TreeNode root, int sum) {
		  
		  if(root == null) return 0;
		  helperPathSum(root,sum,0);
		  return count;
	  }
	  
	  private void helperPathSum(TreeNode node, int sum, int total) {
		  if(node == null) return;
		  
		  if(total == sum) count++;
		  helperPathSum(node.left,sum,total + node.val);
		  helperPathSum(node.right,sum,total + node.val);
		  helperPathSum(node.left,sum,0);
		  helperPathSum(node.right,sum,0);
		  
	  }
}
