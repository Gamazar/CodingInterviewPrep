package Main;

import java.util.Stack;

public class MinRemoveToMakeValid {
	
	class Pair {
		int index;
		char key;
		
		Pair(int index, char key) {
			this.index = index;
			this.key = key;
		}
	}
	
	public String minRemoveToMakeValid(String s) {
		
		Stack<Integer> open = new Stack<>();
		Stack<Integer> closed = new Stack<>();
		
		StringBuilder solution = new StringBuilder(s);
		for(int i = 0; i<solution.length(); i++) {
			if(solution.charAt(i) == '(') open.add(i);
			else if(solution.charAt(i) == ')' && !open.isEmpty()) open.pop();
			else if(solution.charAt(i)==')' && open.isEmpty()) closed.add(i);
		}
		
		while(!open.isEmpty() || !closed.isEmpty()) {
			if(!open.isEmpty()) {
				solution.setCharAt(open.pop(), ' ');
				//solution.deleteCharAt(open.pop());
			}
			if(!closed.isEmpty()) {
				solution.setCharAt(closed.pop(), ' ');
				//solution.deleteCharAt(closed.pop());
			}
		}
		return solution.toString().replaceAll("\\s","");
    }
}
