class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int max = 0;
        int end = heights.length-1;
        while(start < end){
            int curr = 0;
            if(heights[start] < heights[end]){
                curr = heights[start]*(end-start);
                start++;
            }else {
                curr = heights[end]*(end-start);
                end--;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
