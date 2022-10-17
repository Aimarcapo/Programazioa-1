package inputDecisionLoop;
import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] aargs) {

        //Aldagaiak definitu//
        double radius, diameter, area, circumference;

        //Aldagaiak eskatu//
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        in.close();

        //Ariketak egin//
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        //Erantzuna eman//
        System.out.printf("Diameter: %.2f%n", diameter);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("circumference: %.2f%n", circumference);
    }    
}
