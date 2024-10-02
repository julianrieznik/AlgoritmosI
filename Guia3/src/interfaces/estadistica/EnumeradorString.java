package interfaces.estadistica;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EnumeradorString implements Iterator<Character>, Estadistica<Character>{
    String elemento;
    Integer contador;
    public EnumeradorString(String e){
        this.elemento = e;
        this.contador = 0;
    }

    @Override
    public boolean hasNext() {
        return contador < elemento.length();
    }

    @Override
    public Character next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay más caracteres en el String");
        }
        return elemento.charAt(contador++);
    }

    public List<Character> aLista(){
        contador = 0;
        List<Character> lista = new ArrayList<>();
        while (hasNext()){
            lista.add(elemento.charAt(contador++));
        }
        return lista;
    }

    @Override
    public Character min() {
        List<Character> lista = aLista();
        Character min = Collections.min(lista);
        return min;
    }

    @Override
    public Character max() {
        List<Character> lista = aLista();
        Character max = Collections.max(lista);
        return max;
    }

    @Override
    public Integer cantidad() {
        List<Character> lista = aLista();
        Integer cantidad = lista.size();
        return cantidad;
    }

}
