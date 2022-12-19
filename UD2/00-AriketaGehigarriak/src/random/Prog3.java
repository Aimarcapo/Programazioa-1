package random;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) throws InterruptedException {
        int erantzuna = 0;
        int[] totala = {0, 0};
        char jarraitu;
        boolean[] kanpoan = {false, false};
        boolean[][] sorteTxarra;
        sorteTxarra = new boolean[2][100];
        int[] tirada = {0, 0};

        System.out.println("Jola honek, partxis moduko, 2 jokalarien arteko lehiaketa bat da. 35-era heltzen duen lehenengoa partida irabazten du. Kontuan izan, hiru aldiz segido 6 ateratzen baduzu, etxerantz bueltatuko zarela.");
        System.out.println("Aukeratu zein izango den lehenengo jokalaria eta zein bigarrena.");
        for(int X = 0; X < 6; X++){
            System.out.print(". ");
            Thread.sleep(1000);
        }
        System.out.println("");
        System.out.println("Jolastu nahi duzue (B/E)?");
        
        Scanner in = new Scanner(System.in);
        jarraitu = in.next().charAt(0);
        System.out.println("");

        /*JOLASA HASTEKO/JARRAITZEKO */
        while (jarraitu == 'B'){

            /*JOKALARI BAKOITZAREN TURNOARENTZAKO */
            for (int i = 1; i <= 2; i++) {
                System.out.println(i + ". jokalariaren turnoa, BOTA DADOA!");
                for(int X = 0; X < 3; X++){
                    System.out.print("clack ");
                    Thread.sleep(500);
                }

                erantzuna = (int)(Math.random()*6+1);
                System.out.print("=> " + erantzuna);

                if(kanpoan[i-1] == true){
                    totala[i-1] = totala[i-1] + erantzuna;
                    System.out.println("=> " + i + ". jokalariaren posizioa: " + totala[i-1]);
                    tirada[i-1]++;

                    /*FALTA: DEBUG EGIN ARAZOA IKUSTEKO */
                    /*666 ateratzerakoan etxera bueltatzeko*/
                    if(erantzuna == 6){
                        sorteTxarra[i-1][tirada[i-1]-1] = true;
                    } else {
                        sorteTxarra[i-1][tirada[i-1]-1] = false;
                    }
                    if(tirada[i-1] >= 3){
                        if((sorteTxarra[i-1][tirada[i-1]-3] == true) && (sorteTxarra[i-1][tirada[i-1]-2] == true) && (sorteTxarra[i-1][tirada[i-1]-1] == true)){
                            System.out.println("OOOOH...666 atera dituzu...");
                            totala[i-1]=0;
                            kanpoan[i-1] = false;
                        }
                    }
                }else{
                    if(erantzuna == 5){
                        System.out.println(" => Zorionak! fitxa atera duzu.");
                        kanpoan[i-1] = true;
                    } else{
                        System.out.println(" => Ez duzu fitxa atera");
                    }
                }
                if  (totala[i-1] >= 25){
                    System.out.println("ZOIONAK!!");
                    System.out.println(i + ". jokalariak irabazi du partida.");
                    break;
                }
            }
            if  (totala[0] >= 25 || totala[1] >= 25){
                break;
            }

            System.out.println("Berriz jolastu nahi duzue (B/E)?");
            jarraitu = in.next().charAt(0);
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Eskerrik asko jolasteagatik!!");
        in.close();
    }

}
