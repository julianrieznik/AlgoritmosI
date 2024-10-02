package colecciones;

import java.util.TreeSet;
import java.util.Set;

public class SucesionEstadistica {
    Set<Double> sucesion;
    Integer inicio;
    Integer fin;

    public SucesionEstadistica(Integer i, Integer f){
        this.sucesion = new TreeSet<>();
        this.inicio = i;
        this.fin = f;
    }

    public SucesionEstadistica(Set<Double> sucesion, Integer i, Integer f){
        this.sucesion = sucesion;
        this.inicio = i;
        this.fin = f;
    }

    public Integer cantidadElementos(){
        return sucesion.size();
    }

    public Double mediaAritmetica(){
        if (sucesion.isEmpty()){
            return 0.0;
        }
        Double suma = 0.0;
        for(Double num : sucesion){
            suma += num;
        }
        Double promedio = suma/cantidadElementos();
        return promedio;     
    }

    public Double varianza() {
        if (sucesion.isEmpty()) {
            return 0.0; 
        }
        
        double media = mediaAritmetica(); 
        double sumaVariaciones = 0.0;
    
        for (Double num : sucesion) {
            sumaVariaciones += Math.pow(num - media, 2);
        }
    
        return sumaVariaciones / cantidadElementos(); 
    }
    
    public Double desviacionEstandar() {
        return Math.sqrt(varianza()); 
    }

}
