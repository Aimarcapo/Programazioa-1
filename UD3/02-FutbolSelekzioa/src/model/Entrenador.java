package model;

public class Entrenador extends IntegranteSeleccion{
    public Entrenador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        //TODO Auto-generated constructor stub
    }

    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento(){
        System.out.println(this.nombre + " entrenamentua zuzenduko du.");
    }

    public void dirigirPartido(){
        System.out.println(this.nombre + " partida zuzenduko du.");
    }
}
