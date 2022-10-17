package inputDecisionLoop;
import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {

        //Aldagaiak definitu//
        int number, digit;

        //Aldagaiak eskatu//
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: " );
        number = in.nextInt();
        in.close();

        //Ariketa egin//
        if(number < 0) {
            System.out.println("Sartutako zenbakia positiboa izan behar da.");
        } else {
            System.out.print("The reverse is: ");
            while(number>0) {
                digit = number % 10;
                System.out.print(digit);
                number /= 10;
            }
        }
        

    }    
}
