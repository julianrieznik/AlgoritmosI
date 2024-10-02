package igualdad_orden_copia.personainmutable;
public final class Persona {
    private final String nombre;
    private final String apellido;
    private Documento documento;

    public Persona(String nombre, String apellido, Documento documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }
    
    public void renovarDNI(){
        int num = this.documento.getNumero();
        this.documento = new Documento(num);
    }

    public String datos(){
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        String doc = documento.toString();
        return datos() + " " + doc;
    }

    public static void main(String[] args) throws InterruptedException {
        Persona p = new Persona("Julian", "Rieznik", new Documento(42214696));
        Persona p1 = new Persona("Martina", "Varela", new Documento(42215653));
        Persona p2 = new Persona("Maria", "Sanchez", new Documento(14927553));
        Persona p3 = new Persona("Pedro", "Maguez", new Documento(46503432));
        Persona p4 = new Persona("Pip", "Pep", new Documento(29875430));
        Persona[] personas = {p,p1,p2,p3,p4};
        for (Persona persona : personas){
            System.out.println(persona.toString());
        }
        Thread.sleep(2000);
        p2.renovarDNI();
        p4.renovarDNI();

        for (Persona persona : personas){
            System.out.println(persona.toString());
        }
    
    }
}
