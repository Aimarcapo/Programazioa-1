package inputDecisionLoop;
import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args){
        
        int zenb;
        int cont = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu taula egiteko nahi duzun zenbakia: ");
        zenb = in.nextInt();
        in.close();

        if(zenb >= 0){

            System.out.print("*| ");
            while(cont <= zenb){
                System.out.print(cont + " ");
                cont++;
            }

            System.out.println("");

            cont = 1;
            System.out.print("___");
            while(cont <= zenb) {
                System.out.print("__");
                cont++;
            }

            System.out.println("");

            cont = 1;

                for(int y = 1; y <= zenb; y++){
                    
                System.out.print(y + "|" + " ");

                    for(int x = 1; x <= zenb; x++){ 
                        System.out.print(y * x + " "); 
                    }
                System.out.println("");
                }

        } else {
            System.out.println("Sartutako zenbakia positiboa izan behar da.");
            System.out.println("Saiatu berriro...");
        }
    }    
}
