package generics;

import java.util.ArrayList;
import java.util.List;

public class Pila<E> {
    List<E> elementos = new ArrayList<>(); 

    public void push(E elemento){
        elementos.add(elemento);
    }

    public E pop(){
        int idx = elementos.size() - 1;
        E elem = elementos.get(idx);
        elementos.removeLast();
        return elem;
    }

    
}
