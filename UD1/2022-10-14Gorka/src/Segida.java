import java.util.Scanner;

public class Segida {
    public static void main(String[] args) {
        int zenb_kop, multzoa;
        int zenbakiak[];

        Scanner in = new Scanner(System.in);
        
        System.out.print("Zen da inprimatu nahi duzun azken zenbakia? ");
        zenb_kop = in.nextInt();
        zenbakiak = new int[zenb_kop];

        System.out.print("Zenbat zenbakiko multzoak nahi dituzu? ");
        multzoa = in.nextInt();

        in.close();

        int balorea = 1;
        
        for(int i = 0; i < zenbakiak.length; i++){

            zenbakiak[i] = balorea;
            System.out.println(balorea);

            if((balorea % multzoa) == 0){
                System.out.println("=====");
            }
            balorea++;
        }        
    }
}