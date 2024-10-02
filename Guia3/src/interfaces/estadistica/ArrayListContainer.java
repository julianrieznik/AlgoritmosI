package interfaces.estadistica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class ArrayListContainer<T extends Number & Comparable<T>> implements EstadisticaSumable<T> {
    List<T> lista = new ArrayList<>();
    

    @Override
    public T min() {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("La lista está vacía");
        }
        return Collections.min(lista);
    }

    @Override
    public T max() {
        if (lista.isEmpty()) {
            throw new NoSuchElementException("La lista está vacía");
        }
        return Collections.max(lista);
    }

    @Override
    public Integer cantidad() {
        return lista.size();
    }

    @Override
    public T suma() {
        double suma = 0; 
        for (T num : lista) {
            suma += num.doubleValue(); 
        }
        return (T) Double.valueOf(suma);
    }

    @Override
    public Double promedio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'promedio'");
    }

}
