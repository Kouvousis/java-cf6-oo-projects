package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {

    }

    public Point(int x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getDistanceFromOrigin() {
        return x;
    }

    @Override
    public String toString() {
        return "(" + x + ")";
    }
}
