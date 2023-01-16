import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    public static int[] twoNearestSum(int[] arrays, int target){

        int[] result = new int[2];


        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arrays.length; i++){

            if(map.containsKey(target - arrays[i])){

                result[1] = i;
                result[0] = map.get(target - arrays[i]);
            }

            map.put(arrays[i], i);

        }


        return result;
    }


    public static void main(String[] args){

        int[] array = {10, 22, 28, 29, 30, 40};
        int target = 54;

        //System.out.println("The nearest Sum to target is: "   + Arrays.toString(twoNearestSum(array, target)));

       int[] res = twoNearestSum(array, target);




    }
}
