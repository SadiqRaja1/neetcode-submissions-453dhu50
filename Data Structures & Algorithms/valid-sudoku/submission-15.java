class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0; row < 9; row++) {
            HashSet<Character> isPresent = new HashSet<>();
            for(int col=0; col < 9; col++) {
                char curr = board[row][col];
                if(curr == '.') continue;
                if(isPresent.contains(curr)) return false;
                isPresent.add(curr);
            }
        }
        for(int col = 0; col < 9; col++) {
            HashSet<Character> isPresent = new HashSet<>();
            for(int row=0; row < 9; row++) {
                char curr = board[row][col];
                if(curr == '.') continue;
                if(isPresent.contains(curr)) return false;
                isPresent.add(curr);
            }
        }

        for(int grid = 0; grid < 9; grid++) {
            HashSet<Character> isPresent = new HashSet<>();
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int row = (grid/3)*3+i;
                    int col = (grid%3)*3+j;
                    char curr = board[row][col];
                    if(curr == '.') continue;
                    if(isPresent.contains(curr)) return false;
                    isPresent.add(curr);
                }
            }
        }

        return true;
    }
}
