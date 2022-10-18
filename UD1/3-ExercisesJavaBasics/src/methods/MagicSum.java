package methods;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        
        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Sartu zenbaki positibo bat (edo -1 bukatzeko): ");
            
            number = in.nextInt();
            
            if (hasEight(number) == true){
                sum += number;
            }

        }while(!(number == -1));

        System.out.println("The magic sum is: " + sum);
        in.close();
    }

    public static boolean hasEight(int number){
        
        boolean hasEight = false;

        for(int digit = number % 10; number > 0; number = number / 10) {
            if(digit == 8){
                hasEight = true;
            }
            
            digit = number/10 % 10;
        }

        return hasEight;
    }
}
