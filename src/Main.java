

public class Main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        DrawElements draw = new DrawElements();
        ScanInput input = new ScanInput();
        input.logic();
        logic.insert(2, 1, 0);
        draw.drawBoard();
       

        
    }
}
