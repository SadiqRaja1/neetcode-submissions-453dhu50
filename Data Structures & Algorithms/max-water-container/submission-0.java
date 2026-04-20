class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length -1;

        int maxWater = 0;

        while(start < end){
            int min = Math.min(heights[start], heights[end]);

            maxWater = Math.max(maxWater, min * (Math.abs(end-start)));

            if(heights[start] > heights[end]){
                end--;
            }else{
                start++;
            }
        }

        return maxWater;
    }
}
