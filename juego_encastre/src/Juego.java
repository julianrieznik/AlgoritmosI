import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Juego {
    List<Hueco> huecos;
    List<Pieza> piezas;

    public Juego(){
        this.huecos = new ArrayList<>();
        this.piezas = new ArrayList<>();
    }


    private int pedirNumero(){
        while (true){
            try{            
                Scanner sc = new Scanner(System.in);
                System.out.println("Cantidad de piezas a generar: ");
                int cantidad = sc.nextInt();
                if (cantidad < 1){System.out.println("Ingrese un numero mayor a 0");}
                else {
                    sc.close();
                    return cantidad;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Ingrese un numero mayor a 0.");
            }
        }
    }
    
    private  void generarPiezas(){
        int cantidad  = pedirNumero();
    
        // Genero cantidad de Huecos y Piezas que coinciden en tamanio
        for (int i = 1; i <= cantidad; i++){
            Random random = new Random();
            int numero1 = random.nextInt(20) + 1;
            int numero2 = random.nextInt(20) + 1;
            int numero3 = random.nextInt(20) + 1;
            
            Hueco hueco = new Hueco(numero1, numero2, numero3);
            Pieza pieza = new Pieza(numero1,numero2, numero3);

            huecos.add(hueco);
            piezas.add(pieza);
        }
        System.out.println("Se generaron " + String.valueOf(cantidad) + " piezas y huecos");
    }

    public void prepararJuego(){
        Collections.shuffle(huecos);
        Collections.shuffle(piezas);
    }

    public int jugar(){
        generarPiezas();
        prepararJuego();
        int contador = 0;
        for(Pieza pieza : piezas){
            for (Iterator<Hueco> iterator = huecos.iterator(); iterator.hasNext(); ) {
                contador++;
                Hueco hueco = iterator.next();
                if (ParteJuego.coinciden(pieza, hueco)) {
                    iterator.remove(); 
                    break;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Juego juego = new Juego();
        String cantidad = String.valueOf(juego.jugar());
        System.out.println("Se necesitaron " + cantidad + " intentos para resolver el juego");
    }
}


