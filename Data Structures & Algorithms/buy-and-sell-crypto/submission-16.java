class Solution {
    public int maxProfit(int[] prices) {
        int purchase = prices[0];
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            int currPrice = prices[i];
            if(purchase > currPrice){
                purchase = currPrice;
                continue;
            }
            maxProfit = Math.max(maxProfit, currPrice - purchase); 
        }
        return maxProfit;
    }
}
