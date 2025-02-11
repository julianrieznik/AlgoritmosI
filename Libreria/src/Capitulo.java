import java.util.ArrayList;
import java.util.List;

public class Capitulo {
    private String titulo;
    private List<Pagina> paginas;


    public Capitulo(String t){
        this.titulo = t;
        paginas = new ArrayList<>();
    }

    public Capitulo(String t, ArrayList<Pagina> p){
        this.titulo = t;
        paginas = p;
    }

    public int cantidadPaginas() {
        return paginas.size();
    }

        
    public String getTitulo() {
        return titulo;
    }

    public void agregarPagina(Pagina pag){
        paginas.add(pag);
    }

    public List<Pagina> getPaginas() {
        return paginas;
    }

    public int cantidadLetras(){
        int contador = 0;
        for (Pagina pag : paginas){
            contador += pag.getTexto().length();
        }
         return contador;
    }
}
