package array;
import java.util.Scanner;

public class PrintArrayInStars{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        final int num_items;
        int[] items; 
        
        System.out.print("Sartu arrayaren tamaina: ");
        num_items = in.nextInt();

        items = new int[num_items];

        if(num_items > 0){
            System.out.print("Sartu arrayaren balioak tartean espazioa lagata: ");

            for(int i = 0; i < items.length; i++){
                items[i] = in.nextInt();
            }

        } else {
            System.out.println("Sartzen duzun tamaina positiboa izan behar da!");
        }

        for(int i = 0; i < items.length; i++){
          
            if(items[i] > 0){
               
                System.out.print(i + ": ");
               
                for(int cont = 0; cont < items[i]; cont++){
                    System.out.print("*");
                }
              
                System.out.print("(" + items[i] + ")");
                System.out.println("");

            } else {
               
                System.out.println("Sartutako balioak positiboak izan behar dira!");
            
            }
        }
        in.close();
    }
}