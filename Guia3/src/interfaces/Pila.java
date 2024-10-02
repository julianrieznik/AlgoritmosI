package interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Pila {
    public abstract void encolar(int e);
    public abstract int desencolar();
    public boolean esVacia();
}

class ConArrayList implements Pila{
    List<Integer> elementos;


    public ConArrayList(){
        this.elementos = new ArrayList<>();
    }

    @Override
    public void encolar(int e) {
        elementos.add(e);
    }

    @Override
    public int desencolar(){
        boolean vacia = elementos.isEmpty();
        if (!vacia){
            int elemento = elementos.removeLast();
            return elemento;
        } 
        throw new IndexOutOfBoundsException("La pila esta vacia");
    }

    @Override
    public boolean esVacia() {
        return elementos.isEmpty();
    }
}

class ConArreglo implements Pila{
    public int[] elementos;
    public int capacidad;
    public int tope;

    public ConArreglo(int capacidad){
        this.capacidad = capacidad;
        this.elementos = new int[capacidad];
        this.tope = -1;
    }

    @Override
    public void encolar(int e) {
        if (tope == capacidad - 1){
            int nuevaCapacidad = capacidad + 3;
            int[] nuevosElementos = new int[nuevaCapacidad];
            System.arraycopy(elementos, 0, nuevosElementos,0, capacidad);
            this.elementos = nuevosElementos;
            this.capacidad = nuevaCapacidad;
        }
        this.tope++;
        elementos[tope] = e;
    }

    @Override
    public int desencolar() {
        if (tope == -1){
            throw new IndexOutOfBoundsException("La pila esta vacia");
        }
        this.tope--;
        return elementos[tope + 1];
    }

    @Override
    public boolean esVacia() {
        return this.tope == -1;
    }
}

class Prueba {
    public static void main(String[] args) {
        Pila nativa = new ConArreglo(2);
        System.out.println(nativa.esVacia());
        nativa.encolar(3);
        System.out.println(nativa.esVacia());
        nativa.desencolar();
        

        Pila arrayl = new ConArrayList();
        System.out.println(arrayl.esVacia());
        arrayl.encolar(3);
        System.out.println(arrayl.esVacia());
        arrayl.desencolar();
    }
}