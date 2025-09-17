package Modelo;

public class Profesor extends Persona {
    private String departamento;

    public Profesor(String nombre, int id, String correo, String departamento) {
        super(nombre, id, correo);
        this.departamento = departamento;
    }
}
