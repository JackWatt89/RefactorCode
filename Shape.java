package org.kent.shapes;
import java.util.List;

public abstract class Shape {

    protected double x, y, z; // Coordinates of the center
    protected double density;

    public Shape(double x, double y, double z, double density) {
        this.density = density;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Shape() {}

    public abstract double getVolume();

    public abstract List<Point> getVertices();

    public double getX () { return x; }

    public double getY () { return y; }

    public double getZ () { return z; }

    public double getMass () { return density * getVolume (); }

    public Point getCenterOfMass () { return new Point ( x, y, z ); }

}