package model;

public class Pertsona extends Bezeroa {
    private String izena;
    private String abizena;
    private String emaila;

    public Pertsona(String izena, String abizena, String emaila) {
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }

    public String getIzena() {
        return izena;
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

    @Override
    public String toString() {
        return "Pertsona [izena=" + izena + ", abizena=" + abizena + ", emaila=" + emaila + "]";
    }

    
}
