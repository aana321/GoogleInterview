package org.example;

public class MaxSubArraySumKadens {

    public static int maxSum(int[] nums){
        int bestSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(currentSum, bestSum);
        }

        return bestSum;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The best sum of Sub Array is " + maxSum(nums));
    }
}
