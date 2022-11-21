package random;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {

        String erantzuna;
        boolean kanpoan = false;
        int kontua = 0;

        Scanner in = new Scanner(System.in);

        do{
            
            System.out.print("...");
            int dadoa = (int)(Math.random()*6 +1);
            System.out.print(dadoa + "=>");

            if(kanpoan == true){
                System.out.print(" " + dadoa + " kasilla aurreratu dituzu");
                kontua += dadoa;
            }else{
                if(dadoa == 5){
                    System.out.print(" Zorionak! fitxa bat atera duzu.");
                    kanpoan = true;
                } else{
                    System.out.print(" Txarto bez.");
                }
            }
            System.out.println("");

            System.out.print("Dadoa bota nahi duzu (bai/ez)? ");
            erantzuna = in.next();

        }while(erantzuna.equals("bai"));

        System.out.println(kontua + " kasilla aurreratu dituzu guztira.");

        in.close();
    }
}
