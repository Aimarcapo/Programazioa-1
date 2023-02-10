package model;

import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa {
    //ALDAGAI PRIBATUAK
    private int epeak = 12;
    private boolean ordainketakBukatua = false;
    private double kuota;

    //KONSTRUKTOREAK
    public EpekakoErosketa(String kodea, String data, Bezeroa bezeroa, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, int epeak, boolean ordainketakBukatua, double kuota) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);
        this.epeak = epeak;
        this.ordainketakBukatua = ordainketakBukatua;
        this.kuota = kuota;
    }

    

    public EpekakoErosketa(String kodea, Bezeroa bezeroa, double guztira, int epeak, boolean ordainketakBukatua,
            double kuota) {
        super(kodea, bezeroa, guztira);
        this.epeak = epeak;
        this.ordainketakBukatua = ordainketakBukatua;
        this.kuota = kuota;
    }



    public double gainetikOrdainduBeharrekoa(){
        return (kuota * epeak);
    }

    public int getEpeak() {
        return epeak;
    }
    public void setEpeak(int epeak) {
        this.epeak = epeak;
    }
    public boolean isOrdainketakBukatua() {
        return ordainketakBukatua;
    }
    public void setOrdainketakBukatua(boolean ordainketakBukatua) {
        this.ordainketakBukatua = ordainketakBukatua;
    }
    public double getKuota() {
        return kuota;
    }
    public void setKuota(double kuota) {
        this.kuota = kuota;
    }

    
    
}
