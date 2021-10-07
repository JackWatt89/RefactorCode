package org.kent.shapes;
import java.util.ArrayList;
import java.util.List;

public class Cuboid extends Shape {

    private final double sizeX, sizeY, sizeZ;

    public Cuboid(double x, double y, double z, double density, double sizeX, double sizeY, double sizeZ) {
        super (x, y, z, density);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
    }

    public double getArea() { return 2 * (sizeX * sizeY + sizeY * sizeZ + sizeZ * sizeX); }

    @Override
    public double getVolume() { return sizeX * sizeY * sizeZ; }

    @Override
    public List<Point> getVertices() {
        List<Point> result = new ArrayList<>();
        result.add(new Point(x - sizeX / 2, y - sizeY / 2, z - sizeZ / 2));
        result.add(new Point(x - sizeX / 2, y - sizeY / 2, z + sizeZ / 2));
        result.add(new Point(x - sizeX / 2, y + sizeY / 2, z - sizeZ / 2));
        result.add(new Point(x - sizeX / 2, y + sizeY / 2, z + sizeZ / 2));
        result.add(new Point(x + sizeX / 2, y - sizeY / 2, z - sizeZ / 2));
        result.add(new Point(x + sizeX / 2, y - sizeY / 2, z + sizeZ / 2));
        result.add(new Point(x + sizeX / 2, y + sizeY / 2, z - sizeZ / 2));
        result.add(new Point(x + sizeX / 2, y + sizeY / 2, z + sizeZ / 2));
        return result;
    }

}