package dsa.arrays;

/*
PROBLEM:
Max profit from buying and selling stock once.

APPROACH:
Track minimum price and max profit

TIME: O(n)
SPACE: O(1)
*/

public class StockBuySell {

    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Max Profit: " + maxProfit(prices));
    }
}
