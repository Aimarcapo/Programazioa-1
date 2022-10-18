package inputDecisionLoop;
import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
    
        int salary, age;
        double employee, employer;
    
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.print("Enter the monthly salary (or enter -1 to end): ");
            salary = in.nextInt();
            System.out.print("Enter the age (or enter -1 to end): ");
            age = in.nextInt();

            if (age <= 55) {         
                employee = salary*0.2;
                employer = salary*0.17;
            } else if ((age <= 60) && (age > 55)) {  
                employee = salary*0.13;
                employer = salary*0.13;
            } else if ((age <= 65) && (age > 60)) { 
                employee = salary*0.075;
                employer = salary*0.09;
            } else {                         
                employee = salary*0.05;
                employer = salary*0.075;
            }
        
            System.out.printf("The employee's contribution is: $%.2f%n", employee);
            System.out.printf("The employer's contribution is: $%.2f%n", employer);
            System.out.printf("The total contribution is: $%.2f%n", (employee + employer));

        } while((age != -1) && (salary != -1));

        in.close();
    }
}
