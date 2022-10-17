package inputDecisionLoop;
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        
        //Aldagaiak definitu//
        int num;
        boolean isValid;

        isValid = false;

        //Baldintzatu//
        do{
            //Aldagaiak eskatu//
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a number betwen 0-10 or 90-100: ");
            num = in.nextInt();
            in.close();
            
            //Ariketa//
            if( (num >= 0 && num <= 10) || (num >= 90 && num <= 100) ){
                System.out.println("Your mark is: " + num );
                isValid = true;
            } else {
                System.out.println("Invalid input, try again...");
            }

        } while (!isValid);
    }
}
