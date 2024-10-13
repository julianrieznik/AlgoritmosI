import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MazoPoker {
    private List<Carta> mazo;
    private List<String> ordenPalos;

    private void crearMazo() throws CartaIncorrecta {
        List<String> palos = new ArrayList<>(Arrays.asList("Corazones", "Diamantes", "Tréboles", "Picas"));
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
        ordenPalos = new ArrayList<>();
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

    public void sacarCartasTop(int x){
        for (int i = 0; i < x; i++){
            int idx = 0;
            System.out.println("Se repartio de top: " + mazo.get(idx));
            mazo.removeFirst();
        }
    }

    public void sacarCartasBottom(int x){
        for (int i = 0; i < x; i++){
            int idx = mazo.size() - 1;
            System.out.println("Se repartio de top: " + mazo.get(idx));
            mazo.removeLast();
        }
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
        Collections.sort(mazo);
    }
     

    public static void main(String[] args) throws CartaIncorrecta {
        MazoPoker m = new MazoPoker();
        m.barajar();
        m.verMazo();
        m.ordenar();
        m.verMazo();

    }


}
