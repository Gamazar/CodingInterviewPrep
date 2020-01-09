package Main;

public class GoatLatin {

	public String toGoatLatin(String S) {
		
		String[] words = S.split(" ");
		
		StringBuilder solution = new StringBuilder();
		
		int i = 1;
		
		for(String word : words) {
			StringBuilder temp = new StringBuilder(word);
			
			if(word.charAt(0)=='a' || word.charAt(0) == 'A' || word.charAt(0) == 'e' ||
					word.charAt(0) == 'E' || word.charAt(0) == 'i' || word.charAt(0) == 'I'
					|| word.charAt(0) == 'o' || word.charAt(0) == 'O' || word.charAt(0) == 'u'
					|| word.charAt(0) == 'U') {
				temp.append("ma");
			}
			else {
				char c = temp.charAt(0);
				temp.deleteCharAt(0);
				temp.append(c);
				temp.append("ma");
			}
			for(int a = 0;a<i;a++) {
				temp.append("a");
			}
			if(i!=words.length-1) {
				temp.append(" ");
			}

			//temp.append("a".repeat(i) + " ");
			solution.append(temp);
			i++;
		}
		
		return solution.toString();
    }
}
