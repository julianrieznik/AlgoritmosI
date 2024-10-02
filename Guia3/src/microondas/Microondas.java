package microondas;

public class Microondas {
    private boolean puerta;
    private Comida comida;

    public Microondas(){
        this.puerta = false;
        this.comida = null;
    }

    public Microondas(boolean puerta, Comida comida){
        this.puerta = puerta;
        this.comida = comida;
    }

    public void abrirPuerta(){
        puerta = true;
    }

    public void cerrarPuerta(){
        puerta = false;
    }

    public void insertarComida(Comida contenido){
        if (puerta && comida == null){
            this.comida = contenido;
        }
        else {System.out.println("No se pudo insertar " + contenido + " puerta abierta o ya hay contenido");}
    }

    public void retirarComida(){
        if (puerta && comida != null){
            this.comida = null;
        }
        else {System.out.println("No se puede retirar comida, no hay comida o puerta cerrada");}
    }

    public void iniciarCoccion(double intensidad, double tiempo){
        if(!puerta && comida != null){
            double coccion = tiempo*intensidad;
            comida.cocinar(coccion);
        }
    }

    public String verContenido() {
        String estadoPuerta;
        String estadoComida;

        if (puerta){estadoPuerta = "Abierta";}
        else {estadoPuerta = "Cerrada";}

        if (comida != null){estadoComida = comida.toString();}
        else{estadoComida = "Sin comida";}
        
        return "Puerta: " + estadoPuerta + " - Comida: " + estadoComida;
    }

    public static void main(String[] args) {
        Comida c = new Comida("Carne");
        Microondas m = new Microondas();    
        System.out.println(m.verContenido());
        m.abrirPuerta();
        m.insertarComida(c);
        m.cerrarPuerta();
        System.out.println(m.verContenido());
        m.iniciarCoccion(2, 4);
        System.out.println(m.verContenido());
        m.abrirPuerta();
        m.retirarComida();
        System.out.println(m.verContenido());
    }
}
