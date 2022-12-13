package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_Aproba {
    public static void main(String[] args) {
        ArrayList<String> izenak = new ArrayList<String>();

        Scanner in = new Scanner(System.in);

        int errepikatu = (int)(Math.random()*10+1);
        System.out.println(errepikatu);
        for(int i = 0; i < errepikatu; i++){
            System.out.println("Sartu izen bat:");
            izenak.add(in.next());
        }
        System.out.println("");
        System.out.println("Nahikoa.");
        System.out.println("");
        for(int i = 0; i < izenak.size(); i++){
            System.out.print(i+1 + ". izena: ");
            System.out.println(izenak.get(i));
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Aldatu array listaren lehenengo balioa: ");
        izenak.add(0, in.next());
        System.out.print("Sartutako izen berria lehenengo posizioan: ");
        System.out.println(izenak.get(0));
        in.close();
    }
}
