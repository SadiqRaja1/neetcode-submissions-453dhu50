class Solution {
    public int maxProfit(int[] parameterPrices) {
        int buy = parameterPrices[0];
        int profit = 0;

        for(int i=1; i<parameterPrices.length; i++) {
            if(parameterPrices[i] > buy) {
                profit = Math.max(parameterPrices[i] - buy, profit);
            }else {
                buy = parameterPrices [i];
            }
        }
        return profit;
    }
}
