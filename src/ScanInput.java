import java.util.Scanner;

public class ScanInput {
    Scanner scanner = new Scanner(System.in);
    DrawElements draw = new DrawElements();
    public void logic(){
        
        System.out.println("Enter 1 for circle and 2 for x:");
        int num = scanner.nextInt();
        if(num == 1) draw.drawCircle();
        else if(num == 2) draw.drawX() ;
        else {
            System.out.println("Unknown input");
        }
        scanner.close();
    }
    
}
