package Main;

public class MaxSubarray {
	
    public int maxSubArray(int[] nums) {
    	if(nums==null) return 0;
    	int currSum = nums[0];
    	int maxSum = nums[0];
    	
    	for(int i = 1; i<nums.length;i++) {
    		currSum = Math.max(nums[i], currSum + nums[i]);
    		maxSum = Math.max(maxSum, currSum);
    	}
    	return maxSum;
    }
    
}
