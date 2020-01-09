package Main;

import java.util.Random;

public class ShuffleArray {
		int[] original;
		int[] workingArr;
		
		Random rand = new Random();
		
	 	public ShuffleArray(int[] nums) {
	        original = nums;
	        workingArr = nums;
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	        workingArr = original;
	    	return original;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	        return null;
	    }
	    
	    private int randomSwap() {
	    	return 0;
	    }
	    
	    private void swap(int i , int j) {
	    	int temp = workingArr[i];
	    	workingArr[i] = workingArr[j];
	    	workingArr[j] = temp;
	    }
}
