public class SumAverageRunningInt {
    public static void main (String[] args) {
        int sum = 0;         
        double average;
        double contador = 0;       
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
  
       
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
          sum += number; 
          contador ++;    
        }
        System.out.println("The sum of 1 to 100 is " + sum);
        average = sum/contador;
        System.out.println("The average is " + average);     
     }
    
}
