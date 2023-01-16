public class Solution2 {
    static void printMissingAndRepeatingNumbers(int[] nums){

        int i; //{1,1,3,4}
        System.out.println("The repeating elements is " );
        for(i = 0; i< nums.length; i++){
            int absolute_val = Math.abs(nums[i]);
            if(nums[absolute_val - 1] > 0){
                nums[absolute_val - 1] = -nums[absolute_val - 1];

            }else{

                System.out.println(absolute_val);
            }

        }

        System.out.println("Missing element in arrays are ");
        for( i = 0; i< nums.length; i++){
            if(nums[i] > 0){

                System.out.println(i + 1);
            }

        }



    }


    public static void main(String[] args){

        int[] nums = {4,3,6,2,1,1};
        printMissingAndRepeatingNumbers(nums);
    }

}
