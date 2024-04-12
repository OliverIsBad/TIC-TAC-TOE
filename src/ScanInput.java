import java.util.Scanner;

public class ScanInput {
    Scanner scanner = new Scanner(System.in);
    DrawElements draw = new DrawElements();
    boolean setLocationBool = false;
    public int[] setLocation(){
        int[] location = new int[2];
        while(!setLocationBool){
            System.out.println("First num is the Y Location and the second is X: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if(num1 < 3 || num2 < 3 && num1 > 1 || num2 > 1){
                location[0] = num1-1;
                location[1] = num2-1;
                setLocationBool = true;
            }
            else{
                System.out.println("Value is not in the Grid");
            }
        }
        
        scanner.close();
         
        return location;
    }
    
}
