package interfaces.vehiculos;

import java.util.Scanner;

public abstract class VehiculoMotorizado {
    String fabricante;
    String modelo;
    Integer año_fabricacion;
    Double kilometraje;

    @Override
    public String toString() {
        return
        " Fabricante: " + this.fabricante +
        " Modelo: " + this.modelo +
        " Año :" + this.año_fabricacion + 
        " 3KM :" + this.kilometraje;
        }
    

    public VehiculoMotorizado(String fabricante, String modelo, Integer año_fabricacion, Double kilometraje){
        this.fabricante = fabricante;
        this.modelo =  modelo;
        this.año_fabricacion = año_fabricacion;
        this.kilometraje =  kilometraje;


    }

    public static void main(String[] args) {
        VehiculoMotorizado vehiculo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una opción:");
        System.out.println("1 - moto");
        System.out.println("2 - camion");
        System.out.println("3 - auto");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                vehiculo = (Motocicleta) new Motocicleta("Suzuki", "GN 125F", 2019, 433.2, "Privado");
                System.out.println(((Motocicleta)vehiculo).toString());
                break;
        
            case 2:
                vehiculo = (Camion) new Camion("GAT", "Trucks", 2012, 77685.4, 4);
                System.out.println(((Camion)vehiculo).toString());
                ((Camion)vehiculo).agregar();
                System.out.println(((Camion)vehiculo).toString());
                break;

            case 3:
                vehiculo = new Automovil("Toyota", "Corolla", 2019, 93931.3, "Cuatro puertas", 3);
                System.out.println(((Automovil)vehiculo).toString());
                ((Automovil)vehiculo).agregar();
                System.out.println(((Automovil)vehiculo).toString());
                break;

            default:
                System.out.println("Opción no válida");
                vehiculo = null;
                break;
        }
    }

}
