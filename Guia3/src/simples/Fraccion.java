package simples;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(){
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion(int num, int den){
        if (den == 0){
            throw new IllegalArgumentException("El denominador no puede ser cero");  
        }
        this.numerador = num;
        this.denominador = den;
    }
    
    public int getNumerador() {
        return numerador;
    }
    public int getDenominador() {
        return denominador;
    }

    public static Fraccion sumaFraccion(Fraccion f1, Fraccion f2){
        int den = f1.getDenominador() * f2.getDenominador();
        int num = f1.getNumerador() * f2.getDenominador() + f2.getNumerador() * f1.getDenominador();
        Fraccion f3 = new Fraccion(num, den);
        return f3;
    }

    public static Fraccion restaFraccion(Fraccion f1, Fraccion f2){
        int den = f1.getDenominador() * f2.getDenominador();
        int num = f1.getNumerador() * f2.getDenominador() - f2.getNumerador() * f1.getDenominador();
        Fraccion f3 = new Fraccion(num, den);
        return f3;
    }

    public static Fraccion multiplicacionFraccion(Fraccion f1, Fraccion f2){
        int den = f1.getDenominador() * f2.getDenominador();
        int num = f1.getNumerador() * f2.getNumerador();
        Fraccion f3 = new Fraccion(num, den);
        return f3;
    }

    public static Fraccion divisionFraccion(Fraccion f1, Fraccion f2){
        if (f2.getNumerador() == 0){
            throw new ArithmeticException("Fraccion 2 vale 0");
        }
        int den = f1.getDenominador() * f2.getNumerador();
        int num = f1.getNumerador() * f2.getDenominador();
        Fraccion f3 = new Fraccion(num, den);
        return f3;
    }

    @Override
    public String toString() {
        String num = String.valueOf(numerador);
        String den = String.valueOf(denominador);
        return num + "\n" + "-" + "\n" + den;
    }

    public static void main(String[] args) {
        Fraccion tercio = new Fraccion(1, 3);
        Fraccion medio = new Fraccion(1, 2);
        
        Fraccion resultadoSuma = sumaFraccion(tercio, medio);
        System.out.println("Suma: " + "\n" + resultadoSuma);

        Fraccion resultadoResta = restaFraccion(tercio, medio);
        System.out.println("Resta: " + "\n" + resultadoResta);

        Fraccion resultadoMultiplicacion = multiplicacionFraccion(tercio, medio);
        System.out.println("Multiplicación: " + "\n" + resultadoMultiplicacion);

        Fraccion resultadoDivision = divisionFraccion(tercio, medio);
        System.out.println("División: " + "\n" + resultadoDivision);

    }
}