package gr.aueb.cf.ch15;

public class Point2D extends Point{
    private double y;

    public Point2D() {

    }

    public Point2D(int y) {
        this.y = y;
    }

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + y + ")";
    }
}
