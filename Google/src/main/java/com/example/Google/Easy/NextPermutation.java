package com.example.Google.Easy;

public class NextPermutation {
    //rearranges numbers into lexicographically next greater permutation of numbers.
    //If not possible, rearrange it in ascending order.
    //Replacement must be in-place and use only constant extra memory.

    //1,2,3, -> 1,3,2
    //3,2,1 -> 1,2,3
    //1,1,5 -> 1,5,1


    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        int i = nums.length -2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }
        if( i >= 0) {
            int j = nums.length -1;
            while(nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public void reverse(int[] A, int i, int j) {
        while(i < j) {
            swap(A, i++, j--);
        }
    }
}
