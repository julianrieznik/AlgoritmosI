package generics;

public class Par<A,B> {
    private A elemento1;
    private B elemento2;

    public Par(A a, B b){
        this.elemento1 = a;
        this.elemento2 = b;


    }

    public A getElemento1() {
        return elemento1;
    }

    public B getElemento2() {
        return elemento2;
    }

    public void setElemento1(A elemento1) {
        this.elemento1 = elemento1;
    }

    public void setElemento2(B elemento2) {
        this.elemento2 = elemento2;
    }

    @Override
    public String toString() {
        String a = String.valueOf(getElemento1());
        String b = String.valueOf(getElemento2());
        return "A: " + a + " B: " + b;
    }

    


}
