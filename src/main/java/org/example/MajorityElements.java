package org.example;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static int findMajority(int[] nums){
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int num : nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int majority_element = -1;
        int maxCount = 0;

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            int count = entry.getValue();
            if(count > maxCount){
                maxCount = count;
                majority_element = entry.getKey();

            }
        }

        return majority_element;


    }

    public static void main(String[] args){
        int[] nums = {3,2,4,3};
        System.out.println(findMajority(nums));
    }
}
