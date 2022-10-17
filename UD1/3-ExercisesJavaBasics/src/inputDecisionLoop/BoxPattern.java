package inputDecisionLoop;
import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        
        int size;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu formaren tamaina: ");
        size = in.nextInt();
        in.close();

        if(size >= 0){

            int cont = 1;

            System.out.println("A forma:");
            System.out.println("");
            
            for(int y = 0; y < size; y++){
                for(int x = 0; x <= size; x++){
                    System.out.print("* ");
                }
                cont++;
                System.out.println("");  
                
                if((cont != size) && (cont != 1)){
                    System.out.print("* ");
                    for(int repeat = 1; repeat <= (size - 2); repeat++){
                        System.out.print("  ");
                    }
                }
            }
        } else {
            System.out.println("Sartutako zenbakia ez da egokia. Zenbaki positiboa izan behar da.");
            System.out.println("Saiatu berriro");
        }
    }
}
