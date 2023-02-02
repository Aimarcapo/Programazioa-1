package exekutagarriak;

import model.Selekzioa;

public class EuskalSelekzioa {
    public static void main(String[] args) {
        Selekzioa euskalSelekzioa = new Selekzioa();
        euskalSelekzioa.futbolariBat();
        System.out.println("\n\n");
        euskalSelekzioa.bestePartaideBatzukSortu();
        System.out.println("\n\n");
        euskalSelekzioa.selekzioOsoaSortu();
        int ezabatzekoIda = 4;
        if (euskalSelekzioa.partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
}
