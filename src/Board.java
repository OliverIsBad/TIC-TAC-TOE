public class Board {
    private static Board instance = null; // Static instance variable

    private int[][] board; // Board array

    // Private constructor to prevent external instantiation
    private Board() {
        // Initialize the board
        this.board = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
    }

    // Static method to get the singleton instance
    public static Board getInstance() {
        if (instance == null) {
            instance = new Board(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    // Insert method to update the board
    public void insert(int type, int x, int y) {
        board[x][y] = type;
    }

    // Getters for board dimensions
    public int getBoardLength() {
        return board[0].length;
    }

    public int getBoardHeight() {
        return board.length;
    }

    // Getter for the board
    public int[][] getBoard() {
        return board;
    }

    // Method to print the board
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
