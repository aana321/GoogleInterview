package org.example;

import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums){
        int left = 0; int right = nums.length -1;
        while(left<= right){
            if(nums[left] == 0){
                left++;
            } else if (nums[left] == 2) {
                right--;
            } else if (nums[left] == 1 && nums[right] == 0) {
                swap(nums, left, right);
                left++;
                right--;
            } else if (nums[left] == 2 && nums[right] == 1) {
                swap(nums, left, right);
                left++;
                right--;
            } else {
                left++;
                right--;
            }
        }


    }

    private static void swap(int[] nums, int low, int high){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,2,1,2};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}
