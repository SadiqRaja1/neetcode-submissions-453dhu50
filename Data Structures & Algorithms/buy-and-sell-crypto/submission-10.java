class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buying = prices[0];
        int max = 0;

        for (int r=1; r<n; r++) {
            if(prices[r] < buying){
                buying = prices[r];
            }
            max = Math.max(max, prices[r]-buying);
        }

        return max;
    }
}
