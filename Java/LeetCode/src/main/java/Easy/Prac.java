package Easy;

import java.util.HashMap;
import java.util.Map;

public class Prac {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mappings = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            mappings.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++) {
            int remainder = target - nums[j];
            if(mappings.containsKey(remainder) && mappings.get(remainder) != j) {
                return new int[] {j, mappings.get(remainder)};
            }
        }
        throw new IllegalArgumentException("Something");
    }
}
