package methods;
import java.util.Arrays;
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
        in.close();

        //BALIOAK ERAKUSTEKO
        System.out.println(Arrays.toString(grades));

        System.out.printf("The average is: %.2f \n", average(grades, num_students));        
        
        System.out.println("The maximum is: " + handiena(grades));

        System.out.println("The minimun is: " + txikiena(grades));

        System.out.println("The standard deviation is: " + stdDev(grades, num_students));
                        
    }    

    //AVERAGE KALKULATZEKO
    public static double average(int[] grades, int num_students){
        
        double average = 0;
        double final_average;

        for(int i = 0; i < grades.length; i++){
            average += grades[i];
        }

        final_average = average/num_students;

        return final_average;
        
    }

    //ZENBAKI HANDIENA ADIERAZTEKO
    public static int handiena(int[] grades){
        int handiena = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] > handiena){
                handiena = grades[i];
            }
        }

        return handiena;
    }

    //ZENBAKI TXIKIENA ADIERAZTEKO
    public static int txikiena(int[] grades){
        int txikiena = grades[0];
        for(int i = 0; i < grades.length; i++){
            if(grades[i] < txikiena){
                txikiena = grades[i];
            }
        }

        return txikiena;
    }

    //STANDARD DEVIATION-A KALKULATZEKO
    public static double stdDev(int[] grades, double average){

        double sumatoria = 0;        
        double stdDev = 0;

        for(int x  = 0; x < grades.length; x++){

            sumatoria += Math.pow(grades[x], 2);

        }

        sumatoria = sumatoria / grades.length;

        stdDev = Math.sqrt(sumatoria - Math.pow(average, 2));

        return stdDev;
    }
}
