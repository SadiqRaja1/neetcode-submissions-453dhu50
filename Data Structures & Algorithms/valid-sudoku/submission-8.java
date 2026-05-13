class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row < 9; row++){
            HashSet<Character> seen = new HashSet<>();
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }

        for(int col=0; col < 9; col++){
            HashSet<Character> seen = new HashSet<>();
            for(int row = 0; row < 9; row++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }
        
        for(int start = 0; start < 9; start++ ){
            HashSet<Character> seen = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    int row = (start / 3)*3 + i;
                    int col = (start % 3)*3 + j;
                    if(board[row][col] == '.') continue;
                    if(seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
