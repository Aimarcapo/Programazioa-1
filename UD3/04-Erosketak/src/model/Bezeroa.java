package model;

abstract public class Bezeroa {
    private int kodea;
    private String helbidea;

    public int getKodea(){
        return this.kodea;
    }

    abstract public String getIzena();

    public String getHelbidea(){
        return this.helbidea;
    }

    abstract public String getEmaila();
}
