class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int start = 0;
        int end = n-1;
        int max = 0;

        while(start < end){
            int minHeight = Math.min(heights[start], heights[end]);
            max = Math.max(max, (end - start)*minHeight);

            if(heights[start] > heights[end]){
                end--;
            }else {
                start++;
            }
        }
        
        return max;
    }
}
