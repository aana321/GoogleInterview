package org.example;

public class NextPermutationOfArray {

    public static void nextPermutation(int[] nums){

        int n = nums.length;
        int k = n - 2;

        //null checks
        if(nums.length == 0 || nums == null) return;

        //find k and reverse
        for(int i = n -1; i > 0; i--){
            if(nums[i] < nums[i - 1]) k--;
            else{
                break;
            }
        }

        //if k == -1 reverse
        if(k == -1){
            reverse(nums, 0, n-1);
            return;
        }

        //replace k with next greater element
        for(int i = n-1; i >0; i--){
            if(nums[i] >= nums[k]){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverse(nums, k+1, n -1);


    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println("The next permutation is ");
        for(int i = 0; i < nums.length; i++){

             System.out.print(" " + nums[i]);
        }

    }

}
