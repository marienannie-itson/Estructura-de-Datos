package Modelo;

public class CursoVirtual extends Curso {
    String plataforma;

    public CursoVirtual(String nombreCurso, String codigoCurso, Profesor profesor, String plataforma) {
        super(nombreCurso, codigoCurso, profesor);
        this.plataforma = plataforma;
    }
}
