package Main;

public class TargetSum {
	
	public int findTargetSumWays(int[] nums, int S) {
		
		if(nums == null) return 0;
		
		return helperTarget(nums,S,0,0);
    }
	
	private int helperTarget(int[] nums,int S, int index, int sum) {
		
		if(index == nums.length && sum == S) return 1;
		else if(index == nums.length && sum!=S) return 0;
		
		return helperTarget(nums,S,index+1,sum+nums[index]) +
				helperTarget(nums,S,index+1,sum-nums[index]);
		
	}
}
