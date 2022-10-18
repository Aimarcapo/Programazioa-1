package inputDecisionLoop;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        
    final double TAX_RATE_ABOVE_20K = 0.1;
    final double TAX_RATE_ABOVE_40K = 0.2;
    final double TAX_RATE_ABOVE_60K = 0.3;

    int taxableIncome;
    double taxPayable;

    Scanner in = new Scanner(System.in);
    System.out.print("Sartu zenbakia, zerga kalkulatzeko: ");
    taxableIncome = in.nextInt();
    in.close();

    if (taxableIncome <= 20000) {         
        taxPayable = 0;
    } else if ((taxableIncome <= 40000) && (taxableIncome > 20000)) {  
        taxPayable = taxableIncome*TAX_RATE_ABOVE_20K;
    } else if ((taxableIncome <= 60000) && (taxableIncome > 40000)) { 
        taxPayable = taxableIncome*TAX_RATE_ABOVE_40K;
    } else {                         
        taxPayable = taxableIncome*TAX_RATE_ABOVE_60K;
    }

    System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
    }
}
