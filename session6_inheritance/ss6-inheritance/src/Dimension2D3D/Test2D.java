package Dimension2D3D;

public class Test2D {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        Point2D point2D2 = new Point2D(1.0f, 2.0f);
        System.out.println(point2D2);
        point2D2.setX(3.0f);
        System.out.println(point2D2);
    }
}
