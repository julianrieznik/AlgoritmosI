
import java.util.AbstractList;
import java.lang.reflect.Array;

public class ListaGenerica<E> extends AbstractList<E> {
   private E[] elementos;
   int tamano;


    @SuppressWarnings("unchecked")
    public ListaGenerica(Class<E> clase, int capacidadInicial) {
        this.tamano = capacidadInicial;
        this.elementos = (E[]) Array.newInstance(clase, capacidadInicial);
        }

    @Override
    public int size() {
        return this.tamano;
        }

    @Override
    public E get(int index) {
        if (index >= 0 && index < this.tamano){
            return elementos[index];
            }
            throw new IndexOutOfBoundsException("Indice fuera de rango. Tamaño de lista " + String.valueOf(this.tamano));
        }

        @Override
        public void add(int index, E element) {
            if (size() == tamano){
                @SuppressWarnings("unchecked")
                E[] elementosNuevo = (E[]) Array.newInstance(element.getClass(), tamano + 3);
                for (int i = 0; i < elementos.length; i++) {
                    elementosNuevo[i] = elementos[i];
                    this.elementos = elementosNuevo;
                }
            }
            
            this.elementos[index] = element;
            tamano++;
        }

        @Override
        public E remove(int index) {
            if (index >= tamano){
                throw new IndexOutOfBoundsException("Indice fuera de rango. Tamaño de lista " + String.valueOf(this.tamano));
            }
            int i = 0;
            E elementoEncontrado = null;
            boolean encontrado = false;
            while (i < tamano - 1) {
                if (encontrado || elementos[i].equals(elementos[index])) {
                    encontrado = true;
                    elementoEncontrado =  elementos[i];
                    elementos[i] = elementos[i + 1];
                }
                i++;
            }
            if (encontrado || elementos[tamano-1].equals(elementos[index])) {
                elementos[i] = null;
                tamano--;
            }
            return elementoEncontrado;
        }
        public static void main(String[] args) {
            ListaGenerica<Integer> lista = new ListaGenerica<>(Integer.class, 4);
            lista.remove(22);
        }
    }

