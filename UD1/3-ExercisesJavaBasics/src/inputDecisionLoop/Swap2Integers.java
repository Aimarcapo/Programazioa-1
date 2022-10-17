package inputDecisionLoop;
import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {

        //Aldagaiak definitu//
        int number1, number2;

        //Aldagaiak eskatu//
        Scanner in = new Scanner(System.in);
        System.out.print("Say me the first number: ");
        number1 = in.nextInt();
        System.out.print("Say me the second number: ");
        number2 = in.nextInt();
        in.close();

        //Ariketa egin//
        int copy = number1;
        number1 = number2;
        number2 = copy;

        //Emaitza eman//
        System.out.println("After the swap, the first number is: " + number1 + " And the second number is: " + number2);
    }
}
