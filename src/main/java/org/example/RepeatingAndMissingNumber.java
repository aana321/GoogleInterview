package org.example;

public class RepeatingAndMissingNumber {
    public static void printMissingAndRepeating(int[] nums){
        int i;
        System.out.println("The repeating number is ");


        for( i = 0; i < nums.length; i++){
            int absolute_val = Math.abs(nums[i]);
            if(nums[absolute_val - 1] > 0){
               nums[absolute_val - 1] = - nums[absolute_val - 1];
            }else{
                System.out.println(absolute_val);
            }
        }

        System.out.println("The missing number is ");
        for( i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                System.out.println(i + 1);
            }
        }
    }

    public static void main(String[] args){
        int[] nums = {1,3,4,5,3};
        printMissingAndRepeating(nums);
    }
}
