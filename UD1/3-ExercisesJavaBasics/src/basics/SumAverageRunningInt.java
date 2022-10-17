package basics;
public class SumAverageRunningInt {
    public static void main (String[] args) {
        
        //ALDAGAIAK DEFINITU
        int sum = 0;         
        double average;
        double contador = 0;       
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
  
        //BUKLEA NOIZARTE EGIN BEHAR DEN DEFINITU
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
          sum += number; 
          contador ++;    
        }

        //EMAITZA EMAN
        System.out.println("The sum of 1 to 100 is " + sum);
        
        //BATEZBESTEKOA KALKULATU
        average = sum/contador;
        
        //EMAITZA EMAN
        System.out.println("The average is " + average);     
     }
    
}
