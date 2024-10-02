
public class Estudiante {
    String nombre;
    int matricula;
    int edad;
    HistoriaAcademica hAcademica;

    public Estudiante(String n, int m, int e, HistoriaAcademica ha){
        this.nombre = n;
        this.matricula = m;
        this.edad = e;
        this.hAcademica = ha;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Estudiante other = (Estudiante) obj;
        return this.matricula == other.matricula;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(matricula);
    }
}
