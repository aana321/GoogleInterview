package org.example;

public class InfiniteArraySearch {


    public static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;

        //Double the size of window if target is not found
        while(target > end){

            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;

        }

        return binarySearch(nums, target, start, end);
    }


    public static int binarySearch(int[] nums, int target, int start, int end){


        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{

                return mid;
            }

        }

        return -1;



    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10,11,12,13,15,19,34,55,555};
        System.out.println(ans(nums, 8));
    }
}
