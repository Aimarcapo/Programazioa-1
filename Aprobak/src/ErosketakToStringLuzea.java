import java.util.ArrayList;

import model.Bezeroa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;

public class ErosketakToStringLuzea {
    public static void main(String[] args) {
        Bezeroa bezeroa = new Pertsona("Gorka", "Garcia", "gg@gmail.com");
        ArrayList<Produktua> produktuak = new ArrayList<>();
        ArrayList<Integer> unitateak = new ArrayList<>();
        produktuak.add(new Produktua("SDK1234", "Atuna", 15));
        produktuak.add(new Produktua("FG49", "Patatak", 4));
        unitateak.add(7);
        unitateak.add(12);
        Erosketa erosketa = new Erosketa("50ER", "2022-10-10", bezeroa, produktuak, unitateak, 0);

        System.out.println(erosketa.toStringLuzea());
    }
}
