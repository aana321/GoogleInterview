package org.example;

import java.util.Arrays;

public class TargetSums {

    public static void targetSumofArray(int[] array, int target){

        int sum = 0;
        //int[] res = new int[2];
        int n = 0;

        for(int i = 0; i < array.length; i++){
            n  = array[i];
            for(int j = i + 1; j < array.length; j++){
                sum = n + array[j];
                if(sum == target){
                    System.out.println("The elements of target sum are: " + array[i] + " " + array[j] );

                }
            }

        }



    }

    public static void main(String[] args){
        int nums[] = {5,0,2,1,4,7,3,9};

        targetSumofArray(nums, 6);
    }
}
