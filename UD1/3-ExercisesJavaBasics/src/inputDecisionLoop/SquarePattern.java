package inputDecisionLoop;
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan karratuaren tamaina: ");
        size = in.nextInt();
        in.close();

        for(int x = 1; x <= size; x++) {
            for(int y = 1; y <= size; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }    
}
