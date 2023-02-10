package model;

public class Produktua {
    //ALDAGAI PRIBATUAK SORTU
    private char[] kodea;
    private String izena;
    private double prezioa;
    
    //KONSTRUKTOREAK
    public Produktua(String kodea, String izena, double prezioa) {
        this.kodea = kodea.toCharArray();
        this.izena = izena;
        this.prezioa = prezioa;
    }

    //GETTERS AND SETTERS
    public String getKodea() {
        String kodeaStr = "";
        for (int i = 0; i < kodea.length; i++) {
            char momChar = this.kodea[i];
            kodeaStr += momChar;
        }
        return kodeaStr;
    }

    public void setKodea(char[] kodea) {
        this.kodea = kodea;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public void setPrezioa(double prezioa) {
        this.prezioa = prezioa;
    }

    @Override
    public String toString() {
        return "Produktua [kodea=" + this.getKodea() + ", izena=" + izena + ", prezioa=" + prezioa + "]";
    }

    
}
