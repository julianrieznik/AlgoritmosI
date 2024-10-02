
class NombreInvalidoException extends Exception {

    public NombreInvalidoException(){
        super("Nombre nulo o vacio");   
    }

}

class EdadInvalidaException extends Exception{
    
    public EdadInvalidaException(){
        super("Edad menor a 0 o mayor a 120");
    }
}

class PromedioInvalidoException extends Exception{

    public PromedioInvalidoException(){
        super("Promedio menor a 0.0 o mayor a 10.0");
    }
}
