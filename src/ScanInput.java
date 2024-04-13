import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Handles all the user input
 * @author Oliver Mann
  */
public class ScanInput {
    Scanner scanner = new Scanner(System.in);
    DrawElements draw = new DrawElements();
    boolean setLocationBool = false;

    /**
     * Is used to start the game
     * 
     * @return Returns true if the user input is 1 
     */
    public boolean startGame(){
        System.out.println("type 1 to start the game.");
        System.out.println("type 2 to end the game.");
        int num = 0;
        try{
            num = scanner.nextInt();
            System.out.println(num);
            scanner.nextLine(); // Consume newline character
        }catch(InputMismatchException e){
            scanner.nextLine();
        }
        if (num == 1){
            return true;
        } else return false;  
    }

    /**
     * Sets the desired location of a user input on the board
     */
    public void setLocation(){
        Board board = Board.getInstance();
        
        while(!setLocationBool){
            try{
                System.out.println("First num is the Y Location and the second is X: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int[] arr = new int[2];
                if(num1 <= 3 && num2 <= 3 && num1 >= 1 && num2 >= 1){
                    arr[0] = num1-1;
                    arr[1] = num2-1;
                    board.setLocation(arr);
                    setLocationBool = true;
                }
                else{
                    System.out.println("Value is not in the Grid");
                }
            }catch (InputMismatchException e) {
                System.out.println("Please enter valid integers.");
                scanner.nextLine(); // Consume the invalid input
            }
            
        }
        setLocationBool = false;
    }

    /**
     * Takes the input for the desired player names
     */
    public String[] getPlayerNames(){
        String[] players = new String[2];
        System.out.println("Player 1, choose a name:");
        String name1 = scanner.next();
        System.out.println("Player 2, choose a name:");
        String name2 = scanner.next();

        players[0] = name1;
        players[1] = name2;
        return players;
    }
    /**
     * Closes the scanner
     */
    public void closeScanner(){
        scanner.close();
    }


    
}
