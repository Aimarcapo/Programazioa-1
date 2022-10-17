package inputDecisionLoop;
import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args) {

        int num1, num2, sum;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        in.close();

        sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
}
