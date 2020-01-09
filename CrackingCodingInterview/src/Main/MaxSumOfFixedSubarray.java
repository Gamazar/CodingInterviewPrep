package Main;


public class MaxSumOfFixedSubarray {
	
	public int maxSumOfKElements(int[] arr, int k) {
		if(arr == null) return -1;
		
		int max = 0;
		int size = 0;
		for(int i = 0; i<arr.length;i++) {
			if(size!=k) {
				max += arr[i];
				size++;
			}
			else {
				int temp = max - arr[i-k] + arr[i];
				max = Math.max(temp, max);
			}
		}
		return max;
	}

}
