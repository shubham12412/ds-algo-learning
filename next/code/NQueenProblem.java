//https://www.youtube.com/watch?v=jFwREev_yvU
public class NQueenProblem {

  public static void main(String[] args) {
    int n = 5;
    NQueenProblem nQueenProblem = new NQueenProblem();
    nQueenProblem.solveNQueenProblem(n);
  }

  public void solveNQueenProblem(int n) {
    int[][] board = new int[n][n];
    solveNQueenProblem(board, n, 0);
  }

  private boolean solveNQueenProblem(int[][] board, int n, int row) {

    // base case
    if (row == n) {
      //you have successfully placed queens in n rows (0...n-1)
      // print board
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (board[i][j] == 1) {
            System.out.print("Q ");
          } else {
            System.out.print("_ ");
          }
        }
        System.out.println();
      }
      // if we want to print all possible placement then we will return false from here
      return true;
    }

    // recursive case
    /* try to place the queen in the current row and call on the remaining part which will be 
    solved by recursion */
    for (int col = 0; col < n; col++) {
      /* can't place the queen blindly, we have to check whether it is safe to place the queen
       at (row,col) position */
      if (isSafe(board, n, row, col)) {
        board[row][col] = 1; // place queen here

        // place queen in remaining board recursively
        boolean isQueenPlacedInRemainingBoardSuccessfully = solveNQueenProblem(board, n, row + 1);
        if (isQueenPlacedInRemainingBoardSuccessfully) {
          return true;
        }
        
        /* we backtrack here because we are not able to place queen in remaining board successfully,
         so now we try in current row in next column */
        board[row][col] = 0; // we are removing the queen here

      }
    }
    
    // we have tried for all position in the current row, but couldn't place a queen
    return false;

  }

  private boolean isSafe(int[][] board, int n, int row, int col) {

    // check in current column
    for (int i = row; i >= 0; i--) {
      if (board[i][col] == 1) {
        return false;
      }
    }

    // check in left diagonal
    int x = row, y = col;
    while (x >= 0 && y >= 0) {
      if (board[x][y] == 1) {
        return false;
      }
      x--;
      y--;
    }

    // check in right diagonal
    x = row;
    y = col;
    while (x >= 0 && y < n) {
      if (board[x][y] == 1) {
        return false;
      }
      x--;
      y++;
    }

    return true;
  }
}
