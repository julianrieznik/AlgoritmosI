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

    public static void main(String[] args) {
        // Crear páginas aleatorias
        Pagina pagina1 = new Pagina("Este es el contenido de la página 1", 1);
        Pagina pagina2 = new Pagina("Este es el contenido de la página 2", 2);
        Pagina pagina3 = new Pagina("Este es el contenido de la página 3", 3);

        // Crear el primer capítulo y agregar páginas
        Capitulo capitulo1 = new Capitulo("Capítulo 1: Introducción");
        capitulo1.agregarPagina(pagina1);
        capitulo1.agregarPagina(pagina2);

        // Crear el segundo capítulo y agregar una página
        Capitulo capitulo2 = new Capitulo("Capítulo 2: Desarrollo");
        capitulo2.agregarPagina(pagina3);

        // Imprimir los títulos de los capítulos y las páginas
        System.out.println("Capítulos creados:");
        System.out.println(capitulo1.getTitulo());
        System.out.println("Páginas del " + capitulo1.getTitulo() + ":");
        for (Pagina pag : capitulo1.getPaginas()) {
            System.out.println("Página " + pag.getNumeroPagina() + ": " + pag.getTexto());
        }

        System.out.println(capitulo2.getTitulo());
        System.out.println("Páginas del " + capitulo2.getTitulo() + ":");
        for (Pagina pag : capitulo2.getPaginas()) {
            System.out.println("Página " + pag.getNumeroPagina() + ": " + pag.getTexto());
        }
    }
}

