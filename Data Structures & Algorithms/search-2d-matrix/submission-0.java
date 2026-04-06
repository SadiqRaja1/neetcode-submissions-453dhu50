class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while (row < matrix.length){
            if (matrix[row][col] >= target){
                return binarySearch(matrix, target, row, col);
            }else{
                row++;
            }
        }

        return false;
    }
    public boolean binarySearch (int matrix [][], int target, int row, int endCol) {
        int startCol = 0;

        while (startCol <= endCol) {
            int mid = startCol + (endCol - startCol)/2;

            if(matrix[row][mid] == target) {
                return true;
            }else if (matrix[row][mid] < target){
                startCol = mid + 1;
            }else {
                endCol = mid -1;
            }
        }
        return false;
    }
}
