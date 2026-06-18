class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int i=0, j=0;

        int prev = 0, curr = 0;

        for(int count = 0; count < (len1+len2)/2+1 ; count++){
            prev = curr;
            if(i<len1 && j<len2){
                if(nums1[i] > nums2[j]){
                    curr = nums2[j];
                    j++;
                }else {
                    curr = nums1[i];
                    i++;
                }
            }else if(i < len1){
                curr = nums1[i];
                i++;
            }else {
                curr = nums2[j];
                j++;
            }
        }

        if((len1+len2) % 2 != 0){
            return (double) curr;
        }else{
            return (double) (prev+curr)/2;
        }
    }
}
