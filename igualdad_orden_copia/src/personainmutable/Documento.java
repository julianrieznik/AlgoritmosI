package igualdad_orden_copia.personainmutable;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public final class Documento {
    final private int numero;
    final private LocalDateTime fechaEmision;
    final private LocalDateTime fechaExpiracion;

    public Documento(int numero){
        this.numero = numero;
        this.fechaEmision = LocalDateTime.now();
        this.fechaExpiracion = fechaEmision.plusYears(10);
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    
    public LocalDateTime getFechaExpiracion() {
        return fechaExpiracion;
    }

    @Override
    public String toString() {
        // Formato para dd-MM-yyyy HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        
        // Formatear fechas
        String exp = fechaExpiracion.format(formatter);
        String em = fechaEmision.format(formatter);
        String num = String.valueOf(numero);
        
        return num + " - " + em + " - " + exp;
    }
}
