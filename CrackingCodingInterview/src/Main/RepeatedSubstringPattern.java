package Main;

public class RepeatedSubstringPattern {

	
	public boolean repeatedSubstringPattern(String s) {
        if(s==null || s == "") return true;
		
        for(int i = 1; i<s.length();i++) {
        	
        	if(s.charAt(i) == s.charAt(0)) {
        		
        		if(repeatedSubstringPattern(s,i,s.substring(0,i))) return true;
        	}
        }
		
		return false;
    }
	
	
	private boolean repeatedSubstringPattern(String s, int pos, String sub) {
		
		
		if(s.length() % pos != 0) return false;
		
		for(int i = pos; i<=s.length()-pos;i+=pos) {
			if(!s.substring(i,pos+sub.length()).equals(sub)) return false;
		}
		
		return true;
	}
}
