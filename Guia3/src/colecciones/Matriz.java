package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matriz<E> {
    List<List<E>> matriz;

    public Matriz(){
        this.matriz = new ArrayList<>();
    }

    public Matriz(E[][] arreglo) {
        this.matriz = new ArrayList<>();
    

        int columnas = arreglo[0].length;
    

        for (int i = 0; i < columnas; i++) {
            this.matriz.add(new ArrayList<>());
        }
    
  
        for (E[] lista : arreglo) {
            List<E> fila = new ArrayList<>();
            for (E elemento : lista){
                fila.add(elemento);
            }
            agregarFila(fila);
            }
        }

    final public void agregarFila(List<E> fila) {
        if (fila.size() != cantidadColumnas() && cantidadColumnas() != 0) {
            String tamano_fila = String.valueOf(fila.size());
            String cols = String.valueOf(cantidadColumnas());
            throw new IllegalArgumentException("El tamaño de la fila (" + tamano_fila+ ") no corresponde al tamaño de la matriz (" + cols + ").");
        }
        
        this.matriz.add(fila);
        }

        public void agregarColumna(List<E> columna){
            if (columna.size() != cantidadFilas() && cantidadColumnas() != 0) {
                String tamano_col = String.valueOf(columna.size());
                String filas = String.valueOf(cantidadFilas());
                throw new IllegalArgumentException("El tamaño de la columna (" + tamano_col+ ") no corresponde al tamaño de la matriz (" + filas + ").");
            }
            int fila = 0;
            for (int i = 0; i < columna.size(); i++){
                matriz.get(fila).add(columna.get(i));
                fila++;
            }
        }

    public Integer cantidadColumnas(){
        if (estaVacia()){
            return 0;
        }
        return matriz.get(0).size();
    }

    public Integer cantidadFilas(){
        return matriz.size();
    }
    public boolean estaVacia(){
        return matriz.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (List<E> fila : matriz) {
            sb.append("[");
            for (int i = 0; i < fila.size(); i++) {
                sb.append(fila.get(i));
                if (i < fila.size() - 1) {
                    sb.append(", "); 
                }
            }
            sb.append("]\n"); 
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>();

        ArrayList<Integer> f1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> f2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        ArrayList<Integer> f3 = new ArrayList<>(Arrays.asList(9, 10, 11));
        ArrayList<Integer> col = new ArrayList<>(Arrays.asList(9, 10));

        matriz.agregarFila(f1);
        matriz.agregarFila(f2);
        matriz.agregarColumna(col);
        System.out.println(matriz);
        matriz.agregarFila(f3);
        

    }
}
