package inputDecisionLoop;
import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {

        int num1, num2, num3;
        int sum, product, max, min;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();
        System.out.print("Enter the third number: ");
        num3 = in.nextInt();
        in.close();

        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;

        min = num1;
        if(num2 < min) {
            min = num2;
        } 

        if(num3 < min) {
            min = num3;
        }

        max = num1;
        if(num2 > max) {
            max = num2;
        }

        if(num3 > max) {
            max = num3;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
}
