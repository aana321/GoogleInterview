package org.example;

public class FindPeakInMountain {

    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static int findPeakElement(int[] nums){

        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){

                //If this condition is true means you are in desc order of array
                end = mid;

            }else{

                start = mid + 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = {0,10,5,2};
        System.out.println(findPeakElement(nums));
    }
}
