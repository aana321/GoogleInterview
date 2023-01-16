package org.example;

import java.sql.SQLOutput;

public class BestTimeToBuySellStocks {

    public static int maxProfit(int[] prices){
        int max_profit = 0;
        int min_val = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_val){
                min_val = prices[i];
            }else if(prices[i] - max_profit > min_val){
                max_profit = prices[i] - min_val;
            }
        }

        return max_profit;
    }

    public static void main(String[] args){
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
