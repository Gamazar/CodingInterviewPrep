package Main;

import java.util.ArrayList;
import java.util.List;

public class PalindromaticSubstring {
	
    public int countSubstrings(String s) {
    	if(s == null) return 0;
    	
    	List<String> storage = new ArrayList<>();
    	
    	for(int i = 0; i<s.length();i++) {
    		for(int j = i;j<s.length();j++) {
    			if(s.charAt(j) == s.charAt(i)) {
    				storage.add(s.substring(i,j));
    			}
    		}
    	}
    	return storage.size();
    }
}
