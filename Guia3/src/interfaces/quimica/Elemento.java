package interfaces.quimica;

public class Elemento implements Comparable<Elemento> {
    String nombre;

    public Elemento(String nombre){
        this.nombre = nombre;
    }

    @Override
public int compareTo(Elemento o) {
    if (this.nombre.equals("C")) {
        return -1; 
    }
    if (o.nombre.equals("C")) {
        return 1;
    }
    if (this.nombre.equals("H")) {
        return -1;
    }
    if (o.nombre.equals("H")) {
        return 1;
    }
    return this.nombre.compareTo(o.nombre);
}

}
