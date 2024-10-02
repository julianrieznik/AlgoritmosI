package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matriz<E> {
    List<List<E>> matriz;

    public Matriz(){
        this.matriz = new ArrayList<>();
    }

    public Matriz(E[][] matriz) {
        this.matriz = new ArrayList<>();
    

        int columnas = matriz[0].length;
    

        for (int i = 0; i < columnas; i++) {
            this.matriz.add(new ArrayList<>());
        }
    
  
        for (E[] fila : matriz) {
            for (int i = 0; i < fila.length; i++) {
                this.matriz.get(i).add(fila[i]); 
            }
        }
    }
}
