import java.util.Map;
import java.util.HashMap;

public class MapaDinamico<K, V> implements Mapa<K, V>{
    Map<K,V> mapa = new HashMap<>();

    @Override
    public void agregar(K clave, V valor) {
        mapa.put(clave, valor);
    }

    @Override
    public V obtener(K clave) {
        return mapa.get(clave);
    }

    @Override
    public boolean contieneClave(K clave) {
         return mapa.containsKey(clave);
    }

    @Override
    public boolean contieneValor(V valor) {
       return mapa.containsValue(valor);
    }

    @Override
    public int largo() {
        return mapa.size();
    }

    @Override
    public V remover(K clave) {
       return mapa.remove(clave);
    }
    
}
