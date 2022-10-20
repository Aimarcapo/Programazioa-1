package methods;
import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        
        //ALDAGAIAK DEFINITU
        int exp, base;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan zein den exp: ");
        exp = in.nextInt();
        System.out.print("Esan zein den base: ");
        base = in.nextInt();
        in.close();

        System.out.println("Sartutako zenbakien berreketa " + expon(base, exp) + " da.");
    }
    
    public static int expon (int base, int exp) {
        
        int product = 1;

        for (int x = 1; x <= exp; x++) {
           product *= base;
        }
  
        return product;
     }
}
