package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;
    
    public Erosketa(char[] kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea;
        this.bezeroa = bezeroa;
        this.guztira = guztira;
    }

    public Erosketa(char[] kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea;
        this.data = data;
        this.bezeroa = bezeroa;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    
}
