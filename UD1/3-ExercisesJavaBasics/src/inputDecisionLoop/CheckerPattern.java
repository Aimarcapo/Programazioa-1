package inputDecisionLoop;
import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {

        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan tamaina: ");
        size = in.nextInt();
        in.close();

        if(size >= 0){
            for(int x = 1; x <= size; x++) {
                for(int y = 1; y <= size; y++) {

                    System.out.print("# ");
                }
                
                System.out.println();

                if((x % 2) == 1){
                    System.out.print(" ");
                }
            }
        } else {
            System.out.println("Sartutako tamaina positiboa izan behar da.");
        }
    }    
}