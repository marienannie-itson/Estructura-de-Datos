package Main;

import Modelo.*;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Brianda", 216578, "profebrianda@itson.edu.mx", "ISW");
        CursoVirtual cursoEstructuraDeDatos = new CursoVirtual("Estructura de Datos", "C1147C", profesor1, "meet");

        Estudiante e1 = new Estudiante("Maria", 267714, "maria@itson.edu-mx", "ISW", 3);
        Estudiante e2 = new Estudiante("Juan Diego", 487954, "diego@itson.edu-mx", "ISW", 3);
        Estudiante e3 = new Estudiante("Pablo", 252902, "pablo@itson.edu-mx", "ISW", 5);
        Estudiante e4 = new Estudiante("Daniel", 789152, "daniel@itson.edu-mx", "ISW", 5);

        Inscripcion<CursoVirtual> InscripcionEstructuraDeDatos = new Inscripcion<CursoVirtual>(cursoEstructuraDeDatos);

        InscripcionEstructuraDeDatos.inscribirEstudiante(e1);
        InscripcionEstructuraDeDatos.inscribirEstudiante(e2);
        InscripcionEstructuraDeDatos.inscribirEstudiante(e3);
        InscripcionEstructuraDeDatos.inscribirEstudiante(e4);

        InscripcionEstructuraDeDatos.mostrarInscritos();

        InscripcionEstructuraDeDatos.removerEstudiante(e1);

        InscripcionEstructuraDeDatos.mostrarInscritos();
    }
}
