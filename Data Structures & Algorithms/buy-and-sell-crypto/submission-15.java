class Solution {
    public int maxProfit(int[] prices) {
        int purchase = prices[0];
        int maxSell = 0;
        for(int i=1; i<prices.length; i++){
            int currPrice = prices[i];
            if(currPrice < purchase){
                purchase = currPrice;
                continue;
            }
            maxSell = Math.max(maxSell, currPrice-purchase);
        }
        return maxSell;
    }
}
