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

    //BESTELAKO METODOAK
    public double gainetikOrdainduBeharrekoa(){
        return (kuota * epeak);
    }

    //GETTERS AND SETTERS
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
    
    //TOSTRING 
    @Override
    public String toString() {
        return "EpekakoErosketa [epeak=" + epeak + ", ordainketakBukatua=" + ordainketakBukatua + ", kuota=" + kuota
                + "]";
    }

    @Override
    public String toStringLuzea() {
        String emaitza = "";
        String ordaindua;
        if(this.isOrdainketakBukatua()){
            ordaindua = "Bai";
        } else {
            ordaindua = "Ez";
        }
        emaitza += String.format("%-15s %-15s %-15f %-15d %-15s %-15s\n", this.getData(), this.getBezeroa().getIzena(), this.getGuztira(), this.getEpeak(), this.getKuota(), ordaindua);
        return emaitza;
    }
}
