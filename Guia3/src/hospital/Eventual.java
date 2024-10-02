package hospital;

public class Eventual extends Empleado {
    double honorariosPorHora;

    public Eventual(String nombre, String direccion, String ciudad, int codigoEmpleado, double horasExtra, String companiaSeguro, double honorariosPorHora) {
        super(nombre, direccion, ciudad, codigoEmpleado, horasExtra, companiaSeguro);
        this.honorariosPorHora = honorariosPorHora;
    }
    

    public void pagarSalario() {
        double base = super.enviarSalario();
        double aPagar = base + base*honorariosPorHora;
        this.honorariosPorHora++;
        String pago = String.valueOf(aPagar);
        System.out.println("Pagado $" + pago + " a " + nombre);
    }

    @Override
    public String mostrar() {
        String honorariosPorHoraStr = String.valueOf(honorariosPorHora);

        return "EVENTUAL" + "\n" +
            super.mostrar() + 
            " - Honorarios por Hora: $" + honorariosPorHoraStr;
    }
}
