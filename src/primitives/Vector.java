package primitives;
public class Vector extends Point{
    public Vector(double x, double y, double z) {
        super(x, y, z);
        if(xyz.equals(Double3.ZERO)){
            throw  new IllegalArgumentException("Vector cannot be ZERO");
        }
    }

    public Vector(Double3 double3) {
        this(double3.d1, double3.d2, double3.d3);
    }
public double length(){
        return Math.sqrt(lengthSquared());
}
    public double lengthSquared() {
        double dx= xyz.d1;
        double dy= xyz.d2;
        double dz= xyz.d3;
        return dx*dx+dy*dy+dz*dz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector vector)) return false;
        return xyz.equals(vector.xyz);
    }

    public Vector normalize() {
        double len=length();
        return new Vector((xyz.reduce(len)));
    }
}
