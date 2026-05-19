class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int maxProfit = 0;

        for(int right = 0; right<n; right++ ){
            if(prices[right] < prices[left]) {
                left = right;
                continue;
            }

            maxProfit = Math.max(maxProfit, prices[right]- prices[left]);
        }

        return maxProfit;
    }
}
