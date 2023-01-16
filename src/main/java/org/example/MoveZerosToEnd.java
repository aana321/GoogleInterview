package org.example;

public class MoveZerosToEnd {

    public static void moveZeros(int[] nums){
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }while(j < nums.length){
            nums[j++] = 0;
        }
    }

    public static void main(String[] args){
        int[] nums = {0,1,2,0,3,5};
        moveZeros(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print( nums[i]);
        }

    }
}
