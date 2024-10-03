import java.util.List;

public class busquedaBinariaGenerica {

    public static <T extends Comparable<T>> int busquedaLineal(List<T> arreglo, T elemento){
        int inicio = 0;
        int fin = arreglo.size() - 1;

        while(inicio <= fin){
            int medio = inicio + (fin - inicio) / 2;

            if(arreglo.get(medio).compareTo(elemento) == 0){
                return medio;
            }
            else if (arreglo.get(medio).compareTo(elemento) < 0) {
                inicio = medio + 1;
            }
            else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
