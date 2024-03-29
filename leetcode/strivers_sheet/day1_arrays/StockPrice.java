package leetcode.strivers_sheet.day1_arrays;

class StockPrice {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}