public class Main {
    public static void main(String[] args) {
        boolean startGame = false;
        Board board = Board.getInstance();
        DrawElements draw = new DrawElements();
        ScanInput input = new ScanInput();
        String[] players = new String[2];

        CheckWinCondition winCondition = new CheckWinCondition();
        if(!startGame){
            startGame = input.startGame();
        }
        
        if(startGame){
            players = input.getPlayerNames();
        }
        
        while(startGame){
            input.setLocation();
            board.insert(draw.isType(), board.getLocation()[0], board.getLocation()[1]);
            draw.drawBoard();
            System.out.println(" ");
            if(!draw.isType()){
                draw.setType(true);
            } else {
                draw.setType(false);
            }

            if(winCondition.checkWinCondition(board.getBoard())){
                startGame = false;
            } else if (winCondition.checkForDraw(board.getBoard())) {
                System.out.println("It's a draw!");
                startGame = false; // End the game if it's a draw
            }
        }
        input.closeScanner();
        
        if(winCondition.checkWinCondition(board.getBoard())){
            if(!draw.isType()){
                System.out.println(players[1] + " won! Hurray!");       
            } else {
                System.out.println(players[0] + " won! Hurray!");
            }
        }
    }
}
