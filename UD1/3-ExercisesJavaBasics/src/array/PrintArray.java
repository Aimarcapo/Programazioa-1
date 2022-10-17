package array;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int num_items;
        int[] items;
        
        System.out.print("Sartu arrayren tamaina: ");
        num_items = in.nextInt();

        items = new int[num_items];

        if(num_items > 0){

            System.out.print("Sartu arrayren balioak, espazioekin banatuta: ");

            for(int i = 0; i < items.length; i++){
                items[i] = in.nextInt();
            }

        } else {
            System.out.println("Ezin duzu sartu tamaina negatiboa!");
        }

        System.out.print("[");
        
        for(int i = 0; i < items.length; i++){
          
            if(i == 0){
                System.out.print(items[i]);
            } else {
                System.out.print(", " + items[i]);
            }

        }

        System.out.print("]");

        in.close();
        
    }
}