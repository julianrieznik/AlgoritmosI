package interfaces.medible;

public class CuentaCorriente implements Medible{
    float saldo;

    public CuentaCorriente(){
        this.saldo = 0;
    }

    @Override
    public float obtenerMedida() {
        return saldo;
    }

    @Override
    public void incrementar(float i) {
        saldo += i;
    }

    @Override
    public boolean decrementar(float d) {
        boolean error = false;
        float res = saldo - d;
        if (res < 0){
            error = true;
            System.out.println("Saldo no puede ser negativo");
        }
        else {
            saldo -= d;
        }
        return error;
    }

    @Override
    public void imprimirMedida() {
        String m = String.valueOf(obtenerMedida());
        System.out.println(m + " Cuenta Corriente");
    }
}
