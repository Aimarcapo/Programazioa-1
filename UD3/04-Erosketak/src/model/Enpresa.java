package model;

import java.util.Arrays;

public class Enpresa extends Bezeroa{
    //ALDAGAI PRIBATUAK SORTU
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;

    //KONSTRUKTOREA
    public Enpresa(int kodea, String helbidea, String izenJuridikoa, String izenKomertziala,
            String[] kontaktoenEmailak) {
        super(kodea, helbidea);
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

    //TOSTRING METODOA
    @Override
    public String toString() {
        return "Enpresa [kodea=" + this.getKodea() + ", izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala
                + ", kontaktoenEmailak=" + Arrays.toString(kontaktoenEmailak) + ", helbidea=" + this.getHelbidea() + "]";
    }
    
    //GETTERS AND SETTERS
    public String getIzena() {
        return izenKomertziala;
    }

    public String getEmaila() {
        return kontaktoenEmailak[0];
    }

    public String getIzenJuridikoa() {
        return izenJuridikoa;
    }

    public void setIzenJuridikoa(String izenJuridikoa) {
        this.izenJuridikoa = izenJuridikoa;
    }

    public String getIzenKomertziala() {
        return izenKomertziala;
    }

    public void setIzenKomertziala(String izenKomertziala) {
        this.izenKomertziala = izenKomertziala;
    }

    public String[] getKontaktoenEmailak() {
        return kontaktoenEmailak;
    }

    public void setKontaktoenEmailak(String[] kontaktoenEmailak) {
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

    
}
