import java.util.*;
 class SingleDigit
{
    //function to calculate the sum of digits
    static int digSum(int num)
    {
//variable to store sum of digits  
        int sum = 0;
//loop to do sum while sum is not less than or equal to 9  
        while (num > 0 || sum > 9)
        {
            if (num == 0)
            {
                num = sum;
                sum = 0;
            }
//determines the last digit of the number and add that digit to the sum variable   
            sum = sum + num % 10;
//remove the last digit of the number  
            num = num / 10;
        }
//returns the number   
        return sum;
    }
    //driver code
    public static void main(String args[])
    {
        int num = 1234;
        System.out.println("The sum of digits is: "+digSum(num));
    }
} 