class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0){
            return false;
        }
        
        int row = -1;
        for(int i=0; i<matrix.length; i++){
            //System.out.println(matrix[i][3]);
            if(matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target){
                row = i;
                break;
            }
        }
        System.out.println(row);

        if(row != -1){
            int start = 0;
            int end = matrix[row].length-1;

            while(start <= end){
                int m = start+(end-start)/2;

                if(matrix[row][m] == target){
                    return true;
                }else if(matrix[row][m] > target){
                    end = m-1;
                }else{
                    start = m+1;
                }
            }
        }


        return false;
    }
}
