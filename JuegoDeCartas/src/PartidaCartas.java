
import java.util.List;

public class PartidaCartas {
    private MazoPoker mazo;

    public PartidaCartas() {
        try {
            this.mazo = new MazoPoker();
        } catch (CartaIncorrecta ex) {
            System.out.println("Error" + ex.getMessage());
        }
    }

    public void juegoA(){
        mazo.barajar();
        List<Carta> cartas1 = mazo.sacarCartasTop(5);
        List<Carta> cartas2 = mazo.sacarCartasTop(5);

        int jugador1 = sumaPuntosJuegoA(cartas1);
        int jugador2 = sumaPuntosJuegoA(cartas2);



        if(jugador1 > jugador2) System.out.println("Gana jugador 1 con " + String.valueOf(jugador1) + " puntos");
        if(jugador2 > jugador1) System.out.println("Gana jugador 2 con " + String.valueOf(jugador2) + " puntos");
        if(jugador1 == jugador2) System.out.println("Empate en " + String.valueOf(jugador1) + " puntos");
    }

    private int sumaPuntosJuegoA(List<Carta> cartas){
        int puntos = 0;
        for(Carta carta : cartas){
            puntos += carta.getValor();
        }
        return puntos;
    }

    public static void main(String[] args) {
        PartidaCartas partida = new PartidaCartas();
        partida.juegoA();
    }
}
