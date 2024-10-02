package hospital;

public class Planta extends Empleado {
    double salario;
    int anosAntiguedad;

    public Planta(String nombre, String direccion, String ciudad, int codigoEmpleado, double horasExtra, String companiaSeguro, double salario, int anosAntiguedad) {
        super(nombre, direccion, ciudad, codigoEmpleado, horasExtra, companiaSeguro);
        this.salario = salario;
        this.anosAntiguedad = anosAntiguedad;
    }
    
    public void pagarSalario(){
        double base = super.enviarSalario();
        double aPagar = base + salario*anosAntiguedad;
        this.anosAntiguedad++;
        String pago = String.valueOf(aPagar);
        System.out.println("Pagado $" + pago + " a " + nombre);
    }

    @Override
    public String mostrar() {
        String salarioStr = String.valueOf(salario);
        String anosAntiguedadStr = String.valueOf(anosAntiguedad);

        return "PLANTA" + "\n" +
            super.mostrar() + 
            " - Salario: $" + salarioStr + 
            " - Años de Antigüedad: " + anosAntiguedadStr;
    }
}
