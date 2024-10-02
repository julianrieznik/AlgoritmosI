package simples;

public class Hora {
    int hora;
    int mins;
    int segs;

 public Hora(){
    this.hora = 00;
    this.mins = 00;
    this.segs = 00;
 }   

 public Hora(int hora, int mins, int segs){
    this.hora = hora;
    this.mins = mins;
    this.segs = segs;
    formatearHora();
 }

 public String toString(){
   return String.format("%02d:%02d:%02d", hora, mins, segs);
 }

 public static Hora sumaHoras(Hora h1, Hora h2){
   int segundos = h1.segs + h2.segs;
   int minutos = h1.mins + h2.mins;
   int horas = h1.hora + h2.hora;
   if (segundos >= 60){
      segundos -= 60;
      minutos += 1;
   }
   if (minutos >= 60){
      minutos -= 60;
      horas += 1;
   }
   if (horas >= 24){
      horas -= 24;
   }
   Hora horaNueva = new Hora(horas,minutos,segundos);
   return horaNueva;
 }

 private void formatearHora() {
   if (segs >= 60) {
       mins += segs / 60;
       segs = segs % 60;
   }
   if (mins >= 60) {
       hora += mins / 60;
       mins = mins % 60;
   }
   if (hora >= 24) {
       hora = hora % 24;
   }
 }
 public static void main(String[] args) {
   Hora hora1 = new Hora(21,23,46);
   Hora hora2 = new Hora(3,10,17);
   Hora sumadas = new Hora();
   sumadas = Hora.sumaHoras(hora1, hora2);
   System.out.println(sumadas.toString());
 }
}
