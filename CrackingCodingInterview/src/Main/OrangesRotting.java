package Main;

public class OrangesRotting {
	
	public int orangesRotting(int[][] grid) {
		
		if(grid == null) return 0;
		int count = 0;
		for(int i = 0;i<grid.length;i++) {
			for(int j = 0; j<grid[0].length;j++) {
				if(grid[i][j] == 2) {
				//	grid[i][j]=-1;
					count = rottingMinutes(grid,i,j+1,count);
				}
			}
		}
		return count;
    }
	
	private int rottingMinutes(int[][] grid, int row, int col,int count) {
		
		if(row>=grid.length || row<0 || col>=grid[0].length || col<0 ||grid[row][col]==0||grid[row][col]==2) return count;
		
		if(grid[row][col]==2) {
			if(row-1>=0 && grid[row-1][col]==1) {
				grid[row-1][col] = 2;
			}
			if(row+1<grid.length && grid[row+1][col]==1) {
				grid[row+1][col] = 2;
			}
			if(col+1 <grid[0].length && grid[row][col+1]==1) grid[row][col+1] = 2;
			if(col-1 >=0 && grid[row][col-1]==1)grid[row][col-1]=2;
		}
		
		
		if(grid[row][col]==1 || grid[row][col]==-1) {
			grid[row][col] = 2;
			
		}
		return count;
	}
}
