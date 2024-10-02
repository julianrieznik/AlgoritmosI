package interfaces.medible;

public class MedidorDePresion implements Medible{
    float presion;
    int contadorIncrementos;
    boolean ultimofueIncremento;
    
    public MedidorDePresion(){
        this.presion = 0;
        this.contadorIncrementos = 0;
        ultimofueIncremento = false;
    }

    @Override
    public float obtenerMedida() {
        return presion;
    }

    @Override
    public void incrementar(float i) {
        presion += i;
        contadorIncrementos++;
        if (!ultimofueIncremento){
            ultimofueIncremento = true;
        }
    }

    @Override
    public boolean decrementar(float d) {
        boolean error = false;
        if (!ultimofueIncremento){
            error = true;
            System.out.println("No puede haber dos decrementos seguidos");
        }
        else {
            presion -= (d/contadorIncrementos);
            ultimofueIncremento = false;
            contadorIncrementos = 0;
        }
        return error;
    }

    @Override
    public void imprimirMedida() {
        String m = String.valueOf(obtenerMedida());
        System.out.println(m + " presion");
    }
}
