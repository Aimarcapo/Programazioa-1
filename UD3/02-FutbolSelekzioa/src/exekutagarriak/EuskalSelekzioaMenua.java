package exekutagarriak;

import java.util.Scanner;

public class EuskalSelekzioaMenua {
    public static void main(String[] args) {
        boolean egia = true;
        int aukera;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("MENUA\n-------------------------------");
            System.out.println("1. Partaideen datuak ikusi.");
            System.out.println("2. Partaideen datuak ikusi taldekatuta.");
            System.out.println("3. Partaideak alfabetikoki inprimatu.");
            System.out.println("4. Aldaketa.");
            System.out.println("5. Bilatu abizenetik.");
            System.out.println("6. Futbolariak alfabetikoki inprimatu.");
            System.out.println("\n20. Irten\n");

            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();

            switch(aukera){
                case 1:
                    System.out.println("");
                    datuakIkusi();
                    System.out.println("");

                case 2:
                    System.out.println("");
                    datuakTaldekaIkusi();
                    System.out.println("");

                case 3:


                case 4: 
                case 5:
                case 6:
                case 20:
                default:
            }

        } while(egia);
        
        in.close();
    }

    public static void datuakIkusi(){
        EuskalSelekzioa.selekzioOsoaSortu();
        for (int index = 0; index < EuskalSelekzioa.selekzioa.size(); index++) {
            System.out.println(EuskalSelekzioa.selekzioa.get(index));
        }
        //GUZTIRA KALKULATZEA FALTA DA.
    }

    public static void datuakTaldekaIkusi(){
        EuskalSelekzioa.selekzioOsoaSortu();
        for (int index = 0; index < EuskalSelekzioa.selekzioa.size(); index++) {
            if(index == 0){
                System.out.println("");
                System.out.println("FUTBOLARIAK\n==============");
            } else if(index == 17){
                System.out.println("");
                System.out.println("ENTRENATZAILEAK\n==============");
            }else if(index == 20){
                System.out.println("");
                System.out.println("MASAJISTAK\n==============");
            } else if(index == 21){
                System.out.println("");
                System.out.println("BESTELAKOAK\n==============");
            }
            System.out.println(EuskalSelekzioa.selekzioa.get(index));
        }
        //GUZTIRA KALKULATZEA FALTA DA.
    }
}
