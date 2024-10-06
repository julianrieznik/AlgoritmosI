import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private List<Capitulo> capitulos;

    public Libro(String t){
        this.titulo = t;
        capitulos = new ArrayList<>();
    }

    public Libro(String t, ArrayList<Capitulo> capitulos){
        this.titulo = t;
        this.capitulos = capitulos;
    }

    public List<String> nombreCapitulos(){
        List<String> nombreCaps = new ArrayList<>();

        for (Capitulo c : capitulos){
            nombreCaps.add(c.getTitulo());
        }
        return nombreCaps;
    }

    public int cantidadPaginas(){
        int total = 0;
        for(Capitulo c : capitulos){
            total += c.cantidadPaginas();
        }
        return total;
    }
}