package Modelo;

public class CursoVirtual extends Curso {
    String plataforma;

    public CursoVirtual(String nombreCurso, String codigoCurso, Profesor profesor, String platforma) {
        super(nombreCurso, codigoCurso, profesor);
        this.plataforma = platforma;
    }
}
