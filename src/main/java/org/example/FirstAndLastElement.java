package org.example;

import java.util.Arrays;

/*
    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    Find First and Last Position of Element in Sorted Array
    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

    If target is not found in the array, return [-1, -1].

    You must write an algorithm with O(log n) runtime complexity.
        Example 1:

    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    Example 2:

    Input: nums = [5,7,7,8,8,10], target = 6
    Output: [-1,-1]
 */
public class FirstAndLastElement {
    public static int[] searchRange(int[] nums, int target){

        int[] ans = {-1,-1};
        int startRange = search(nums, target, true);
        int endRange = search(nums, target, false);
        ans[0] = startRange;
        ans[1] = endRange;
        return ans;
    }

    public static int search(int nums[], int target, boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){

                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{

                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums ={5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(nums, 8)));

    }
}
