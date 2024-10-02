
import java.util.Arrays;
public class Guia2 {

    // EJERCICIO 4 
    public static double maximo(Integer[] array) {
        double max = -10000000;
        for (int i : array){
            if (i > max){
                max = i;
            }

        } return max;
        
    }
    public static double minimo(Integer[] array) {
        double min = 10000000;
        for (int i : array){
            if (i < min){
                min = i;
            }

        } return min;
     
    }
    //EJERCICIO 6
    public static Integer[]  invertir(Integer[] array){
        Integer[] invertida = new Integer[array.length];
        int contador = 0;
        for (int i = array.length-1; i >= 0; i--){
            invertida[contador] = array[i];
            contador++;
        } return invertida;

    }

    // EJERCICIO 8
    public static Integer[] elementos_medio(Integer[] array){
        if (array.length % 2 == 0){
            Integer[] nums =  new Integer[2];
            int medio = array.length/2;
            nums[0] = array[medio-1];
            nums[1] = array[medio];
            return nums;

        } else {
            Integer[] nums =  new Integer[1];
            int medio = array.length/2;
            nums[0] = array[medio];
            return nums;
        } 

    }
    //EJERCICIO 9 
    public static boolean sonIguales(Integer[] arr1, Integer[] arr2){
        if (arr1.length != arr2.length){
            return false;
        } else {
            for (int i = 0; i < arr1.length; i++){
                if (!arr1[i].equals(arr2[i])){
                    return false;
                } else {
                    if (i == arr1.length -1){
                        return true;
                    }  
                }
            } return false;
        }
    }
    //EJERCICIO 11
    public static void reemplazar(Integer[] arr1, Integer[]arr2){
        Integer[] temporal = arr1;
        arr1 = arr2;
        arr2 = temporal;
    }



    public static void main(String[] args) {
        Integer[] lista1 = {99,98,88,76,545,67,6,8,9,22};
        Integer[] lista2 = {1,28,848,766,545,677,6,8,9,22};
        // double max = Guia2.maximo(lista1);
        // double min = Guia2.minimo(lista1);
        // System.out.println("Min de " + Arrays.toString(lista1) +": " +  min);
        // System.out.println("Max de " + Arrays.toString(lista1) +": " + max);
        // Integer[] invertida = Guia2.invertir(lista1);
        // System.out.println("Lista invertida: " + Arrays.toString(invertida));
        // Integer[] nums = Guia2.elementos_medio(lista1);
        // System.out.println("Medio: " + Arrays.toString(nums));
        boolean resultado = sonIguales(lista1, lista2);
        System.out.println(resultado);
        System.out.println(Arrays.toString(lista1));
        reemplazar(lista1, lista2);
        System.out.println(Arrays.toString(lista1));
    }
}

