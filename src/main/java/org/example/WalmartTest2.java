package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WalmartTest2 {

    //int[] a = {5,0,2,1,4,7,3,9};
    //target = 6;
    //[5,1]
    public static int[] targetSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();
        //int sum
        for(int i = 0; i < nums.length; i++){

            if(!map.containsKey(target - nums[i])){

                map.put(nums[i], i);

            }
            else{
                return new int[]{map.get(target - nums[i])};

            }
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] nums = {5,0,2,1,4,7,3,9};
        System.out.println(Arrays.toString(targetSum(nums, 6)));
    }
}
