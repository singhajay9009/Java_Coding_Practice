package practice.leetcode.mySolution;

public class StockBuySell {

    public static void main(String[] args) {
        int [] prices =  {7,1,5,3,6,4};
        int profit = new StockBuySell().maxProfit(prices);
        System.out.println(profit);
    }
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxPrice = prices[0];


        for(int price: prices){
            minPrice = Math.min(minPrice, price);

            maxPrice = Math.max(price, minPrice);

        }

        return maxPrice - minPrice;
    }
}
