public class busquedaLinealGenerica {

    public static <T> int busquedaLineal(T[] arreglo, T elemento){
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] != null && arreglo[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        int posicion = busquedaLineal(numeros, 3);
        System.out.println("Posición de 3: " + posicion);

        // Ejemplo con String
        String[] palabras = {"hola", "mundo", "java", "genéricos"};
        posicion = busquedaLineal(palabras, "java");
        System.out.println("Posición de 'java': " + posicion); 
    }
}
