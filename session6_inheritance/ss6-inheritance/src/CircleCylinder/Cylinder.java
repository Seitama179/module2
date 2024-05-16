package CircleCylinder;


public class Cylinder extends Circle {
    private double radius;
    private double height;
    public Cylinder() {}
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return (Math.PI * radius * radius * 2 + Math.PI * radius * 2 *height);
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
    public String toString() {
        return "A Cylinder with radius= "
                + getRadius()
                + " and height= "
                + getHeight()
                + " and volume= "
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
