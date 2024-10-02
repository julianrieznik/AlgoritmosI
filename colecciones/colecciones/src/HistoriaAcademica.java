
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class HistoriaAcademica {
    Map<Materia, Set<Double>> materias;

    public HistoriaAcademica(){
        this.materias = new HashMap<>();
    }

    public void infoAlumno() {
        if (!materias.isEmpty()) {
            
            for (Map.Entry<Materia, Set<Double>> entrada : materias.entrySet()) {
                String materia = entrada.getKey().getNombre();
                Set<Double> notas = entrada.getValue();

                System.out.println(materia + " notas: " + String.join(" - ", notas.stream().map(String::valueOf).toArray(String[]::new)));
                

            }
        } else {
            System.out.println("No hay materias registradas.");
        }
        
        String materias = String.valueOf(cantidadMaterias());
        System.out.println("Materias: "+ materias);
        String promedio = String.valueOf(promedioCalificaciones());
        System.out.println("Promedio notas: "+ promedio);
        String aplazos = String.valueOf(cantidadAplazos());
        System.out.println("Aplazos: "+ aplazos);
    }

    public void agregarMateria(Materia materia, Set<Double> notas){
        if(!materias.containsKey(materia)){
            materias.put(materia, notas);
        }
    }

    public void agregarCalificacionAMateria(Materia materia, Double calificacion) {
        if (materias.containsKey(materia)) {
            materias.get(materia).add(calificacion);
        } else {
            System.out.println("Materia no está registrada");
        }
    }

    public Double promedioCalificaciones() {
        Double sumaTotal = 0.0;
        int cantidadTotal = 0;
    
        for (Map.Entry<Materia, Set<Double>> entrada : materias.entrySet()) {
            Set<Double> calificaciones = entrada.getValue();
            
            if (!calificaciones.isEmpty()) {
                for (Double nota : calificaciones) {
                    sumaTotal += nota;
                }
                cantidadTotal += calificaciones.size();
            }
        }
    
        if (cantidadTotal == 0) {
            return 0.0;  
        }
    
        return sumaTotal / cantidadTotal;
    }

    public Integer cantidadAplazos(){
        Integer total = 0;
        for (Set<Double> calificaciones : materias.values()) {
            for (Double nota : calificaciones){
                if(nota < 4){
                    total += 1;
                }
            }   
        }
        return total;
    }

    public Integer cantidadMaterias(){
        return materias.size();
    }
}