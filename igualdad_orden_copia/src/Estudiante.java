public class Estudiante {
    String nombre;
    int edad;
    int matricula;

    public Estudiante(String nombre, int edad, int matricula){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    } 
    @Override
    public boolean equals(Object otro) {
        if (!(otro instanceof Estudiante)){return false;}
        Estudiante comparado = (Estudiante) otro; //Downcasting seguro
        if (this.matricula == comparado.matricula){return true;}
        return false;
    }

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Pe", 23, 1);
        Estudiante e2 = new Estudiante("Pe", 23, 1);
        Estudiante e3 = new Estudiante("Pe", 23, 2);

        EstudianteGrado g1 = new EstudianteGrado("Pll", 23, 2, "Leo");
        EstudianteGrado g2 = new EstudianteGrado("Pll", 23, 2, "Leo");
        EstudianteGrado g3 = new EstudianteGrado("Pll", 23, 1, "Leo");
        EstudianteGrado g4 = new EstudianteGrado("Pll", 23, 2, "Le");

        EstudiantePosgrado pg1 = new EstudiantePosgrado("P", 33, 3, "Leo");
        EstudiantePosgrado pg2 = new EstudiantePosgrado("P", 33, 2, "Leo");
        EstudiantePosgrado pg3 = new EstudiantePosgrado("P", 33, 3, "Leo");

        System.out.println(e1.equals(e2)); // true
        System.out.println(e1.equals(e3)); // false
        System.out.println(g1.equals(g2)); // true
        System.out.println(g1.equals(g3)); // false
        System.out.println(g1.equals(g4)); // false
        System.out.println(pg1.equals(pg2)); // false
        System.out.println(pg2.equals(g2)); // true
        System.out.println(pg1.equals(pg3)); // true


    }
}
