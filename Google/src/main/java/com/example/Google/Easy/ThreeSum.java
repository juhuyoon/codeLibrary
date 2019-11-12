package com.example.Google.Easy;

import java.util.ArrayList;
import java.util.List;

//Time Complexity = O(n^3);

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> endSet = new ArrayList<>();
        for(int i = 0;i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = i + 2; k < nums.length; k++) {
                    if((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> sets = new ArrayList<>();
                        sets.add(nums[i]);
                        sets.add(nums[j]);
                        sets.add(nums[k]);
                        endSet.add(sets);
                    }
                }
            }
        }

        return endSet;
        //result: [ [-1, 0, 1, -1, 2, -1, -1, -1, 2, 0, 1, -1 ] ]
    }

//    public static List<List<Integer>> threeSum(int[] num) {
//        Arrays.sort(num);
//        List<List<Integer>> endSet = new LinkedList<>();
//        for(int i = 0; i < num.length -2; i++) {
//            if(i == 0 || (i > 0 && num[i] != num[i-1])) {
//                int lo = i+1;
//                int hi = num.length -1;
//                int sum = 0 - num[i];
//                while(lo < hi) {
//                    if(num[lo] + num[hi] == sum) {
//                        endSet.add(Arrays.asList(num[i], num[lo], num[hi]));
//                        while( lo < hi && num[lo] == num[lo+1])  {
//                            lo++;
//                        }
//                        while(lo < hi && num[hi] == num[hi-1]) {
//                            hi--;
//                        }
//                        lo++;
//                        hi--;
//                    } else if (num[lo] + num[hi] < sum) {
//                        lo++;
//                    } else {
//                        hi--;
//                    }
//                }
//            }
//        }
//        return endSet;
//    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));
    }
}
