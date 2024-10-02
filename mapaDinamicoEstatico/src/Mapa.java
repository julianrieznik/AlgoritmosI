public interface Mapa<K, V>{

    abstract void agregar(K clave, V valor);
    abstract V obtener(K clave);
    abstract boolean contieneClave(K clave);
    abstract boolean contieneValor(V valor);
    abstract int largo();
    abstract V remover(K clave);
    
}
