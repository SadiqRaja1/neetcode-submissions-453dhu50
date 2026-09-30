class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int lMax = 0;
        int rMax = 0;
        int maxWater = 0;
        while (left < right) {
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax, height[right]);
            if(height[left] < height[right]) {
                maxWater += lMax - height[left];
                left++;
            }else {
                maxWater += rMax - height[right];
                right--;
            }
        }
        return maxWater;
    }
}
