import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            // Especifica el nombre del archivo
            String nombreArchivo = "src/miarchivo.txt";
            
            // Crea un OutputStream para escribir en el archivo
            OutputStream outputStream = new FileOutputStream(nombreArchivo);
            
            // Convierte el texto en bytes y escribe en el archivo
            String texto = "Este es el texto que aparece en mi archivo";
            byte[] datos = texto.getBytes();
            outputStream.write(datos);
            
            // Cierra el OutputStream
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}