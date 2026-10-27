class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax = height[l];
        int rmax = height[r];
        int max = 0;
        while(l<r) {
            if(lmax < rmax) {
                max += lmax - height[l];
                l++;
                lmax = Math.max(lmax, height[l]);
            }else {
                max += rmax - height[r];
                r--;
                rmax = Math.max(rmax, height[r]);
            }
        }
        return max;
    }
}
