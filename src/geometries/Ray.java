package geometries;
import java.util.List;
import java.util.Objects;

import primitives.Point;
import primitives.Vector;
public class Ray {
    private Point p0;
    private Vector dir;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ray ray)) return false;
        return p0.equals(ray.p0) && dir.equals(ray.dir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p0, dir);
    }

    @Override
    public String toString() {
        return "Ray: " +
                "p0=" + p0 +
                ", dir=" + dir;
    }
}
