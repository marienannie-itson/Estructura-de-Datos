package Modelo;

import excepciones.EstudianteException;

import java.util.ArrayList;

public class Inscripcion<T extends Curso> {
    T curso;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Inscripcion(T curso) {
        this.curso = curso;
    }

    public void inscribirEstudiante(Estudiante e) {
        if (!estudiantes.contains(e)) {
            estudiantes.add(e);
            System.out.println("Se ha inscrito al estudiante con ID: " + e.getId() + " al curso: " + curso.getNombreCurso() + " exitosamente.");
        }
        else throw new EstudianteException("El estudiante ya está inscrito al curso: " + curso.getNombreCurso());
    }

    public void removerEstudiante(Estudiante e) {
        if (estudiantes.contains(e)){
            estudiantes.remove(e);
            System.out.println("El estudiante con ID: " + e.getId() + " ha sido eliminado del curso: " + curso.getNombreCurso() + " exitosamente.");
        } else throw new EstudianteException("El estudiate con ID: " + e.getId() + " no se encuentra inscrito al curso: " + curso.getNombreCurso());
    }

    public void mostrarInscritos(){
        if (estudiantes.isEmpty()) throw new EstudianteException("El curso: " + curso.getNombreCurso() + " se encuentra vacío.");
        else {
            System.out.println("Estudiante Inscritos:");
            for (Estudiante e : estudiantes) System.out.println("- " + e.getNombre() + "(" + e.getId() +")");
            System.out.println("Total Inscritos: " + estudiantes.size());
        }
    }
}
