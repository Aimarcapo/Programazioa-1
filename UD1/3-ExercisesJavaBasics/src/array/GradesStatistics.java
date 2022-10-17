package array;
import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        
        //ALDAGAIAK DEFINITU ETA ESKATZEKO
        Scanner in = new Scanner(System.in);

        final int num_students;
        int[] grades;

        System.out.print("Sartu ikasle kopurua: ");
        num_students = in.nextInt();
        grades = new int[num_students];

        System.out.println("");

        for(int i = 0; i < grades.length; i++){
            System.out.print( (i + 1) + ". ikaslearen nota: ");
            grades[i] = in.nextInt();
            
            if((grades[i] < 0) || (grades[i] > 100)){
                System.out.println("Nota 0 eta 100 artekoa izan behar da, saiatu berriro. ");
                System.out.print( (i + 1) + ". ikaslearen nota: ");
                grades[i] = in.nextInt();
            }
        }

        //AVERAGE KALKULATZEKO
        double average = 0;
        double final_average;

        for(int i = 0; i < grades.length; i++){
            average += grades[i];
        }

        final_average = average/num_students;

        System.out.printf("The average is: %.2f \n", final_average);

        //ZENBAKI HANDIENA ADIERAZTEKO
        int handiena = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > handiena){
                handiena = grades[i];
            }
        }
        
        System.out.println("The maximum is: " + handiena);

        in.close();        
    }    
}
