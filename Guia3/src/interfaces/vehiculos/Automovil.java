package interfaces.vehiculos;

public class Automovil extends VehiculoMotorizado implements CapacidadLimite{
    String estilo;
    Integer pasajeros;
    
    public Automovil(String fabricante, String modelo, Integer año_fabricacion, Double kilometraje, String estilo, Integer pasajeros){
        super(fabricante, modelo, año_fabricacion, kilometraje);
        this.estilo = estilo;
        this.pasajeros = pasajeros;
    }

    @Override
    public int puntosdeSeguridad() {
        int puntos = LIMITE_PASAJEROS_AUTOMOVIL - pasajeros;
        return puntos;
    }

    public void agregar(){
        this.pasajeros += 1;
    }

    public void sacar(){
        if (pasajeros > 0){
            this.pasajeros -= 1;
        }
        else{
        System.out.println("Auto vacio.");
        }
    }

    @Override
    public String toString() {
        return "AUTO" + 
        super.toString() + 
        " Pasajeros: " + pasajeros +
        " Seguridad: " + String.valueOf(puntosdeSeguridad());
    }
}
