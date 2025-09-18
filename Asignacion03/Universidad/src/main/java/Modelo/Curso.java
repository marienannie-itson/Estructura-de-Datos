package Modelo;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private Profesor profesor;

    public Curso(String nombreCurso, String codigoCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.profesor = profesor;
    }

    public String getNombreCurso() { return nombreCurso; }
    public String getCodigoCurso() { return codigoCurso; }
    public Profesor getProfesor() { return profesor; }
}
