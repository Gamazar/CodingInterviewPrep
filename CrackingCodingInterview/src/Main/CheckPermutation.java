package Main;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
	
	public boolean isPermutation(String s1, String s2) {
		if(s1 == "" || s2 == "") return true;
		if(s1.length() != s2.length()) return false;
		
		//Map<Integer,Integer> map = new HashMap<>();
		int total = 0;
		for(char c : s1.toCharArray())
			total += c;
		for(char c : s2.toCharArray()){
			total-=c;
		}
		
		if(total!= 0) return false;
		
		return true;
	}
}
