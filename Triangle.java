package org.kent.shapes;
import java.util.ArrayList;
import java.util.List;

public class Triangle extends Shape {

    private final double x1, y1, x2, y2, x3, y3; // Coordinates of the (triangle) base, with respect to CM (x,y)
    private final double d12, d23, d31; // The side lengths of the triangle
    private final double s; // Semi-perimeter of the triangle

    public double getS() { return s; }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.d12 = Math.hypot(x2 - x1, y2 - y1);
        this.d23 = Math.hypot(x3 - x2, y3 - y2);
        this.d31 = Math.hypot(x1 - x3, y1 - y3);
        this.s = (d12 + d23 + d31) / 2.0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.z = 0;
    }

    /**
     * Compute the area of a Triangle using the Heron formula.
     * @return the area as a double
     */
    public double getArea() { return Math.sqrt(s * (s - d12) * (s - d23) * (s - d31)); }

    @Override
    public double getVolume() { return 0; }

    @Override
    public List<Point> getVertices() {
        List<Point> result = new ArrayList<> ();
        result.add(new Point(x1, y1, z));
        result.add(new Point(x2, y2, z));
        result.add(new Point(x3, y3, z));
        return result;
    }

}