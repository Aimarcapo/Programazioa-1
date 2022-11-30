package testak;
import java.util.Scanner;

import model.Zatikia;

public class TestSinplifikatu {
    public static void main(String[] args) {
        Zatikia zatikia;

        Scanner in = new Scanner(System.in);
        System.out.print("Esan sinplifikatu nahi duzun zatikia: ");
        zatikia = new Zatikia(in.next());
        in.close();

        System.out.println("Zure zatikia sinplifikatuta: " + zatikia.sinplifikatu());
    }
}
