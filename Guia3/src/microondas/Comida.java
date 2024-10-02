package microondas;

public class Comida {
    private String nombre;
    private double puntosCoccion;

    public Comida(String nombre){
        this.nombre = nombre;
        this.puntosCoccion = 0.0;
    }

    public void cocinar(double coccion){
        this.puntosCoccion += coccion;
    }

    @Override
    public String toString() {
        return nombre + ". Coccion: " + puntosCoccion;
    }
}
