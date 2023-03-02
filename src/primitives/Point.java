package primitives;

import java.util.Objects;

/**
 * class representing sD coordinates
 */
public class Point {
    final Double3 xyz;
    public Point(double x, double y, double z) {
        xyz=new Double3(x,y,z);
    }

    Point (Double3 double3){
        this(double3.d1, double3.d2, double3.d3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return xyz.equals(point.xyz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xyz);
    }

    @Override
    public String toString() {
        return "Point: " + xyz;
    }
    public double distanceSquared(Point other){
        double dx= xyz.d1-other.xyz.d1;
        double dy= xyz.d2-other.xyz.d2;
        double dz= xyz.d3-other.xyz.d3;
        return dx*dx+dy*dy+dz*dz;
    }
    public double distance(Point other){
        return Math.sqrt((distanceSquared(other)));
    }

    public Point add(Vector vector) {
        return new Point(xyz.add(vector.xyz));
    }

    public Vector subtract(Point secondPoint) {
        return new Vector(xyz.subtract(secondPoint.xyz));
    }
}
