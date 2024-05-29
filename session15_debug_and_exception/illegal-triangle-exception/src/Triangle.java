public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a<=0 || b<=0 || c<=0)
            throw new IllegalTriangleException("Side cannot be a negative number");
        if ((a+b)<=c ||(b+c)<=a || (a+c)<=b)
            throw new IllegalTriangleException("Side is not valid");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
