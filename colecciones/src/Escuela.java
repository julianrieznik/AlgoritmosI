
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Escuela {
    List<Estudiante> estudiantes;
    Set<Materia> materias;

    public Escuela(){
        this.estudiantes = new ArrayList<>();
        this.materias = new HashSet<>();
    }

    public Escuela(List<Estudiante> estudiantes, Set<Materia> materias){
        this.estudiantes = estudiantes;
        this.materias = materias;
    }

    public void agregarMateria(Materia m){
        materias.add(m);
    }

    public void agregarEstudiante(Estudiante e){
        estudiantes.add(e);
    }

    public static void main(String[] args) {
    Escuela escuela = new Escuela();
    Materia m1 = new Materia("Matemática", 2);
    Materia m2 = new Materia("Historia", 3);
    Materia m3 = new Materia("Química", 4);
    Materia m4 = new Materia("Física", 5);
    Materia m5 = new Materia("Literatura", 6);
    
    escuela.agregarMateria(m1);
    escuela.agregarMateria(m2);
    escuela.agregarMateria(m3);
    escuela.agregarMateria(m4);
    escuela.agregarMateria(m5);

    HistoriaAcademica ha1 = new HistoriaAcademica();
    ha1.agregarMateria(m1, Set.of(8.5, 9.0, 7.5, 6.0, 10.0));
    ha1.agregarMateria(m2, Set.of(7.0, 6.5, 5.5, 8.0, 9.0));
    Estudiante e1 = new Estudiante("Juan Pérez", 10001, 20, ha1);
    
    HistoriaAcademica ha2 = new HistoriaAcademica();
    ha2.agregarMateria(m3, Set.of(4.0, 5.5, 6.0, 7.0, 3.5));
    ha2.agregarMateria(m4, Set.of(8.0, 7.5, 9.5, 10.0, 9.0));
    Estudiante e2 = new Estudiante("María López", 10002, 22, ha2);
    
    HistoriaAcademica ha3 = new HistoriaAcademica();
    ha3.agregarMateria(m1, Set.of(3.0, 2.5, 4.2, 4.0, 3.5));
    ha3.agregarMateria(m5, Set.of(6.0, 5.5, 7.5, 8.0, 7.0));
    Estudiante e3 = new Estudiante("Carlos García", 10003, 19, ha3);
    
    HistoriaAcademica ha4 = new HistoriaAcademica();
    ha4.agregarMateria(m2, Set.of(8.0, 7.0, 6.0, 9.5, 10.0));
    ha4.agregarMateria(m3, Set.of(5.0, 6.5, 7.5, 8.0, 9.0));
    Estudiante e4 = new Estudiante("Ana Martínez", 10004, 21, ha4);
    
    HistoriaAcademica ha5 = new HistoriaAcademica();
    ha5.agregarMateria(m4, Set.of(10.0, 9.5, 9.0, 8.0, 7.0));
    ha5.agregarMateria(m5, Set.of(6.0, 7.5, 8.0, 9.0, 8.5));
    Estudiante e5 = new Estudiante("Luis Fernández", 10005, 23, ha5);

    escuela.agregarEstudiante(e1);
    escuela.agregarEstudiante(e2);
    escuela.agregarEstudiante(e3);
    escuela.agregarEstudiante(e4);
    escuela.agregarEstudiante(e5);

    for(Estudiante est : escuela.estudiantes){
        System.out.println(est.nombre);
        est.hAcademica.infoAlumno();
        System.out.println("---------------------------");
        }
    }
}
