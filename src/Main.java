

public class Main {
    public static void main(String[] args) {
        Board logic = Board.getInstance();
        DrawElements draw = new DrawElements();
        ScanInput input = new ScanInput();
        int [] location = input.setLocation();
        logic.insert(1,location[0], location[1]);
        draw.drawBoard();
        System.out.println(" ");
        
       

        
    }
}
