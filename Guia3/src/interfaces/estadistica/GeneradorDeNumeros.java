package interfaces.estadistica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GeneradorDeNumeros implements Iterator<Integer>, EstadisticaSumable<Integer>{
    Integer inicial;
    Integer fin;
    Integer paso;
    Integer current;
    
    public GeneradorDeNumeros(Integer inicial, Integer fin, Integer paso) {
        this.inicial = inicial;
        this.fin = fin;
        this.paso = paso;
        this.current = inicial;

    }
    @Override
    public boolean hasNext() {
    return current <= fin;
    }

    @Override
    public Integer next() {
        int temp = current;
        current += paso;
        return temp;
    }

    public List<Integer> aLista(){
        current = inicial;
        List<Integer> lista = new ArrayList<>();
        while(hasNext()){
            lista.add(next());
            current += paso;
        }
        return lista;
    }

    @Override
    public Integer min() {
        List<Integer> lista = aLista();
        Integer num = Collections.min(lista);
        return num;
    }
    @Override
    public Integer max() {
        List<Integer> lista = aLista();
        Integer num = Collections.max(lista);
        return num;
    }
    @Override
    public Integer cantidad() {
        List<Integer> lista = aLista();
        return lista.size();
    }

    @Override
    public Integer suma() {
        List<Integer> lista = aLista();
        Integer suma = 0;
        for (Integer num : lista){
            suma += num;
            }
        return suma;
    }


    @Override
    public Double promedio() {
        double suma = suma();
        double cant = cantidad();
        Double prom = suma/cant;
        return prom;
    }

    public static void main(String[] args) {
        GeneradorDeNumeros a = new GeneradorDeNumeros(3, 22, 3);
        List<Integer> lista = a.aLista();
        for (Integer e : lista){
            System.out.println(e);
        }
        System.out.println("Cantidad de elementos: " + String.valueOf(a.cantidad()));
        System.out.println("Minimo: " + String.valueOf(a.min()));
        System.out.println("Maximo: " + String.valueOf(a.max()));

        EnumeradorString b = new EnumeradorString("RicardoCanAletti");
        List<Character> lista2 = b.aLista();
        for (Character e : lista2){
            System.out.println(e);
        }
        System.out.println("Cantidad de elementos: " + String.valueOf(b.cantidad()));
        System.out.println("Minimo: " + String.valueOf(b.min()));
        System.out.println("Maximo: " + String.valueOf(b.max()));
        
    }
}
