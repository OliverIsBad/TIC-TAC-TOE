/**
 * Checks for win conditions
 * @author Oliver Mann
 */

public class CheckWinCondition {

    /**
     * Checks if the game is won
     * @param arr The array used to check if the game is won
     * @return True if the game is won
     */
    public boolean checkWinCondition(int[][] arr) {
        // Check horizontal wins
        for (int i = 0; i < 3; i++) {
            if (arr[i][0] != 0 && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                return true; // Horizontal win
            }
        }

        // Check vertical wins
        for (int j = 0; j < 3; j++) {
            if (arr[0][j] != 0 && arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j]) {
                return true; // Vertical win
            }
        }

        // Check diagonal wins
        if (arr[0][0] != 0 && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            return true; // Diagonal left
        }
        if (arr[0][2] != 0 && arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
            return true; // Diagonal right
        }

        return false; // No win condition 
    }

    /**
     * Checks if the game ended in a draw
     * @param board The array used to check if the game is a draw
     * @return Returns true if the game is a draw
     */
    public boolean checkForDraw(int[][] board) {
        // Check if any cell on the board is empty (contains 0)
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    return false; // There is an empty cell, game is not a draw
                }
            }
        }

        // All cells are filled and no win condition is met, game is a draw
        return true;
    }
}
