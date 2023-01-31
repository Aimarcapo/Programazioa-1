package exekutagarriak;

import model.Selekzioa;

public class EuskalSelekzioa {
    public static void main(String[] args) {
        
        Selekzioa.futbolariBat();
        System.out.println("\n\n");
        Selekzioa.bestePartaideBatzukSortu();
        System.out.println("\n\n");
        Selekzioa.selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (Selekzioa.partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
}
