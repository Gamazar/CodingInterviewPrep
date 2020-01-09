package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Main.MainSolution.TreeNode;

public class RightSideView {
	
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> solution = new ArrayList<>();
		if(root == null) return solution;
		
		Stack<TreeNode> storage = new Stack<>();
		storage.add(root);
		
		while(!storage.isEmpty()) {
			TreeNode temp = storage.pop();
			solution.add(temp.val);
			if(temp.right != null) storage.add(temp.right);
		}
		
		return solution;
    }
}
