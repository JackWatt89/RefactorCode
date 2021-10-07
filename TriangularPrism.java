package org.kent.shapes;
import java.util.ArrayList;
import java.util.List;

public class TriangularPrism extends Shape {

    private final double x1, y1, x2, y2, x3, y3; // Coordinates of the (triangle) base, with respect to CM (x,y)
    private final Triangle triangle;// triangle allows access to the attributes of the Triangle class
    private final double height;

    public TriangularPrism(double x, double y, double z, double x1, double y1, double x2, double y2, double x3, double y3, double height) {
        super ();
        this.triangle = new Triangle (x1, y1, x2, y2, x3, y3);
        this.height = height;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getArea() {
        double s = triangle.getS();
        return 2 * (s * height + triangle.getArea ());
    }

    public double getVolume() { return triangle.getArea (); }

    @Override
    public List<Point> getVertices() {
        List<Point> result = new ArrayList<>();
        result.add(new Point(x1 + x, y1 + y, z - height / 2.0));
        result.add(new Point(x2 + x, y2 + y, z - height / 2.0));
        result.add(new Point(x3 + x, y3 + y, z - height / 2.0));
        result.add(new Point(x1 + x, y1 + y, z + height / 2.0));
        result.add(new Point(x2 + x, y2 + y, z + height / 2.0));
        result.add(new Point(x3 + x, y3 + y, z + height / 2.0));
        return result;
    }

}