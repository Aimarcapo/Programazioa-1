package model;

public class Langilea {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;

    public Langilea(int identifikazioa, String izen, String abizen, double solda){
        id = identifikazioa;
        izena = izen;
        abizena = abizen;
        soldata = solda;
    }
    
    /*GETTER */
    /**Langilearen id-a bueltatzen du */
    public int getId(){
        return id;
    }
    /**Langilearen izena bueltatzen du */
    public String getIzena(){
        return izena;
    }
    /**Langilearen abizena bueltatzen du */
    public String getAbizena(){
        return abizena;
    }
    /**Langilearen izen-abizena bueltatzen du */
    public String getIzenOsoa(){
        return izena + " " + abizena;
    }
    /**Langilearen soldata bueltatzen du */
    public double getSoldata(){
        return soldata;
    }
    /**Langilearen urte bateko soldata osoa bueltatzen du */
    public double getUrtekoSoldata(){
        return soldata*12;
    }

    /*SETTER */
    /*Langile beten soldata ezartzen du */
    public void setSoldata(double soldataBerria){
        soldata = soldataBerria;
    }
    
    /*BESTELAKO METODOAK */
    /*Langile baten soldata portzentai bat erabilita igo daiteke */
    public double soldataIgo(int portzentaia){
        
        return (soldata * portzentaia)/100;
    }
    /*GOIKOA FROGATZEA FALTA */
}
