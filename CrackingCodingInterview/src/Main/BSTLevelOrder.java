package Main;

import java.util.ArrayList;
import java.util.List;

import Main.MainSolution.TreeNode;

public class BSTLevelOrder {
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    	List<List<Integer>> levels = new ArrayList<>();
    	helper(root,0,levels);
    	return levels;
    }
    
    private void helper(TreeNode node, int level,
    		List<List<Integer>> levels) {
    	if(node == null) return;
    	if(level == levels.size()) levels.add(new ArrayList<Integer>());
    	
    	levels.get(level).add(node.val);
    	helper(node.left,level+1,levels);
    	helper(node.right,level+1,levels);
    }
}
