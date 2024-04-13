/**
 * Is used to draw the board on the screen
 * @author Oliver Mann
 */
public class DrawElements {
    
    boolean type; // false = circle, true = x
    DrawElements(){
        this.type = false;
    }
    /** 
     * Prints the int array:
     * 0 is interpreted as " "
     * 1 is interpreted as "o"
     * 2 is interpreted as "x"
     */
    public void drawBoard(){
        Board logic = Board.getInstance();
        int[][] board = logic.getBoard();

        // Print top frame
        System.out.println("+---+---+---+");

        for (int i = 0; i < logic.getBoardHeight(); i++) {
            System.out.print("| "); // Start of row

            for (int j = 0; j < logic.getBoardHeight(); j++) {
                if (board[i][j] == 0) {
                 System.out.print("  "); // Print two spaces for 0
                } 
                else if (board[i][j] == 1) {
                    System.out.print("o "); // Print "o" for 1
                } 
                else if (board[i][j] == 2) {
                    System.out.print("x "); // Print "x" for 2
                }
            System.out.print("| "); // End of cell with separator
        }

    System.out.println(); // End of row
    System.out.println("+---+---+---+"); // Frame after each row
}
    }
    /**
     * Returns the type
     * @return True or False
     */
    public boolean isType() {
        return type;
    }
    /**
     * Sets the type
     * @param type The boolean type
     */
    public void setType(boolean type) {
        this.type = type;
    }
    
}