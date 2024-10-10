public class Carta {
    private int valor;
    private String palo;

    public Carta (int valor, String palo) throws CartaIncorrecta{
        if (valor < 1 || valor > 13){
            throw new CartaIncorrecta("El valor de la carta debe estar entre 1 y 13");
        }
        this.valor = valor;
        this.palo = palo;
    }

    @Override
    public String toString() {
        String v;
        switch (valor) {
            case 13:
                v = "K";
                break;
            case 12:
                v = "Q";
                break;
            case 11:
                v = "J";
                break;
            case 1:
                v = "As";
                break;
            default:
                v = String.valueOf(valor);
                break;
        }
        return v + " " + palo;
    }

    
}


