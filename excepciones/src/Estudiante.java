
public class Estudiante {
    String nombre;
    int edad;
    double promedio;

    public Estudiante(String n, int e, double p) throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException{
        if (n == null || n.isEmpty()){
            throw new NombreInvalidoException();
        }

        if (e < 0 || e > 120){
            throw new EdadInvalidaException();
        }

        if (p < 0.0 || p > 10.0){
            throw new PromedioInvalidoException();
        }
        
        this.nombre = n;
        this.edad = e;
        this.promedio = p;
    }

    @Override
    public String toString() {
        return nombre + " " + String.valueOf(edad) + " " + String.valueOf(promedio);
    }

}
