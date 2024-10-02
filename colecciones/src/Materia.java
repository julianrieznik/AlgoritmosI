

public class Materia {
    private String nombre;
    int codigo;
    boolean estado;

    public Materia(String n, int c){
        this.nombre = n;
        this.codigo = c;
        this.estado = false;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Materia other = (Materia) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}