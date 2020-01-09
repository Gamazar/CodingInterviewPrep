package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
	
	
	/**
	 * THIS IS FOR PERMUTATIONS FOR STRINGS!
	 * @param s
	 * @return
	 */
	public List<String> permutationsString(String s){ // O(n^2)
		if(s == null) return null;
		List<String> solutions = new ArrayList<>();
		findPermutationsStrings("",s,solutions);
		return solutions;
	}
	
	private void findPermutationsStrings(String prefix, String suffix, List<String> solutions) {
		if(suffix.length() == 0) solutions.add(prefix);
		else {
			for(int i = 0; i<suffix.length();i++) {
				findPermutationsStrings(prefix + suffix.charAt(i), suffix.substring(0,i)
						+suffix.substring(i+1),solutions);
			}
		}
	}
	///////////////////////////////////////////////////
	
	public List<List<Integer>> permutationsInteger(int[] arr){
		
		if(arr == null) return null;
		
		List<List<Integer>> solution = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		for(int num : arr) {
			list.add(num);
		}
		findPermutationsInteger(0,list,solution);
		return solution;
	}
	
	private void findPermutationsInteger(int index, List<Integer> current,
			List<List<Integer>> solutions) {
		if(index>=current.size()) {
			solutions.add(new ArrayList<>(current));
		}
		else {
			for(int i = index ; i<current.size();i++) {
				Collections.swap(current,index,i);
				findPermutationsInteger(index+1,current,solutions);
				Collections.swap(current,index,i);
			}
		}
		
	}	
}
