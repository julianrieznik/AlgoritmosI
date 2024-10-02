package simples;

public class Punto {
    private float x;
    private float y;

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public static Punto sumarPuntos(Punto p1, Punto p2){
       float a = p1.getX() + p2.getX();
        float b = p1.getY() + p2.getY();
        return new Punto(a,b);
    }
    public static boolean sonIguales(Punto p1, Punto p2){
    return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
    }

    public String coordenadas(){
        return "(" + String.valueOf(x) + "," + String.valueOf(y) + ")";
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(3, 2);
        Punto p2 = new Punto(3,2);
        Punto p3 = sumarPuntos(p1, p2);

        System.out.println("Punto p3: " + p3.coordenadas());
        System.out.println(Punto.sonIguales(p1,p2));
        System.out.println(Punto.sonIguales(p1,p3));
    }
}