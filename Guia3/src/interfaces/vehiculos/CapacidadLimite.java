package interfaces.vehiculos;

public interface CapacidadLimite {
    public static final int LIMITE_PASAJEROS_AUTOMOVIL = 4;
    public static final int LIMITE_REMOLQUES_CAMION = 3;

    public int puntosdeSeguridad();
    public void agregar();
    public void sacar();
}
