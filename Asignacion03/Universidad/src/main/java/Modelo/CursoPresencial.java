package Modelo;

public class CursoPresencial extends Curso {
    private String aula;

    public CursoPresencial(String nombreCurso, String codigoCurso, Profesor profesor, String aula) {
        super(nombreCurso, codigoCurso, profesor);
        this.aula = aula;
    }
}
