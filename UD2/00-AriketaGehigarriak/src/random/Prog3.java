package random;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) throws InterruptedException {

        String erantzuna;
        boolean kanpoan = false;
        int kontua = 0;
        int[] aurrekoTiradak;
        int b = 0;

        aurrekoTiradak = new int[100];
        

        Scanner in = new Scanner(System.in);

        do{
            System.out.print("Dadoa bota nahi duzu (bai/ez)? ");
            erantzuna = in.next();
            System.out.println("");
            if(erantzuna.equals("ez")){
                break;
            }

            for(int i = 0; i < 5; i++){
                System.out.print(". ");
                Thread.sleep(500);
            }
            System.out.print("=> ");
            int dadoa = (int)(Math.random()*6 +1);
            System.out.print(dadoa + " =>");

            if(kanpoan == true){
                System.out.print(" " + dadoa + " kasilla aurreratu dituzu");
                kontua += dadoa;
                
                /*666 ateratzen bada etxera bidaltzeko */    
                /*            
                aurrekoTiradak[b]=dadoa;
                b++;
                if(b >= 3 && ((aurrekoTiradak[b-2] == 6) && (aurrekoTiradak[b-1] == 6) && (aurrekoTiradak[b] == 6))){
                    System.out.println("3 aldiz jarraian atera duzu 6, berez, etxera bueltatzen duzu.");
                    kontua = 0;
                    kanpoan = false;
                */
                }
            }else{
                if(dadoa == 5){
                    System.out.print(" Zorionak! fitxa bat atera duzu.");
                    kanpoan = true;
                } else{
                    System.out.print(" Txarto bez.");
                }
            }    
            System.out.println("");

        }while(erantzuna.equals("bai"));

        System.out.println(kontua + " kasilla aurreratu dituzu guztira.");

        in.close();
    }
}
