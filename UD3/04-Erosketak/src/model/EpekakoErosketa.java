package model;

public class EpekakoErosketa extends Erosketa {
    private int epeak = 12;
    private boolean ordainketakBukatua = false;
    private double kuota;

    public double gainetikOrdainduBeharrekoa(){
        return (kuota * epeak);
    }
    /*EGITEKE */
    public EpekakoErosketa(String kodea, Bezeroa bezeroa, double guztira, double kuota) {
        super(kodea, bezeroa, guztira);
        this.kuota = kuota;
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
