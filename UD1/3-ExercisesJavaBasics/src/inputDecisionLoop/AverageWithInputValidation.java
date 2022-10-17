package inputDecisionLoop;
import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {

        //Aldagaiak sortu//
        int nota;
        double sum = 0;
        final int ikasleKop = 3;
        boolean isValid;
        double average;

        Scanner in = new Scanner(System.in);

        for(int cont = 1; cont <= ikasleKop; ++cont) {

            isValid = false;

            while(!isValid){
                
                System.out.print("Enter the mark (0-100) for student " + cont + ": ");
                nota = in.nextInt();
                

                if (nota <0 || nota >100){
                    System.out.println("Invalid input, try again...");
                }else{
                    isValid = true;
                    sum += nota;
                }
            }

        }
        in.close();

        average = sum / 3 ;

        System.out.printf("The average is: %.2f", average );

    }
}
