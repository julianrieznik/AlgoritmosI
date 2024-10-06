public abstract class ParteJuego{
    protected int ancho;
    protected int largo;

    public ParteJuego(int ancho, int largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public static final boolean coinciden(Pieza pieza, Hueco hueco){
        return  pieza.ancho == hueco.ancho && pieza.largo == hueco.largo && pieza.altura == hueco.profundidad;
    }
}

