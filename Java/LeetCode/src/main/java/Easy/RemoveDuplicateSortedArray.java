package Easy;

public class RemoveDuplicateSortedArray {
        public int removeDuplicates(int[] nums) {
            if(nums.length == 0) {
                return 0;
            }
            int prev = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[prev] != nums[i]) {
                    prev++;
                    nums[prev] = nums[i];
                }
            }
            return prev + 1;
        }
}
