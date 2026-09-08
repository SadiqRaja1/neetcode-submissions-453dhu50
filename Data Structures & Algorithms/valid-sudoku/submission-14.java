class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0; row<9; row++){
            HashSet<Character> visited = new HashSet<>();
            for(int col=0; col<9; col++){
                char c = board[row][col];
                if(c == '.') continue;
                if(visited.contains(c)) return false;
                visited.add(c);
            }
        }
        for(int col=0; col<9; col++){
            HashSet<Character> visited = new HashSet<>();
            for(int row=0; row<9; row++){
                char c = board[row][col];
                if(c == '.') continue;
                if(visited.contains(c)) return false;
                visited.add(c);
            }
        }
        for(int grid=0; grid<9; grid++){
            HashSet<Character> visited = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    int row = (grid / 3)*3+i;
                    int col = (grid % 3)*3+j;
                    char c = board[row][col];
                    if(c == '.') continue;
                    if(visited.contains(c)) return false;
                    visited.add(c);
                }
            }
        }
        return true;
    }
}
