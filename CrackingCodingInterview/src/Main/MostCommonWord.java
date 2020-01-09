package Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord {
	
	 public String mostCommonWord(String paragraph, String[] banned) {
	     
		 //Map<String,Integer> banContainer = new HashMap<>();
		
		 HashSet<String> bannedSet = new HashSet<>();
		         HashMap<String, Integer> wordsMap = new HashMap<>();
		          String mcw = "";
		          int mcwCount = -1;
		         
		         // filter spaces and punctuation
		         String[] wordsArr = paragraph.toLowerCase().split(" |!|\\?|'|,|;|\\."); 
		         
		         // put banned words into hash set
		         for(String s: banned)
		             bannedSet.add(s);
		     
		         // add and count non-banned words into wordsMap
		         for(String s: wordsArr)
		         {
		             if(!bannedSet.contains(s) && !s.equals(""))
		             {
		                 wordsMap.put(s, wordsMap.getOrDefault(s, 0) + 1);
		             
		                 int count = wordsMap.get(s);
		                 // keep tracking the most common word
		                 if(count > mcwCount)
		                 {
		                     mcw = s;
		                     mcwCount = count;
		                 }
		             }
		             
		         }
		                 
		         return mcw;
	 }
}
