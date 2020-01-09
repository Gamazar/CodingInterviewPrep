package Main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import Main.MainSolution.TreeNode;

public class KthSmallestElement {
    
	public int kthSmallest(TreeNode root, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>( (x,y) -> y-x );
        
        Stack<TreeNode> storage = new Stack<>();
        
        storage.add(root);
        
        
        while(!storage.isEmpty()) {
        	TreeNode temp = storage.pop();
        	if(pq.size() < k) pq.add(temp.val);
        	else if(pq.size() == k && pq.peek() > temp.val) {
        		pq.poll();
        		pq.add(temp.val);
        	}
        	
        	if(temp.left != null) storage.add(temp.left);
        	if(temp.right != null) storage.add(temp.right);
        }
        
        return pq.peek();
        
    }
}
