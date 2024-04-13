/**
 * Works with the board array which holds all game data 
 * Implemented with Singleton Pattern (To only allow one instance of the class)
 * @author Oliver Mann
 */
public class Board {
    private static Board instance = null; // Static instance variable

    private int[][] board; // Board array
    private int[]   location;

    /**
     * Private constructor to prevent external instantiation
    */ 
    private Board() {
        // Initialize the board
        this.board = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        this.location = new int [2];
    }

    /**
    *Static method to get the singleton instance
    */ 
    public static Board getInstance() {
        if (instance == null) {
            instance = new Board(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    /**
     * Insert Method to update the board
     * @param type To check if its supposed to be "x" or "o"
     * @param x The x location of the board
     * @param y The y location of the board
     */
    public void insert(boolean type, int x, int y) {
        int num;
        if (type == false){
            num = 1;
        }else num = 2;
        board[x][y] = num;
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

    

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

}
