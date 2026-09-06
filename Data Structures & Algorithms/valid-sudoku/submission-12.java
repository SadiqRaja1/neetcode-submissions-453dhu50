class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
            HashSet<Character> check = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') continue;
                if(check.contains(board[i][j])){
                    System.out.println("here1");
                    return false;
                }
                check.add(board[i][j]);
            }
        }
        for(int i=0; i<9; i++){
            HashSet<Character> check = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i] == '.') continue;
                if(check.contains(board[j][i])){
                    System.out.println("here");
                    return false;
                }
                check.add(board[j][i]);
            }
        }
        for(int grid=0; grid<9; grid++){
            HashSet<Character> check = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    int row = (grid / 3)*3+i;
                    int col = (grid % 3)*3+j;
                    if(board[row][col] == '.') continue;
                    if(check.contains(board[row][col])){
                        System.out.println("here");
                        return false;
                    }
                        check.add(board[row][col]);
                    }
            }
        }
        return true;
    }
}
