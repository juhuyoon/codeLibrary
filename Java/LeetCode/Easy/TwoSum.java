import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {
  for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
          if (nums[j] == target - nums[i]) {
              return new int[] { i, j };
          }
      }
  }
  throw new IllegalArgumentException("No two sum solution");
}
}

//Using this with Hash Code with two passes.
class HashTable {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    //to put into the hashmap. 
    for(int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for(int i = 0; i < nums.length; i++) {
      int difference = target - nums[i];
      if(map.containsKey(difference) && map.get(difference) != i) {
        return new int[] { i, map.get(difference)};
      }
    }
  }
}

//Using Hash Table to do one pass:
public int[] twoSums(int[] nums, int target){
  Map<Integer, Integer> maps = new HashMap<>();
  for(int i = 0 ; i < nums.length; i++) {
    int difference = target - nums[i];
    if(maps.containsKey(difference)) {
      return new int[] { maps.get(difference ), i};
    }
    map.put(nums[i], i);
  }
}