package inputDecisionLoop;
import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
            
        int salary, age;
        double employee, employer;
    
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        salary = in.nextInt();
        System.out.print("Enter the age: ");
        age = in.nextInt();
        in.close();
    
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
        }
}
