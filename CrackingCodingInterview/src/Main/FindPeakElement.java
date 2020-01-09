package Main;

public class FindPeakElement {

	public int findPeakElement(int[] nums) {
		
		if(nums == null || nums.length == 1) return -1;
		
		int start = 0;
		int end = nums.length -1;
		
		int max = findHigher(nums,Integer.MIN_VALUE,0,nums.length-1);
		
		if(nums[0]!=max) return max;
		return 1;
        
    }
	
	private int findHigher(int[] nums, int max, int start, int end) {
		
		if(start>=end) return end;
		
		int mid = start + (end - start)/2;
		
		if(nums[mid] > max) {
			max = findHigher(nums,nums[mid],mid+1,end);
		}
		else {
			max = findHigher(nums,max,start,end-1);
		}
		
		return mid;
	}
}
