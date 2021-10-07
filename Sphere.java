package org.kent.shapes;
import java.util.ArrayList;
import java.util.List;

public class Sphere extends Shape {

    private final double radius;

    public Sphere(double x, double y, double z, double density, double radius) {
        super (x, y, z, density );
        this.radius = radius;
    }

    public double getArea() { return 4 * Math.PI * radius * radius; }

    @Override
    public double getVolume() { return 4.0 / 3.0 * Math.PI * radius * radius * radius; }

    /**
     * @return an empty ArrayList as a sphere does not have vertices
     */
    @Override
    public List<Point> getVertices() { return new ArrayList<> (); }

}

