package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Erosketa {
    //ALDAGAI BABESTUAK SORTU
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;
    
    //KONSTRUKTOREAK
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

    //TOSTRING METODOAK
    @Override
    public String toString() {
        return "Erosketa [kodea=" + this.getKodea() + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak="
                + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + "]";
    }

    public String toStringLuzea(){
        String emaitza = "";
        emaitza += "EROSKETA";
        emaitza += "\nKodea: " + this.getKodea() + "\tData: " + data;
        emaitza += "\nBezeroa: " + bezeroa.getKodea();
        emaitza += "\nIzena: " + bezeroa.getIzena();
        emaitza += "\nHelbidea: " + bezeroa.getHelbidea();
        emaitza += "\neMail: " + bezeroa.getEmaila();
        emaitza += "\n";
        emaitza += String.format("%-25s %-25s %-25s %-25s %-25s\n", "Kodea", "Produktua", "Unitateak", "Prezioa", "Zenbatekoa");
        emaitza += "-----------------------------------------------------------------------------------------------------------------------------------------\n";
        for (int i = 0; i < produktuak.size(); i++) {
            emaitza += String.format("%-25s %-25s %-25s %-25s %-25s\n", produktuak.get(i).getKodea(), produktuak.get(i).getIzena(), unitateak.get(i), produktuak.get(i).getPrezioa(), (unitateak.get(i) * produktuak.get(i).getPrezioa()));
        }
        /*double guztira = 0;
        for (int i = 0; i < produktuak.size(); i++) {
            guztira += unitateak.get(i) * produktuak.get(i).getPrezioa();
        }*/
        emaitza += "\t\tGUZTIRA: " + guztira;
        
        return emaitza;
    }

    //BESTELAKO METODOAK
    public boolean guztiraEgiaztatu(){
        int totala = 0;
        for (int i = 0; i < produktuak.size(); i++) {
            totala += unitateak.get(i) * produktuak.get(i).getPrezioa();
        }
        if(this.guztira == totala){
            return true;
        } else{
            return false;
        }
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public void setBezeroa(Bezeroa bezeroa) {
        this.bezeroa = bezeroa;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public void setProduktuak(ArrayList<Produktua> produktuak) {
        this.produktuak = produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public void setUnitateak(ArrayList<Integer> unitateak) {
        this.unitateak = unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    public void setGuztira(double guztira) {
        this.guztira = guztira;
    }

        
}
