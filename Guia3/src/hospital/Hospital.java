package hospital;

public class Hospital {

    public static void main(String[] args) {
        Eventual ev = new Eventual("Jorge", "CABA", "Giribone 653", 1, 6, "Lord 22xS", 7663);
        System.out.println(ev.mostrar());
        
        ev.pagarSalario();
        System.out.println("");
        

        Planta pl = new Planta("Pedri", "Larrosa 66", "La Pampa", 21, 3211.7, "Larand SA", 88901, 2);
        System.out.println(pl.mostrar());
        pl.pagarSalario();
        System.out.println("");
        
        
        Paciente pac = new Paciente("Julian", "Caseros 2321", "BsAs", 7, "1132022121", "18/10/1977");
        System.out.println(pac.mostrar());
        pac.enviarFactura();
        System.out.println("");
        

        Proveedor prov = new Proveedor("Lomas Envios", "Pedroso 211", "Ramos Mejia", "2", 100321.3, "A23-221", "4552-2212", 0.25);
        System.out.println(prov.mostrar());
        prov.pagarFactura(65410);
        System.out.println(prov.mostrar());
        System.out.println("");
        
    }
    
}
