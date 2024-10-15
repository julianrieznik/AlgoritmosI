import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MazoPoker {
    private List<Carta> mazo;
    private List<String> ordenPalos;

    private void crearMazo() throws CartaIncorrecta {
        List<String> palos = new ArrayList<>(Arrays.asList("Corazones", "Diamantes", "Treboles", "Picas"));
        mazo = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            for (String palo : palos) {
                Carta carta = new Carta(i, palo);
                mazo.add(carta);
            }
        }
    }

    public MazoPoker() throws CartaIncorrecta{
        crearMazo();
        this.ordenPalos = new ArrayList<>(Arrays.asList("Treboles", "Corazones", "Picas", "Diamantes"));
        }
    

    public MazoPoker(ArrayList<String> orden) throws CartaIncorrecta{
        crearMazo();    
        this.ordenPalos = orden;
    }

    public void barajar(){
        Collections.shuffle(mazo);
    }

    public void verMazo() {
        int contador = 0;
        for (Carta carta : mazo) {
            System.out.print(carta + " - "); 
            contador++;
    
            if (contador % 13 == 0) {
                System.out.println();
            }
        }
    
        if (contador % 13 != 0) {
            System.out.println();
        }
        System.out.println();
    }

    public List<Carta> sacarCartasTop(int x){
        List<Carta> cartas = new ArrayList<>();
        for (int i = 0; i < x; i++){
            int idx = 0;
            Carta carta = mazo.get(idx);
            cartas.add(carta);
            System.out.println("Se repartio de top: " + mazo.get(idx));
            mazo.removeFirst();
        }
        return cartas;
    }

    public List<Carta> sacarCartasBottom(int x){
        List<Carta> cartas = new ArrayList<>();
        for (int i = 0; i < x; i++){
            int idx = mazo.size() - 1;
            Carta carta = mazo.get(idx);
            cartas.add(carta);
            System.out.println("Se repartio de Bottom: " + mazo.get(idx));
            mazo.removeLast();
        }
        return cartas;
    }

    public void colocarCartasTop(List<Carta> cartas) {

        for (int i = 0; i < cartas.size(); i++) {
            mazo.add(0, cartas.get(i));
        }
    }
    
    public void colocarCartasBottom(List<Carta> cartas) {
        mazo.addAll(cartas); 
    }

    public void ordenar() {
        Collections.sort(mazo, (carta1, carta2) -> {
            // Compara los palos según el orden en 'ordenPalos'
            int indicePalo1 = ordenPalos.indexOf(carta1.getPalo());
            int indicePalo2 = ordenPalos.indexOf(carta2.getPalo());
    
            if (indicePalo1 != indicePalo2) {
                // Si los palos son diferentes, los compara por el índice en ordenPalos
                return Integer.compare(indicePalo1, indicePalo2);
            } else {
                // Si los palos son iguales, compara los valores de las cartas
                return Integer.compare(carta1.getValor(), carta2.getValor());
            }
        });
    }
     

    public static void main(String[] args) throws CartaIncorrecta {
        MazoPoker m = new MazoPoker();
        m.barajar();
        m.verMazo();
        m.ordenar();
        m.verMazo();

    }
}
