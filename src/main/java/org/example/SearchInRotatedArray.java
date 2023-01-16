package org.example;

public class SearchInRotatedArray {

    //https://leetcode.com/problems/search-in-rotated-sorted-array/
    /*There is an integer array nums sorted in ascending order (with distinct values).

    Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

    Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

    You must write an algorithm with O(log n) runtime complexity.
    Example 1:

    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4

     */

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            //4 cases we need to follow to find the pivot / peak of the array
            //case 1 when nums[mid] < nums[mid + 1]

            if(mid < end && nums[mid] > nums[mid + 1]){ //

                return  mid;
            }

            if(mid > start && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[mid] <= nums[start]){

                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }

            return  -1;

    }

    public static int rotatedSearch(int[] nums, int target){

        int pivot = findPivot(nums);
        if(pivot == -1){

            return normalBinarySearch(nums, target, 0, nums.length - 1);

        }

        if(target == pivot){
            return pivot;
        }else if(target >= nums[0]){

           return normalBinarySearch(nums, target, 0, pivot - 1 );
        }else{
            return normalBinarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }


    public static int normalBinarySearch(int[] nums, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){

                start = mid + 1;

            }else if(target < nums[mid]){
                end = mid - 1;
            }else{

                return mid;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(rotatedSearch(nums, 0));
    }


}
