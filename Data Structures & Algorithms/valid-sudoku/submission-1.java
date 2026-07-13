class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int rows = 0; rows<9; rows++){  //check for rows
            HashSet<Character> set = new HashSet<>();
            
            for(int column = 0; column<9; column++){
                char curr = board[rows][column];

                if(curr == '.'){
                    continue;
                }
                if(set.contains(curr)){
                    return false;
                }
                set.add(curr);
            }
        }

        for(int column = 0; column<9; column++){
            HashSet<Character> set  = new HashSet<>();
            for(int rows = 0; rows<9; rows++){
                char curr = board[rows][column];

                if(curr == '.'){
                    continue;
                }
                if(set.contains(curr)){
                    return false;
                }
                set.add(curr);
            }
        }

        for(int boxRow = 0; boxRow<9; boxRow+=3){
            for(int boxCol = 0; boxCol<9; boxCol+=3){
                HashSet<Character> set = new HashSet<>();
                for(int row = boxRow; row<boxRow + 3; row++){
                    for(int col = boxCol; col<boxCol + 3; col++){
                        char curr = board[row][col];

                        if(curr == '.'){
                            continue;
                        }
                        if(set.contains(curr)){
                            return false;
                        }
                        set.add(curr);
                        }
                    }
                }
            }
        return true;
    }
}
