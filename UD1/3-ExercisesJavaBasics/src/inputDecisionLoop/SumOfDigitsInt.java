package inputDecisionLoop;
import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args) {

        //Aldagaiak definitu//
        int number, digit;
        int sum = 0;

        //Aldagaiak eskatu//
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer for sum their digits: " );
        number = in.nextInt();
        in.close();

        //Ariketa egin//
        if(number < 0) {
            System.out.println("Sartutako zenbakia positiboa izan behar da.");
        } else {
            while(number>0) {
                digit = number % 10;
                sum += digit;
                number /= 10;
            }
        }

        System.out.println("The total sum of all the digits is: " + sum);        

    }    
}
