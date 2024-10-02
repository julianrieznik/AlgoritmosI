package simples;

public class Empleado {
    int numero;
    String nombre;

    public Empleado(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero(){
        return numero;
    }

  public String getNombre(){
    return nombre;
    }

    public void setNumero(int num){
        this.numero = num;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String verDatos(){
        return "Nombre - " + nombre + "\n" + "Numero - " + Integer.toString(numero) + "\n";
    }
        public static void main(String[] args) {
            Empleado juan = new Empleado(1, "Juan");
            System.out.println(juan.verDatos());
            Empleado Pedro = new Empleado(2, "Pedro");
            System.out.println(Pedro.verDatos());
        }
} 