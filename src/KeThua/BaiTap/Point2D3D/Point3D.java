package KeThua.BaiTap.Point2D3D;

public class Point3D extends Point2D {
    private float z = 0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float x,float y,float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}' + super.toString();
    }
}
