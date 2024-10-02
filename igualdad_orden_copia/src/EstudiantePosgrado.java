public class EstudiantePosgrado extends Estudiante {
    String carreraPosgrado;

    public EstudiantePosgrado(String nombre, int edad, int matricula, String carreraPosgrado){
        super(nombre, edad, matricula);
        this.carreraPosgrado = carreraPosgrado;
    }
    @Override
    public boolean equals(Object otro) {
        if (!(otro instanceof Estudiante)){return false;}
        Estudiante comparado = (Estudiante) otro;
        if (comparado.matricula != this.matricula){return false;}
        if (otro instanceof EstudiantePosgrado){
            EstudiantePosgrado comparadoP = (EstudiantePosgrado) otro;
            return this.carreraPosgrado.equals(comparadoP.carreraPosgrado);
        }
        EstudianteGrado comparadoG = (EstudianteGrado) otro;
        return this.carreraPosgrado.equals(comparadoG.carreraGrado);
    }
}
