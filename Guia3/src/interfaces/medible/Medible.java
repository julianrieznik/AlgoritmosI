package interfaces.medible;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public interface Medible {
    abstract float obtenerMedida();
    abstract void incrementar(float i);
    abstract boolean decrementar(float i);
    abstract void imprimirMedida();

    public static void main(String[] args) {
        List<Medible> lista = new ArrayList<>();
        lista.add(new Termometro(-272));
        lista.add(new CuentaCorriente());
        lista.add(new MedidorDePresion());
        Random random = new Random();

        for (int i = 0; i < 100; i++){
            for (Medible elemento : lista){
                float incremento = random.nextFloat() * 120;
                float decremento = random.nextFloat() * 110;
                elemento.incrementar(incremento);
                elemento.decrementar(decremento);
                // elemento.decrementar(decremento); para probar q no puede haber dos decrementos seguidos
                if (i % 10 == 0){
                    elemento.imprimirMedida();
                }
            }
        }
    }
}
