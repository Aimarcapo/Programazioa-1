package methods;
import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        int zenb;

        do{
            Scanner in = new Scanner(System.in);
            System.out.print("Sartu aztertzea nahi duzun zenbakia: ");
            zenb = in.nextInt();
            in.close();

            if(isOdd(zenb)){
                System.out.println(zenb + " is an odd number");
            } else {
                System.out.println(zenb + " is an even number");
            }
        }while(zenb >= 0);
    }

    public static boolean isOdd(int zenb){
       
        boolean isOdd;
       
        if((zenb % 2) == 0){
            isOdd = false;
            return isOdd;
        } else {
            isOdd = true;
            return isOdd;
        }
    }
}
