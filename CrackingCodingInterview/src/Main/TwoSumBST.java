package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import Main.MainSolution.TreeNode;

public class TwoSumBST {

	
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        
    	Stack<TreeNode> collection = new Stack<>();

    	Map<Integer,Integer> storageRoot1 = new HashMap<>();    	
    	
    	int diff = 0;
    	collection.add(root1);
    	storageRoot1.put(root1.val,1);
    	
    	while(!collection.isEmpty()) {
    		TreeNode temp = collection.pop();
    		
    		if(temp.left !=null) {
    			collection.add(temp.left);
    			storageRoot1.put(temp.left.val, 1);
    		}
    		if(temp.right != null) {
    			collection.add(temp.right);
    			storageRoot1.put(temp.right.val,1);
    		}
    	}
    	collection.add(root2);
    	
    	while(!collection.isEmpty()) {
    		TreeNode temp = collection.pop();
    		diff = target - temp.val;
    		if(storageRoot1.containsKey(diff)) return true;
    		
    		if(temp.left !=null) {
    			collection.add(temp.left);
    		}
    		if(temp.right != null) {
    			collection.add(temp.right);
    		}
    	}
    	return false;
    }
}
