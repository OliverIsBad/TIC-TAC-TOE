public class DrawElements {
    
    String[][] board = {
        {" ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " "},
        {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-"},
        {" ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " "},
        {"-", "-", "-", "+", "-", "-", "-", "+", "-", "-", "-"},
        {" ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " "}
    };

    public void drawCircle(){
        System.out.println("o");
    }
    public void drawX(){
        System.out.println("x");
    }

    public void drawBoard(){
        Board logic = Board.getInstance();
        int[][] board = logic.getBoard();
        for (int i = 0; i < logic.getBoardHeight(); i++) {
            for (int j = 0; j < logic.getBoardLength(); j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}