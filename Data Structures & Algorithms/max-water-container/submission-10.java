class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int maxWater = 0;
        while(l<r){
            int currWater = 0;
            if(heights[l] > heights[r]){
                currWater = heights[r] * (r-l);
                r--;
            }else{
                currWater = heights[l] * (r-l);
                l++;
            }
            maxWater = Math.max(maxWater, currWater);
        }
        return maxWater;
    }
}
