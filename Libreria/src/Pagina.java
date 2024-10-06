public class Pagina {
    private String texto;

    public String getTexto() {
        return texto;
    }

    private int numeroPagina;

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public Pagina(String contenido, int numero){
        this.texto = contenido;
        this.numeroPagina = numero;
    }
}
