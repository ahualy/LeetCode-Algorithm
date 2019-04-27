package ahualy;

public class SudokuSolver37 {

    public static void main(String[] args) {
        CharSatic c = new CharSatic();
        char[][] board = c.getBoard();
        solveSudoku(board);

    }

    private static void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        boolean res = solve(board);
        System.out.println("res "+res);
    }

    private static boolean solve(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {  // 这个格子是空的，说明要填数字
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {  // i j 的当前位置看能不能填c
                           board[i][j] = c;
                           if (solve(board))
                               return true;
                           else
                               board[i][j] = '.';//Otherwise go back
                        }

                    }
                    return false;
                }
            }

        }
        return true;
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {

        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c)
                return false; //check row
            if (board[row][i] != '.' && board[row][i] == c)
                return false; //check column
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
                 && board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
                return  false; // check 3 * 3 block
        }
        return true;

    }
}
