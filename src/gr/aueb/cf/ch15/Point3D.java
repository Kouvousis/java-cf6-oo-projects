package gr.aueb.cf.ch15;

public class Point3D extends Point2D{
    private double z;

    public Point3D() {

    }

    public Point3D(double z) {
        this.z = z;
    }

    public Point3D(int y, double z) {
        super(y);
        this.z = z;
    }

    public Point3D(int x, int y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
