package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.model.PointXYZ;

public class MainPoint {

    public static void main(String[] args) {
        PointXYZ point = new PointXYZ(5, 3, 4);

        System.out.println("Point(x, y, z) = " + point.convertToString());
        System.out.println("The distance of x and y is: " + point.getXYDistance());
        System.out.println("The distance of x and z is: " + point.getXZDistance());
        System.out.println("The distance of y and z is: " + point.getYZDistance());
        System.out.println("The distance of x, y and z is: " + point.getXYZDistance());
    }
}
