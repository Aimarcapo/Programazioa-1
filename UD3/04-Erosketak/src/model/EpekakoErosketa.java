package model;

import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa {
    private int epeak = 12;
    private boolean ordainketakBukatua = false;
    private double kuota;

    public double gainetikOrdainduBeharrekoa(){
        return (kuota * epeak);
    }
    /*EGITEKE */
    public EpekakoErosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, double kuota) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);
        this.kuota = kuota;
    }
    
}
