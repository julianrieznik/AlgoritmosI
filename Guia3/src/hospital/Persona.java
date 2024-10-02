package hospital;

public abstract class Persona {
    String nombre;
    String direccion;
    String ciudad;

    public Persona(String nombre, String direccion, String ciudad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    
    public String mostrar(){
        return "Nombre: " + nombre + " - Ciudad: " + ciudad + " - Direccion: " + direccion; 
    }
}
