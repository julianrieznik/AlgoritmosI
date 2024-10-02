package simples;

public class CuentaCorriente {
    private Double saldo;
    private int cantidad_operaciones;
    private int cantidad_operaciones_invalidas;

    public CuentaCorriente(){
        this.saldo = 0.0;
        this.cantidad_operaciones = 0;
        this.cantidad_operaciones_invalidas = 0;

    }


    public CuentaCorriente(Double saldo){
        this.saldo = saldo;
        this.cantidad_operaciones = 0;
        this.cantidad_operaciones_invalidas = 0;

    }

    public Double saldo(){
        return saldo;
    }
    
    public void deposito(float imp){
        if (imp < 0){
            cantidad_operaciones_invalidas++;
            System.out.println("Deposito invalido");
        } else{
            saldo += imp;
            cantidad_operaciones++; 
        }
    }
    public void extraccion(double d){
        if (d < 0 || d > saldo){
            cantidad_operaciones_invalidas++;
            System.out.println("Extraccion invalida");
            
        }else{
            saldo += d;
            cantidad_operaciones++;   
        }

    }

    public int cantidadOperaciones(){
        return cantidad_operaciones;
    }

    public int cantidadOperacionesInvalidas(){
        return cantidad_operaciones_invalidas;
    }

    @Override
    public String toString() {
        return "Saldo: " + String.valueOf(saldo) + "\n" + "Validas: " + String.valueOf(cantidad_operaciones) + "\n" + "Invalidas: " + String.valueOf(cantidad_operaciones_invalidas);
    }

    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente(32.74);
        System.out.println(c.toString());
        c.extraccion(1.74);
        c.deposito(100);
        System.out.println(c.toString());
        c.extraccion(31212);
        c.deposito(-12);
        System.out.println(c.toString());

    }
}
