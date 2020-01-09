package Main;

import java.util.List;

public class CutOffAllTrees {
	
	public int cutOffTree(List<List<Integer>> forest) {
        
		if(forest == null) return -1;
		
		int result = recCutTree(forest,0,0,0,0);
		
		for(int i = 0; i<forest.size();i++) {
			for(int j = 0; j<forest.get(0).size();j++) {
				if(forest.get(i).get(j) > (long)1) return -1;
			}
		}
		
		
		return result-1;
    }
	
	private int recCutTree(List<List<Integer>> forest, int row, int col,int count, long previous) {
		
		if(row<0 || row >=forest.size() || col<0 || col >=forest.get(0).size() || forest.get(row).get(col) == -1) return count;
		
		if(forest.get(row).get(col) == 0) return count;
		
		long temp = forest.get(row).get(col);
		forest.get(row).set(col, -1);
		int total;
		if(previous != 0) {
			total = Math.max(Math.max(recCutTree(forest,row+1,col,count+(int)(Math.abs(previous - temp)),temp),
					recCutTree(forest,row+1,col,count+(int)(Math.abs(previous - temp)),temp)),
					Math.max(recCutTree(forest,row,col+1,count+(int)(Math.abs(previous - temp)),temp),
							recCutTree(forest,row,col-1,count+(int)(Math.abs(previous - temp)),temp)));
		}
		else {
			total = Math.max(Math.max(recCutTree(forest,row+1,col,count,temp),
					recCutTree(forest,row+1,col,count,temp)),
					Math.max(recCutTree(forest,row,col+1,count,temp),
							recCutTree(forest,row,col-1,count,temp)));
		}
		
		return total;
		
	}
}
