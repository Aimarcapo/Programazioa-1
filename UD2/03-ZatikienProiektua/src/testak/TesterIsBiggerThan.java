package testak;

import java.util.Scanner;

import model.Zatikia;

public class TesterIsBiggerThan {
    public static void main(String[] args) {
        Zatikia zat1, zat2;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan zat1: ");
        zat1 = new Zatikia(in.next());
        System.out.print("Esan zat2: ");
        zat2 = new Zatikia(in.next());
        in.close();

        if(zat1.isBiggerThan(zat2)){
            System.out.println(zat1 + " handiagoa da.");
        } else{
            System.out.println(zat2 + " handiagoa da.");
        }
    }
}
