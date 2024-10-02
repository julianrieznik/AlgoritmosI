package interfaces.vehiculos;

public class Motocicleta extends VehiculoMotorizado{
    String uso;
    
    public Motocicleta(String fabricante, String modelo, Integer año_fabricacion, Double kilometraje, String uso){
        super(fabricante, modelo, año_fabricacion, kilometraje);
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "MOTO " +  super.toString() + " Uso: " + this.uso;
    }
}
