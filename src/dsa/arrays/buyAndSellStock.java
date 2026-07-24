package dsa.arrays;

public class buyAndSellStock {
    static int buyAndSell(int[]prices){
        int min_price=prices[0];
        int max_profit=0;

        for(int price:prices){
            int profit=price-min_price;

            if(profit>max_profit){
                max_profit=profit;
            }
            if(price<min_price){
                min_price=price;
            }

        }
        return max_profit;
    }
    public static void main(String[] args) {
        int price[]={ 7, 1, 5, 3, 6, 4};
        System.out.println("Final maximum profit is: "+buyAndSell(price));
    }
}
