class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buying = prices[0];
        int maxProfit = 0;

        for(int r=0; r<n; r++) {
            if(prices[r] < buying) {
                buying = prices[r];
                continue;
            }
            maxProfit = (maxProfit > prices[r] - buying)? maxProfit : prices[r] - buying;
        }
        return maxProfit;
    }
}
