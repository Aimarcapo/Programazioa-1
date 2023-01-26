package model;

public class Masajista extends IntegranteSeleccion {

    private String titulación;
    private int añosExperiencia;
    
    public Masajista(int id, String nombre, String apellidos, int edad, String titulación, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulación = titulación;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulación() {
        return titulación;
    }

    public void setTitulación(String titulación) {
        this.titulación = titulación;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(){
        System.out.println();
    }
    
}
