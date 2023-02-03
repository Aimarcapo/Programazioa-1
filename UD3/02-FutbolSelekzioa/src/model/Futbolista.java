package model;

import exekutagarriak.EuskalSelekzioa;
import model.Selekzioa;

public class Futbolista extends IntegranteSeleccion{

    private int dorsal;
    private Demarkazioa demarkazioa;
    
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, Demarkazioa demarkazioa) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarkazioa = demarkazioa;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarkazioa() {
        return demarkazioa;
    }

    public void setDemarkazioa(Demarkazioa demarkazioa) {
        this.demarkazioa = demarkazioa;
    }

    public void entrenar(){
        System.out.println(this.nombre + ", " + this.dorsal + " dorsalarekin, entrenatzen ari da.");
    }

    public void jugarPartido(){
        System.out.println(this.nombre + ", " + this.dorsal + " dorsalarekin, partida jolasten ari da.");
    }

    public Futbolista bilatuDortsaletik(int dortsala){
        Selekzioa euskalSelekzioa = new Selekzioa();
        for (IntegranteSeleccion i : euskalSelekzioa.getSelekzioa()){
            if(i instanceof Futbolista){
                if(((Futbolista) i).getDorsal() == dortsala){
                    return (Futbolista) i;
                }
            }
            
        }
        return null;
    }

    @Override
    public String toString() {
        return "Futbolista [id=" + id + ", izena=" + nombre + ", abizena=" + this.getApellidos() + ", edad="+ this.getEdad() +", dorsal=" + dorsal + ", demarkazioa=" + demarkazioa + "]";
    }
}
