package model;

public class Enpresa extends Bezeroa{
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;
    
    public Enpresa(String izenJuridikoa, String izenKomertziala, String[] kontaktoenEmailak) {
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

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
