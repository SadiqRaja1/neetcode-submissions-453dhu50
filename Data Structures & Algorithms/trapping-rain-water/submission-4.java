class Solution {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;

        int leftMax = 0;
        int rightMax = 0;

        int ans = 0;

        while (start < end){
            leftMax = Math.max(leftMax, height[start]);
            rightMax = Math.max(rightMax, height[end]);

            int minHeight = Math.min(leftMax, rightMax);

            if(leftMax < rightMax){
                ans += (minHeight - height[start]);
                start++;
            }else{
                ans += (minHeight - height[end]);
                end--;
            }
        }
        return ans;
    }
}
