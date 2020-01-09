package Main;

import java.util.ArrayList;
import java.util.List;

public class UniqueSubstrings {
	
	public List<String> countUniqueSubstrings(String s){
		
		List<String> solution = new ArrayList<>();
		
		for(int i = 0;i<s.length();i++) {
			for(int j = i+1;j<=s.length();j++) {
				solution.add(s.substring(i,j));
			}
		}
		return solution;
	}

}
