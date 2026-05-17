class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n-1;
        int maxLeft = 0;
        int maxRight  = 0;
        int storedWater = 0;

        while (start < end){
            maxLeft = Math.max(maxLeft, height[start]);
            maxRight = Math.max(maxRight, height[end]);

            if(maxLeft < maxRight){
                storedWater += (maxLeft - height[start]);
                start++;
            }else{
                storedWater += (maxRight - height[end]);
                end--;
            }
        }

        return storedWater;
    }
}
