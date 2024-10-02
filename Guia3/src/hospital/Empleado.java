package hospital;

public class Empleado extends Persona{
    int codigoEmpleado;
    double horasExtra;
    String companiaSeguro;

    public Empleado(String nombre, String ciudad, String direccion, int codigoEmpleado, double horasExtra, String companiaSeguro){
        super(nombre, ciudad, direccion);
        this.codigoEmpleado = codigoEmpleado;
        this.horasExtra = horasExtra;
        this.companiaSeguro = companiaSeguro;
    }

    @Override
    public String mostrar(){
        String cod = String.valueOf(codigoEmpleado);
        String he = String.valueOf(horasExtra);

        return super.mostrar() +
         " - Cod: " + cod + 
         " - Horas Extra: " + he + 
         " - Seguro: " + companiaSeguro;
    }
    
    public double enviarSalario(){
        double salario = 75000 + horasExtra*2.32;
        return salario;
    }
}
