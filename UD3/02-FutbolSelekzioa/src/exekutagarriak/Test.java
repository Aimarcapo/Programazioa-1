package exekutagarriak;

import model.Demarkazioa;
import model.Futbolista;

public class Test {
    public static void main(String[] args) {
        Futbolista Juan = new Futbolista(1, "Juan", "Ramírez", 25, 12, Demarkazioa.MED);

        System.out.println(Juan);
    }
}
