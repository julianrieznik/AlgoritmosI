import java.util.List;

public class BubbleSort {

        public <T extends Comparable<T>> void bubbleSort(List<T> arreglo) {
            int n = arreglo.size();
            boolean huboCambio;
            do {
                huboCambio = false;
                for (int i = 1; i < n; i++) {
                    if (arreglo.get(i - 1) != null && arreglo.get(i) != null && arreglo.get(i - 1).compareTo(arreglo.get(i)) > 0) {
                        // Intercambia arreglo[i-1] y arreglo[i]
                        T temp = arreglo.get(i - 1);
                        arreglo.set(i - 1, arreglo.get(i));
                        arreglo.set(i, temp);
                        huboCambio = true;
                    }
                }
                n--;
            } while (huboCambio);
        }
    }
