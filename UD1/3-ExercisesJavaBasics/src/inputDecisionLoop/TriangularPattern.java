package inputDecisionLoop;
import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        
        int zenb;

        Scanner in = new Scanner(System.in);
        System.out.print("Sartu nahi duzun zenbaki positiboa: ");
        zenb = in.nextInt();
        in.close();

        if(zenb >= 0){
            int  clon = zenb;

            System.out.println("B metodoa: ");
            System.out.println("");
            for(int y = 1; y <= zenb; y++){
                for(int x = 1; x <= clon; x++){
                    System.out.print("# ");
                }
                System.out.println("");
                clon--;
            }

            System.out.println("");
            clon = 1;

            System.out.println("A metodoa: ");
            System.out.println("");
            for(int y = 1; y <= zenb; y++){
                for(int x = 1; x <= clon; x++){
                    System.out.print("# ");
                }
                System.out.println("");
                clon++;
            }

            System.out.println("");
            clon = zenb;

            System.out.println("C metodoa: ");
            System.out.println("");
            for(int y = 1; y <= zenb; y++){
                for(int x = 1; x <= clon; x++){
                    System.out.print("# ");
                }
                System.out.println("");
                clon--;

                for(int repeat = 1; repeat <= (zenb - clon); repeat++){
                    System.out.print("  ");
                }
            }

            System.out.println("");
            clon = 0;

            System.out.println("D metodoa: ");
            System.out.println("");
            for(int y = 1; y <= zenb; y++){
                for(int x = 1; x <= clon; x++){
                    System.out.print("# ");
                }
                System.out.println("");
                clon++;

                for(int repeat = 1; repeat <= (zenb - clon); repeat++){
                    System.out.print("  ");
                }
            }
        } else {
            System.out.println("Sartutako zenbakia ez da positiboa.");
            System.out.println("Saiatu berriro...");
        }

    }
}
