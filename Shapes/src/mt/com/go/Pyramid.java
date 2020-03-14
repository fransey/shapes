package mt.com.go;

public class Pyramid extends Shape {

    private double length, width, height;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.round(length * (width / 2.0) * height);
    }
}
