package Main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySum {
	
	public int subarraySum(int[] nums, int k) {
		
		Map<Integer,Integer> storage = new HashMap<>();
		
		int total = 0;
		int count = 0;
		storage.put(0,1); 
		for(int i = 0; i<nums.length;i++) {
			total += nums[i];
			if(storage.containsKey(total-k)) {
				count+= storage.get(total-k);
			}
			storage.merge(total, 1, Integer::sum);
		}
		
		return count;
    }	
}
