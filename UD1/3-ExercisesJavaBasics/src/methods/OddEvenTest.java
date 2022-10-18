package methods;
import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        int zenb;

        Scanner in = new Scanner(System.in);
        do{
            System.out.print("Sartu aztertzea nahi duzun zenbakia: ");
            zenb = in.nextInt();
            
            if(isOdd(zenb)){
                System.out.println(zenb + " is an odd number");
            } else {
                System.out.println(zenb + " is an even number");
            }
        } while(zenb >= 0);
        in.close();
    }

    public static boolean isOdd(int zenb){
       
        boolean isOdd;
       
        if((zenb % 2) == 0){
            isOdd = false;
        } else {
            isOdd = true;
        }

        return isOdd;
    }
}
