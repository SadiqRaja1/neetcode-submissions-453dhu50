class Solution {
    public int trap(int[] height) {
        int lmax = 0;
        int rmax = 0;
        int l = 0;
        int r = height.length-1;
        int water = 0;
        while(l<r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            if(lmax < rmax){
                water+=lmax-height[l];
                l++;
            }else{
                water+=rmax-height[r];
                r--;
            }
        }
        return water;
    }
}
