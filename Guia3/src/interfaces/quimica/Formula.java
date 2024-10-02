package interfaces.quimica;

import java.util.ArrayList;
import java.util.List;


public class Formula {
    List<Elemento> elementos;


    public Formula(Elemento... elementos) {
        this.elementos = new ArrayList<>();
        for (Elemento elemento : elementos) {
            this.elementos.add(elemento);   
        }
        this.elementos.sort(null);
    }

    @Override
    public String toString() {
        String res = "";
        for (Elemento e : elementos){
            res += (e.nombre + " ");
        }
        return res;
    }

    public static void main(String[] args) {
        Elemento elemento1 = new Elemento("H");
        Elemento elemento2 = new Elemento("K"); 
        Elemento elemento3 = new Elemento("A"); 
        Elemento elemento4 = new Elemento("A"); 
        Elemento elemento5 = new Elemento("B"); 
        Formula formula = new Formula(elemento1, elemento2, elemento3, elemento4, elemento5);
        System.out.println(formula.toString());
    }
}