package interfaces.medible;

public class Termometro implements Medible{
    float temperatura;

    public Termometro(float t){
        if (t < -273){ this.temperatura = -273;}
        else {this.temperatura = t;}
    }
    @Override
    public float obtenerMedida(){
        return temperatura;
    }
    @Override
    public void incrementar(float i) {
        temperatura += i;
    }

    @Override
    public boolean decrementar(float d) {
        boolean error = false;
        float res = temperatura - d;
        if (res < -273){
            error = true;
            System.out.println("La temperatura no puede ser menor a -273");
        }
        else {
            temperatura -= d;
        }
        return error;
    }
    @Override
    public void imprimirMedida() {
        String m = String.valueOf(obtenerMedida());
        System.out.println(m + " Termometro");
    }
}
