import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        char[][] board = {
                {'2','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        int n = board.length;
        // check columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(set.contains(board[j][i]) && board[j][i] != '.') return false;
                set.add(board[j][i]);
            }
            set.clear();
        }

        // check rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(set.contains(board[i][j])  && board[i][j] != '.') return false;
                set.add(board[i][j]);
            }
            set.clear();
        }

        //check 3x3 grids
        Set<Character> set2 = new HashSet<>();
        Set<Character> set3 = new HashSet<>();
        int i = 0, j;
        while (i < n) {
            if (i ==0 || i==3 || i == 6) {
                set.clear();
                set2.clear();
                set3.clear();
            }
            j = 0;
            while (j < n) {
                if(j>=0 && j <3) {
                    if(set.contains(board[i][j])  && board[i][j] != '.') return false;
                    if (board[i][j] != '.') set.add(board[i][j]);
                    j++;
                }
                else if(j>=3 && j <6) {
                    if(set2.contains(board[i][j]) && board[i][j] != '.') return false;
                    if (board[i][j] != '.') set2.add(board[i][j]);
                    j++;
                }
                else if(j>=6 && j <9) {
                    if(set3.contains(board[i][j]) && board[i][j] != '.') return false;
                    if (board[i][j] != '.') set3.add(board[i][j]);
                    j++;
                }
            }
            i++;
        }

        return true;
    }
}
