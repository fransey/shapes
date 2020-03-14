package mt.com.go;

public class Sphere extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return Math.round((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
    }
}
\