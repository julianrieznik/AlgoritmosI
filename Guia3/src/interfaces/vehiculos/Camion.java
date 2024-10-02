package interfaces.vehiculos;

public class Camion extends VehiculoMotorizado implements CapacidadLimite{
    Integer remolques;

    
    public Camion(String fabricante, String modelo, Integer año_fabricacion, Double kilometraje, Integer remolques){
        super(fabricante, modelo, año_fabricacion, kilometraje);
        this.remolques = remolques;
    }


    @Override
    public int puntosdeSeguridad() {
        return LIMITE_REMOLQUES_CAMION - remolques;
    }
    public void agregar(){
        this.remolques += 1;
    }

    public void sacar(){
        if (this.remolques > 0){
            this.remolques -= 1;
        }
        else{
        System.out.println("camion vacio.");
        }
    }

    @Override
    public String toString() {

        return "CAMION " +
        super.toString() + 
        " Remolques: " + this.remolques +
        " Seguridad: " + String.valueOf(puntosdeSeguridad());
    }
}
