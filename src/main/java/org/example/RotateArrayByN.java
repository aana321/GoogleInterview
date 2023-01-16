package org.example;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayByN {

    public static void main(String[] args) {

        int Array[] = {1, 2, 3, 4, 5};
        int N = Array.length;

        int K = 2;
        rotateArray(Array, N, K);
    }

    public static void rotateArray(int[] nums, int n, int k){

        n = nums.length;
        //List<Integer> res = new ArrayList<>();
        k = k % n;

        for(int i = 0; i < n; i++){
            if(i < k){
                //Print right most kth elements
                System.out.print(nums[n + i - k] + " ");
            }else{
                //print array after k elements
                System.out.print(nums[i - k] + " ");
            }

        }

        System.out.println();
    }
}
