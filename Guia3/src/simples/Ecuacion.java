package simples;

public class Ecuacion {
    float a;
    float b;
    float c;
    
    public Ecuacion(float a, float b, float c){
        if (a == 0){
            throw new IllegalArgumentException("a debe ser distinto de 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Object raices_reales(){
        Double discriminante = (Math.pow(b, 2) - 4*a*c);

        if (discriminante > 0){
        Double raiz1 = (-b + Math.sqrt(discriminante))/(2*a);
        Double raiz2 = (-b - Math.sqrt(discriminante))/(2*a);
        return new Double[]{raiz1, raiz2};
        }
        if (discriminante == 0){
            double raiz1 = -b / (2 * a);
            return new Double[]{raiz1};
            }
            return "No hay raices reales en la ecuacion " + this.toString();

    }

    @Override
    public String toString() {
        return String.valueOf(a) + "x²" + " + "+  String.valueOf(b) + "x" + " + " + String.valueOf(c);
    }

    public static void main(String[] args) {
        Ecuacion ecu1 = new Ecuacion(3, 2, 4);
        System.out.println(ecu1.toString());
        String raices1 = (String) ecu1.raices_reales();
        System.out.println(raices1);

        Ecuacion ecu2 = new Ecuacion(2, 0, 0);
        System.out.println(ecu2.toString());
        Double[] raices2 = (Double[]) ecu2.raices_reales();
        System.out.println("Raices: " + raices2[0]);

        Ecuacion ecu3 = new Ecuacion(2, -4, 0);
        System.out.println(ecu3.toString());
        Double[] raices3 = (Double[]) ecu3.raices_reales();
        System.out.println("Raices: " + raices3[0] + "," + raices3[1]);

        
    }
}
