import java.util.Scanner;

public class ScanInput {
    Scanner scanner = new Scanner(System.in);
    DrawElements draw = new DrawElements();
    boolean setLocationBool = false;

    public boolean startGame(boolean start){
        System.out.println("type 1 to start the game.");
        System.out.println("type 2 to end the game.");
    
        int num = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        if (num == 1){
            return true;
        } else return false;
    }
    public void setLocation(){
        scanner = new Scanner(System.in);
        Board board = Board.getInstance();
        while(!setLocationBool){
            System.out.println("First num is the Y Location and the second is X: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int[] arr = new int[2];
            if(num1 < 3 || num2 < 3 && num1 > 1 || num2 > 1){
                arr[0] = num1-1;
                arr[1] = num2-1;
                board.setLocation(arr);
                setLocationBool = true;
            }
            else{
                System.out.println("Value is not in the Grid");
            }
        }
         
    }

    public void closeScanner(){
        scanner.close();
    }


    
}
