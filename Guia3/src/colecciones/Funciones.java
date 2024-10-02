package colecciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import generics.Par;

public class Funciones {
    
    public static Integer[] multiplos(Integer x, Integer y){
        Integer[] multiplos = new Integer[y];

        for (int i = 1; i <= y; i++){
            multiplos[i-1] = x*i;
        }

        return multiplos;
    }

    public static String reversa(String cadena) {
        StringBuilder reversa = new StringBuilder();
        
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            char caracter = cadena.charAt(i);
            reversa.append(caracter); 
        }
        
        
        return reversa.toString();
    }

    public static Integer[] maxMin(String numeros){
        String[] nums = numeros.split(" ");
        Integer min = Integer.valueOf(nums[0]);
        Integer max = Integer.valueOf(nums[0]);
        for (String s : nums){
            try {
                Integer a = Integer.valueOf(s);
                if (a < min) {min = a;}
                if (a > max) {max = a;}
            } catch (NumberFormatException e) {
                System.out.println(s + " no es un numero. Se ignora");
            }
        }
        Integer[] resultado = {min, max};
        return resultado;
    }

    public static <T> Set<T> unicos(Collection<T> coleccion){
        Set<T> unicos = new HashSet<>();

        for (T elemento : coleccion){
            unicos.add(elemento);
        }

        return unicos;
    }

    public static <T> Integer cantidadUnicos(Collection<T> coleccion){
        Set<T> unicos = unicos(coleccion);
        return unicos.size();
    }

    public static <T extends Number> Par<Double, Double> cuentaSuma(Collection<T> coleccion){
        Double positivos = 0.0;
        Double sumaNegativos = 0.0;
        for (T num : coleccion){
            Double numero = num.doubleValue();
            if(numero > 0){
                positivos += 1.0;
            }
            else {
                sumaNegativos += numero;
            }
        }
        Par<Double, Double> resultados = new Par<>(positivos, sumaNegativos);
        return resultados;
    }
    public static void main(String[] args) {
        Integer[] multiplos = Funciones.multiplos(14, 6);
        //for (Integer i : multiplos){
          //  System.out.println(i);
        //}

        System.out.println(Funciones.reversa("Hola que tal capo. Soy Julian"));
    

    Integer[] maxmin = Funciones.maxMin("13 44 20 f f1 122 11");
    for (Integer a : maxmin){
        System.out.println(String.valueOf(a));
        }

    Par<Double, Double> sumaCuenta = cuentaSuma(new HashSet<>(Set.of(1, -2, 3, -4.5, 6)));
    System.out.println(sumaCuenta.toString());
    
    }

}
