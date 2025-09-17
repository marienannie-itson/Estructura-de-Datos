package Modelo;

public class Estudiante extends Persona {
    protected String carrera;
    protected int semestre;

    public Estudiante (String nombre, int id, String correo, String carrera, int semestre){
        super(nombre, id, correo);

        this.carrera = carrera;
        this.semestre = semestre;
    }
}
