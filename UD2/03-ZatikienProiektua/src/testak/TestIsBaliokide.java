package testak;

import java.util.Scanner;

import model.Zatikia;

public class TestIsBaliokide {
    public static void main(String[] args) {
        Zatikia zat1, zat2;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan zat1: ");
        zat1 = new Zatikia(in.next());
        System.out.print("Esan zat2: ");
        zat2 = new Zatikia(in.next());
        in.close();

        if(zat1.isBaliokidea(zat2)){
            System.out.println("Baliokideak dira");
        } else{
            System.out.println("Ez dira baliokideak");
        }
    }   
}
