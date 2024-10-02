
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiantes {
    List<Estudiante> lista_estudiantes;

    public RegistroEstudiantes(){
        this.lista_estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante() throws NombreInvalidoException, EdadInvalidaException, PromedioInvalidoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese edad: ");
        String e = sc.nextLine();
        Integer edad = Integer.valueOf(e);
        System.out.println("Ingrese promedio: ");
        String p = sc.nextLine();
        Double promedio = Double.valueOf(p);
    
        
        Estudiante est = new Estudiante(nombre, edad, promedio);
        lista_estudiantes.add(est);
        System.out.println(est.toString() + " agregado");
    }

    public static void main(String[] args) {
        RegistroEstudiantes estudiantes = new RegistroEstudiantes();
        
        try {
            estudiantes.agregarEstudiante();
        } catch (NombreInvalidoException e) {
            System.out.println("Error en el nombre: " + e.getMessage());
        } catch (EdadInvalidaException e) {
            System.out.println("Error en la edad: " + e.getMessage());
        } catch (PromedioInvalidoException e) {
            System.out.println("Error en el promedio: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage() + ". Edad y promedio deben ser numeros");
        } 
    }
}

