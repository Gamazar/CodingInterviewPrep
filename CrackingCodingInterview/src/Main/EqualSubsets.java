package Main;

public class EqualSubsets {
	public boolean canPartition(int[] nums) {
		
		if(nums.length == 0) return false;
		
		int total = 0;
		for(int num:nums) {
			total+=num;
		}
		
		
		return isEqual(nums,0,0,total);
	}
	
	private boolean isEqual(int[] nums, int index,int sum,int total) {
		if(index>=nums.length) return false;
		if(sum + nums[index] > total/2) {
			return isEqual(nums,index+1,sum,total);
		}
		if(sum + nums[index] == total/2) return true;		
		
		return isEqual(nums,index+1,sum+nums[index],total);
	}
}
