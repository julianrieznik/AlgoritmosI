import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LectorCSV {

    public static String[][] leerCSV(String archivo, boolean headers) {
        String[][] matriz = null;
        
        try {
            // Cantidad de filas y columnas
            List<String> lineas = Files.readAllLines(Paths.get(archivo));
            int cantidadfilas = lineas.size();
            int cantidadcolumnas = lineas.get(0).split(",").length;
            // Inicializar la matriz con el número de filas y columnas
            matriz = new String[cantidadfilas][cantidadcolumnas];

            for (int i = 0; i < cantidadfilas; i++){
                String[] row = lineas.get(i).split(",");
                matriz[i] = row;
            }
        } 
        catch (IOException ex) {
            ex.printStackTrace();
            }
            return matriz;
        }

        public static void imprimirCSV(String archivo, int cantidad_lineas) {
            String[][] matriz = leerCSV(archivo, false);
            int contador = 0;
        
            for (String[] linea : matriz) {
                
                if (contador < cantidad_lineas) {
                    System.out.print("Linea " + contador + ": ");
                    
                   
                    for (String valor : linea) {
                        System.out.print(valor + " ");
                    }
                    System.out.println(); 
                    contador++;
                } else {
                    break;
                }
            }
        }


    
     public static void main(String[] args) {
        LectorCSV.imprimirCSV("datasets/titanic.csv", 4);
        LectorCSV.imprimirCSV("datasets/iris.csv", 4);
        
    }
    
}
