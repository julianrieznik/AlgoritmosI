package hospital;

public class Paciente extends Persona {
    int codigoDiagnostico;
    String telefono;
    String fechaNacimiento;
    int nroFactura;
    
    public Paciente(String nombre, String direccion, String ciudad, int codigoDiagnostico, String telefono, String fechaNacimiento) {
        super(nombre, direccion, ciudad);
        this.codigoDiagnostico = codigoDiagnostico;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.nroFactura = 1;
    }
    @Override
    public String mostrar(){
        return "PACIENTE" + "\n" +
        super.mostrar() + 
        " - CD: " + codigoDiagnostico + 
        " - Tel: " + telefono + 
        " - Fecha nacimiento: " + fechaNacimiento;
    }

    public void enviarFactura(){
        double monto = codigoDiagnostico * 1.75;
        System.out.println("Factura " + "000" + String.valueOf(codigoDiagnostico) + 
        "-" + "0000000" + String.valueOf(nroFactura) + " enviada");
        System.out.println("Monto: $" + String.valueOf(monto));
        codigoDiagnostico++;
        nroFactura++;
    }
}
