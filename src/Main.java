

public class Main {
    public static void main(String[] args) {
        boolean startGame = false;
        Board board = Board.getInstance();
        DrawElements draw = new DrawElements();
        ScanInput input = new ScanInput();
        startGame = input.startGame(startGame);
        
        
        while(startGame){
            //int [] location = input.setLocation();
            input.setLocation();
            board.insert(draw.isType(),board.getLocation()[0], board.getLocation()[1]);
            draw.drawBoard();
            System.out.println(" ");
            if(!draw.isType()){
                draw.setType(true);
            }else draw.setType(false);

        }
        input.closeScanner();

    }
}
