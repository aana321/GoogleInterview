package org.example;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        while(start< end){

            int mid = start + (end - start)/2;
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{

                return mid;
            }
        }

        return -1;
    }


    public static void main(String[] args){
        int[] nums = {-18,-12, 0, 1, 2,3,5,6,8, 9, 15, 33};
        int target = 55;
        System.out.println(binarySearch(nums, target));
    }
}
