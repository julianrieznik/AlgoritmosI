package interfaces.estadistica;

public interface EstadisticaSumable<T extends Number> extends  Estadistica<T> {
    public T suma();
    public Double promedio();
}
