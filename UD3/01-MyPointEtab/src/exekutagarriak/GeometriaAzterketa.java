package exekutagarriak;

import java.util.Scanner;

import model.MyPoint;

public class GeometriaAzterketa {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("GEOMETRIA AZTERKETA:");
        System.out.println("=======================");
        int nota = 0;
        if(galdera1()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera2()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera3()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera4()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera5()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera6()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera7()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera8()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera9()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }
        if(galdera10()){
            System.out.println("ONDO!!");
            nota++;
        } else {
            System.out.println("Erantzuna gaizki dago...");
        }

        System.out.println("");
        System.out.println("NOTA: " + nota + "/10");
    }

    //AZTERKETAREN GALDERAK
    public static boolean galdera1(){
        System.out.println("1. Esan ondorengo puntuen arteko distantzia, P1(0, 0), eta P2(0, 3):");
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(0, 3);
        double emaitza = p1.distance(p2);

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }

    public static boolean galdera2(){
        System.out.println("2. Esan, erradioa 3 duen zirkuloaren azalera: ");
        MyCircle zirkulua = new MyCircle(0, 0, 3);
        double emaitza = zirkulua.getArea();

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }

    public static boolean galdera3(){
        System.out.println("3. (0, 0), (0, 1), eta (1, 0) erpinak dituen triangelua zein motatakoa den: ");
        MyTriangle triangelua = new MyTriangle(0, 0, 0, 1, 1, 0);
        String emaitza = triangelua.getType().toLowerCase();
        String erantzuna = in.next().toLowerCase();

        return emaitza == erantzuna;
    }

    public static boolean galdera4(){
        System.out.println("4. Esan (0, 0), (0, 1), eta (1, 0) erpinak dituen triangeluaren perimetroa: ");
        MyTriangle triangelua = new MyTriangle(0, 0, 0, 1, 1, 0);
        double emaitza = triangelua.getPerimeter();

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }

    public static boolean galdera5(){
        System.out.println("5. Esan (0, 0) eta (5, 0) puntuetan zentroa duten zirkuluen arteko distantzia: ");
        MyCircle zirkulua1 = new MyCircle(new MyPoint(0, 0), 2);
        MyCircle zirkulua2 = new MyCircle(new MyPoint(5, 0), 2);
        double emaitza = zirkulua1.distance(zirkulua2);

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }

    public static boolean galdera6(){
        System.out.println("6. (2, 2) puntua, zirkulu honen (zentroa: (5, 5), eta r: 6) barruan dago? ");
        MyPoint puntua = new MyPoint(2, 2);
        MyCircle zirkulua = new MyCircle(new MyPoint(5, 5), 6);
        boolean barruan = zirkulua.isInside(puntua);
        String emaitza = "ez";
        if(barruan){
            emaitza = "bai";
        }

        String erantzuna = in.next();
        erantzuna.toLowerCase();

        return emaitza.equals(erantzuna);
    }

    public static boolean galdera7(){
        System.out.println("7. Esan TopLeft (-2, -2) eta Bottomright (0, 0) duen rektanguluaren azalera");
        MyRectangle rektangulua = new MyRectangle(new MyPoint(-2, -2), new MyPoint(0, 0));
        double emaitza = rektangulua.getPerimetroa();

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }

    public static boolean galdera8(){
        System.out.println("8. Esan TopLeft (-2, -2) eta Bottomright (0, 0) rektangulua, eta TL(-4, -4) BR(-2, -2) beste rektanguluaren azalerak berdinak diren(Bai/Ez): ");
        MyRectangle rektangulua1 = new MyRectangle(new MyPoint(-2, -2), new MyPoint(0, 0));
        MyRectangle rektangulua2 = new MyRectangle(new MyPoint(-4, -4), new MyPoint(-2, -2));
        boolean berdinak = rektangulua1.getAzalera() == rektangulua2.getAzalera();
        String emaitza = "ez";
        if(berdinak){
            emaitza = "bai";
        }

        String erantzuna = in.next();
        erantzuna.toLowerCase();

        return emaitza.equals(erantzuna);
    }

    public static boolean galdera9(){
        MyPoint p1 = new MyPoint(((int)(Math.random()*10)), ((int)(Math.random()*10)));
        MyPoint p2 = new MyPoint(((int)(Math.random()*10)), ((int)(Math.random()*10)));
        System.out.println("9. Esan ondorengo " + p1 + " eta " + p2 + " puntuen arteko distantzia:");
        double emaitza = p1.distance(p2);

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }

    public static boolean galdera10(){
        MyCircle zirkulua1 = new MyCircle(((int)(Math.random()*10)), ((int)(Math.random()*10)), 3);
        MyCircle zirkulua2 = new MyCircle(((int)(Math.random()*10)), ((int)(Math.random()*10)), 3);
        System.out.println("9. Esan ondorengo " + zirkulua1 + " eta " + zirkulua2 + " puntuen arteko distantzia:");
        double emaitza = zirkulua1.distance(zirkulua2);

        double erantzuna = in.nextDouble();

        return emaitza == erantzuna;
    }
}
