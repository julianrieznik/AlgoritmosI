package hospital;


public class Proveedor extends Persona {
    String codigoVendedor;
    double saldo;
    String fax;
    String telefono;
    double descuentos;

    public Proveedor(String nombre, String direccion, String ciudad, String codigoVendedor, double saldo, String fax, String telefono, double descuentos) {
        super(nombre, direccion, ciudad);
        this.codigoVendedor = codigoVendedor;
        this.saldo = saldo;
        this.fax = fax;
        this.telefono = telefono;
        this.descuentos = descuentos;
    }

    @Override
    public String mostrar() {
        String saldoStr = String.valueOf(saldo);
        String descuentosStr = String.valueOf(descuentos); 

        return "PROVEEDOR" + "\n" +
            super.mostrar() + 
            " - Código Vendedor: " + codigoVendedor + 
            " - Saldo: $" + saldoStr + 
            " - Fax: " + fax + 
            " - Teléfono: " + telefono + 
            " - Descuentos: " + descuentosStr + "%";
    }

    public void pagarFactura(double aPagar){
        double cDescuento = aPagar * (1-descuentos);
        String pago = String.valueOf(cDescuento);
        this.saldo -= aPagar;
        System.out.println("Pagado: $" + pago + " a " + nombre);
        
    }
}