package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;
    
    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroa = bezeroa;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    @Override
    public String toString() {
        return "Erosketa [kodea=" + Arrays.toString(kodea) + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak="
                + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + "]";
    }

    public String toStringLuzea(){
        double guztira = 0;
        String emaitza = "";
        emaitza += "EROSKETA";
        emaitza += "\nKodea: " + Arrays.toString(kodea) + "\tData: " + data;
        emaitza += "\nIzena: " + bezeroa.getIzena();
        emaitza += "\nHelbidea: " + bezeroa.getHelbidea();
        emaitza += "\neMail: " + bezeroa.getEmaila();
        emaitza += "\n";
        emaitza += String.format("%-25s %-25s %-25s %-25s %-25s\n", "Kodea", "Produktua", "Unitateak", "Prezioa", "Zenbatekoa");
        emaitza += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
        for (int i = 0; i < produktuak.size(); i++) {
            emaitza += String.format("%-25s %-25s %-25s %-25s %-25s\n", Arrays.toString(produktuak.get(i).getKodea()), produktuak.get(i).getIzena(), unitateak.get(i), produktuak.get(i).getPrezioa(), (unitateak.get(i) * produktuak.get(i).getPrezioa()));
        }
        /*for (int i = 0; i < produktuak.size(); i++) {
            guztira += unitateak.get(i) * produktuak.get(i).getPrezioa();
        }*/
        emaitza += "\t\tGUZTIRA: " + guztira;
        
        return emaitza;
    }
    
}
