package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainSolution {
	
	 public static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	  }
	 public static class ListNode{
		 int val;
		 ListNode(int v){val = v;}
		 ListNode next;
	 }
	 
	 public class Node {
		    public int val;
		    public Node left;
		    public Node right;

		    public Node() {}

		    public Node(int _val) {
		        val = _val;
		    }

		    public Node(int _val,Node _left,Node _right) {
		        val = _val;
		        left = _left;
		        right = _right;
		    }
		}
	 
//	 public static String mostCommonWord(String paragraph, String[] banned) {
//	     
//		 //Map<String,Integer> banContainer = new HashMap<>();
//		 Map<String,Integer> frequency = new HashMap<>();
//		 
//		 for(String ban : banned) {
//			 frequency.put(ban.toLowerCase(),-1);
//		 }
//		 
//		 String[] words = paragraph.split(" ");
//		 
//		 for(String word : words) {	 
//			 if(frequency.containsKey(word.toLowerCase()) && frequency.get(word.toLowerCase()) == -1);
//			 else frequency.merge(word.toLowerCase(), 1, Integer::sum);
//		 }
//		 
//		 int count = -1;
//		 String solution = "";
//		 
//		 for(Map.Entry<String, Integer> entry: frequency.entrySet()) {
//			 if(entry.getValue() > count) {
//				 count = entry.getValue();
//				 solution = entry.getKey();
//			 }
//		 }
//		 return solution;
//	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] banned = {"a"};
		
		CutOffAllTrees coat = new CutOffAllTrees();
		//[[54581641,64080174,24346381,69107959],
		//[86374198,61363882,68783324,79706116],
		//[668150,92178815,89819108,94701471],
		//[83920491,22724204,46281641,47531096],
		//[89078499,18904913,25462145,60813308]]
		List<List<Integer>> trees = new ArrayList<>();
		List<Integer> temp1 = new ArrayList<>();
		temp1.add(54581641);temp1.add(64080174);temp1.add(24346381);temp1.add(69107959);
		trees.add(temp1);
		
		List<Integer> temp2 = new ArrayList<>();
		temp2.add(86374198);temp2.add(61363882);temp2.add(68783324);temp2.add(79706116);
		trees.add(temp2);
		
		List<Integer> temp3 = new ArrayList<>();
		temp3.add(668150);temp3.add(92178815);temp3.add(89819108);temp3.add(94701471);
		trees.add(temp3);
		
		List<Integer> temp4 = new ArrayList<>();
		temp4.add(83920491);temp4.add(22724204);temp4.add(46281641);temp4.add(47531096);
		trees.add(temp4);
		
		List<Integer> temp5 = new ArrayList<>();
		temp5.add(89078499);temp5.add(18904913);temp5.add(25462145);temp5.add(60813308);
		trees.add(temp5);
		
		MostCommonWord mcw = new MostCommonWord();
		String s = "";
		String s1 = "a";
		
		RepeatedSubstringPattern rsp = new RepeatedSubstringPattern();
		System.out.println(rsp.repeatedSubstringPattern("abab"));
	}

}
