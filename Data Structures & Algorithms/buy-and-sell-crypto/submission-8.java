class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buying = prices[0];

        for(int j=1; j<prices.length; j++) {
            if(buying > prices[j]) {
                buying = prices[j];
            }else {
                maxProfit = Math.max(maxProfit, prices[j] - buying);
            }
        }

        return maxProfit;
    }
}
