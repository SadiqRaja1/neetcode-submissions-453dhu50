class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  m = nums1.length;
        int  n = nums2.length;
        int mergedArray [] = new int[m+n];

        int ind = 0;
        for(int i=0; i<m; i++){
            mergedArray[ind] = nums1[i];
            ind++;
        }

        for(int i=0; i<n; i++){
            mergedArray[ind] = nums2[i];
            ind++;
        }

        Arrays.sort(mergedArray);

        int a = mergedArray.length;

        if(a%2 != 0){
            return (double) mergedArray[a/2];
        }else {
            int x = mergedArray[a/2];
            int y = mergedArray[a/2-1];

            return (double) (x+y)/2;
        }

    }
}
