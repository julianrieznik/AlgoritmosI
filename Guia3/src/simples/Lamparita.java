package simples;

public class Lamparita {
    boolean encendida = false;
    public Lamparita(){

    }
    public void encender(){
        encendida = true;
    }
    public void apagar(){
        encendida = false;
    }
    public String toString(){
        if (encendida){
            return "Lamparita encendida";
        } else {
            return "Lamparita apagada";
        }

    }
    public static void main(String[] args) {
        Lamparita lamp = new Lamparita();
        System.out.println(lamp.toString());
        lamp.encender();
        System.out.println(lamp.toString());
        lamp.apagar();
        System.out.println(lamp.toString());
    }
    
}
