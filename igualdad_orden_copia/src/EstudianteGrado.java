public class EstudianteGrado extends Estudiante {
    String carreraGrado;

    public EstudianteGrado(String nombre, int edad, int matricula, String carreraGrado){
        super(nombre, edad, matricula);
        this.carreraGrado = carreraGrado;
    }

    public boolean equals(Object otro) {
        if (!(otro instanceof Estudiante)){return false;}
        Estudiante comparado = (Estudiante) otro;
        if (comparado.matricula != this.matricula){return false;}
        if (otro instanceof EstudiantePosgrado){
            EstudiantePosgrado comparadoP = (EstudiantePosgrado) otro;
            return this.carreraGrado.equals(comparadoP.carreraPosgrado);
        }
        EstudianteGrado comparadoG = (EstudianteGrado) otro;
        return this.carreraGrado.equals(comparadoG.carreraGrado);
    }
}
