package simples;

public class Vector3D extends Punto{
    private float z;

    public Vector3D(){
        super();
        this.z = 0;
    }

    public Vector3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String coordenadas(){
        return "(" + getX() + "," + getY() + "," + getZ() + ")";

    }

    public static boolean sonIguales(Vector3D v1, Vector3D v2){
        return (v1.getX() == v2.getX() && v1.getY() == v2.getY() && v1.getZ() == v2.getZ());
    }

    public static Vector3D sumarVectores(Vector3D v1, Vector3D v2){
        float x = v1.getX() + v2.getX();
        float y = v1.getY() + v2.getY();
        float z = v1.getZ() + v2.getZ();
        Vector3D v3 = new Vector3D(x, y, z);
        return v3;
    }
}