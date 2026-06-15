class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0;
        int end = m*n-1;

        System.out.println("m="+m+"n="+n);
        
        while(start <= end){
            int mid = start+(end-start)/2;

            int row = mid/n;
            int col = mid%n;

            int helper = matrix[row][col];

            System.out.print(helper+" ");

            if(helper == target){
                return true;
            }else if (helper > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return false;
    }
}
