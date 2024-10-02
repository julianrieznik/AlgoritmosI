
public class Contenedor<T> {
    T contenido;
    boolean estaVacio;

    public Contenedor(){
        this.estaVacio = true;
    }

    void agregar(T e){
        if (estaVacio){
            this.contenido = e;
            estaVacio = false;
        }
        else {System.out.println("El contenedor ya contiene un elemento");}
    }

    void quitar(){
        if (!estaVacio){
            estaVacio = true;
            System.out.println("Elemento quitado");
        }
    }

    void ver(){
        if (!estaVacio) {
            System.out.print("Elemento: ");
            System.out.println(contenido);
        } else {
            System.out.println("El contenedor está vacío.");
        }
    }

    boolean compararContenido(Object comparado){
        return this.contenido.equals(comparado);
    }

    public static void main(String[] args) {
        Contenedor<Integer> contenedor1 = new Contenedor<>();

        contenedor1.agregar(2);
        contenedor1.ver();
        contenedor1.quitar();
        contenedor1.ver();

    }
}
