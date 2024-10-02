public class MapaEstatico<K, V> implements Mapa<K, V> {
    K[] claves;
    V[] valores;
    int size;
    int top;

    @SuppressWarnings("unchecked")
    public MapaEstatico(int size){
        claves = (K[]) new Object[size];
        valores = (V[]) new Object[size];
        top = 0;
    }
    
    @Override
    public void agregar(K clave, V valor){
        if (top < size){
        claves[top] = clave;
        valores[top] = valor;
        top++;
        }
        else{
            System.out.println("Mapa lleno, elimine un elemento");
        }
    }

    @Override
    public V obtener(K clave) {
        if (!contieneClave(clave)) {
            throw new IllegalArgumentException(clave + " no es una clave valida");
        }
    
        for (int i = 0; i < top; i++) {
            if (claves[i].equals(clave)) {
                return valores[i];
            }
        }
        throw new IllegalArgumentException("Clave sin valor asociado");
    }

    @Override
    public boolean contieneClave(K clave){
        for(int i = 0; i < top; i++){
            if(claves[i].equals(clave)){
                return true;
            }
        }
        return false;
    }   

    @Override
    public boolean contieneValor(V valor){
        for(int i = 0; i < top; i++){
            if(valores[i].equals(valor)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int largo() {
        return top;
    }
    @Override
    public V remover(K clave) {
        throw new UnsupportedOperationException("El método remover no está implementado");
    }
}