import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Libro {
    private String titulo;
    private Map<String, List<Pagina>> capitulos;
    private int paginas;

    public Libro(String t){
        this.titulo = t;
        this.capitulos = new LinkedHashMap<>();
        this.paginas = 0;

    }

    public Libro(String t, Map<String, List<Pagina>> capitulos){
        this.titulo = t;
        this.capitulos = capitulos;
    }

    public List<String> nombreCapitulos(){
        List<String> nombreCaps = new ArrayList<>(capitulos.keySet());
        return nombreCaps; 
    }

    public int cantidadPaginas(){
        return paginas;
    }

    public int cantidadPaginasCapitulo(String titulo){
        int cantidad = capitulos.get(titulo).size();
        return cantidad;
    }

    public void agregarCapitulo(Capitulo capitulo) {
        String tituloCap = capitulo.getTitulo();
        List<Pagina> paginasCap = capitulo.getPaginas();
        
        int paginaInicial = this.paginas + 1; 
        int numeroPagina = paginaInicial;


            for (Pagina pagina : paginasCap) {
                pagina.setNumeroPagina(numeroPagina);
                numeroPagina++;
            }
    
 
            paginas += capitulo.cantidadPaginas();
    

            capitulos.put(tituloCap, paginasCap);
        }
    
        public int paginaInicialCap(String titulo){
            List<Pagina> paginas = capitulos.get(titulo);
            int paginaInicial = paginas.get(0).getNumeroPagina();
            return paginaInicial;
        }

        public int paginaFinalCap(String titulo){
            List<Pagina> paginas = capitulos.get(titulo);
            int idx = paginas.size() - 1;
            int paginaFinal = paginas.get(idx).getNumeroPagina();
            return paginaFinal;
        }

        
        public int cantidadLetras() {
            int contador = 0;
        
            for (List<Pagina> pags : capitulos.values()) {
                for (Pagina pag : pags) {
                    contador += pag.getTexto().length(); 
                }
            }
        
            return contador; 
        }

        public void agregarReferenciaAPagina(int numeroPagina, String textoReferencia) {
            for (List<Pagina> paginas : capitulos.values()) {
                for (Pagina pag : paginas) {
                    if (pag.getNumeroPagina() == numeroPagina) {
                        pag.setReferencia(textoReferencia); 
                        return; 
                    }
                }
            }
        }
        
    }


