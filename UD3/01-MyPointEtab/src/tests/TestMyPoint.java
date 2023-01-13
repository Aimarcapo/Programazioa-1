package tests;

import java.util.ArrayList;
import java.util.Arrays;

import model.MyPoint;

public class TestMyPoint {
    public static void main(String[] args) {
        //ESKATUTAKO 3 PUNTUAK SORTU
        MyPoint p0 = new MyPoint();
        MyPoint p1 = new MyPoint(2, 1);
        MyPoint p2 = new MyPoint(4, 0);
        System.out.println("a) Hiru puntu sortu:");
        System.out.println("\tp0 => " + p0);
        System.out.println("\tp1 => " + p1);
        System.out.println("\tp2 => " + p2);

        System.out.println("");

        //DISTANTZIAK (0, 0)-RA
        System.out.println("b) Distantziak koordenatu-jatorriarekiko: ");
        System.out.println("\tp0 => " + p0.distance());
        System.out.println("\tp1 => " + p1.distance());
        System.out.println("\tp2 => " + p2.distance());

        System.out.println("");

        //DISTANTZIAK PUNTUEN ARTEAN
        System.out.println("c) Distantziak euren artean: ");
        System.out.printf("\tp0tik p1ra => %.2f\n", p0.distance(p1));
        System.out.println("\tp0tik p2ra => " + p0.distance(p2));
        System.out.printf("\tp1tik p2ra => %.2f\n", p1.distance(p2));

        System.out.println("");

        //GETXY METODOA FROGATZEKO
        System.out.println("c.2) p1 puntuaren datuak getXY() metodoa erabilita:");
        System.out.println("\tArrays.toString(p1.getXY()) => " + Arrays.toString(p1.getXY()));

        //PUNTUEN ARRAY BAT EGIN
        System.out.println("d) Sortu 10 puntuko array bat. Eta automatikoki bete:");
        MyPoint[] puntuenArraya = new MyPoint[10];
        for (int i = 0; i < puntuenArraya.length; i++) {
            puntuenArraya[i] = new MyPoint((i+1), (i+1));
        }
        System.out.println("\tpuntuenArraya => " + Arrays.toString(puntuenArraya));

        System.out.println("");

        //100 PUNTUKO ARRAYLIST
        System.out.println("e) Sortu 100 puntuko arrayLista:");
        ArrayList<MyPoint> ehunPuntu = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ehunPuntu.add(new MyPoint((i), (i)));
            System.out.println("\t" + ehunPuntu.get(i));
        }

        System.out.println("");

        //5 AUSAZKO PUNTO SORTU
        System.out.println("f) Sortu ausazko 5 puntuko sorta (0-9 tartean). java.util.Random klasearen .nextInt() metodoa erabili dezakezu.");
        MyPoint[] ausazkoPuntuak = new MyPoint[5];
        for (int i = 0; i < 5; i++) {
            MyPoint pBerria = new MyPoint(((int)(Math.random()*9)), ((int)(Math.random()*9)));
            ausazkoPuntuak[i] = pBerria;
        }
        System.out.println("\t" + Arrays.toString(ausazkoPuntuak));
    }   
}
