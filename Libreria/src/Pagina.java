public class Pagina {
    private String texto;
    private String referencia;
    private int numeroPagina;

    public Pagina(String contenido, int numero, String referencia){
        this.texto = contenido;
        this.numeroPagina = numero;
        this.referencia = referencia;
    }

    public Pagina(String contenido, int numero){
        this.texto = contenido;
        this.numeroPagina = numero;
        this.referencia = null;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public String getTexto() {
        return texto;
    }

    public int cantidadLetras(){
        return getTexto().length();
    }

    public String getReferencia() {
        if (this.referencia != null) return referencia;
        else return "Pagina sin referencia";     
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
