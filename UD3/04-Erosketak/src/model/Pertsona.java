package model;

public class Pertsona extends Bezeroa {
    //ALDAGAI PRIBATUAK SORTU
    private String izena;
    private String abizena;
    private String emaila;

    //KONSTRUKTOREAK
    public Pertsona(int kodea, String helbidea, String izena, String abizena, String emaila) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    //TOSTRING METODOA
    @Override
    public String toString() {
        return "Pertsona [kodea=" + this.getKodea() + ", izena=" + izena + ", abizena=" + abizena + ", emaila=" + emaila + ", helbidea=" + this.getHelbidea() + "]";
    }

    //GETTERS AND SETTERS
    @Override
    public String getIzena() {
        return izena + " " + abizena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public void setAbizena(String abizena) {
        this.abizena = abizena;
    }

    public String getEmaila() {
        return emaila;
    }

    public void setEmaila(String emaila) {
        this.emaila = emaila;
    }    
}
