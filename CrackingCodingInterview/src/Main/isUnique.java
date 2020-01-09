package Main;

public class isUnique {
	
	public boolean isUnique(String s) {
		
		int[] bucket = new int[26];
		
		for(int i = 0;i<s.length();i++) {
			if(bucket[s.charAt(i)-'a'] != 0) return false;
			else bucket[s.charAt(i)-'a'] = 1;
		}
		
		return true;
	}

}
