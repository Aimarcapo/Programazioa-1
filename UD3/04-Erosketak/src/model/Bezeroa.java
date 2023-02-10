package model;

abstract public class Bezeroa {
    //ALDAGAI PRIBATUAK SORTU
    private int kodea;
    private String helbidea;

    //GETTER AND SETTERS
    public int getKodea(){
        return this.kodea;
    }

    abstract public String getIzena();

    public String getHelbidea(){
        return this.helbidea;
    }

    public void setKodea(int kodea) {
        this.kodea = kodea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    abstract public String getEmaila();
}
