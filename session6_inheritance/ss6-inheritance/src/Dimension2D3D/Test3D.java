package Dimension2D3D;


import java.util.Arrays;

public class Test3D {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        Point3D point3D2 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(point3D2);
        point3D2.setXYZ(0.0f, 1.0f, 2.0f);
        System.out.println(point3D2);
        float[] a = point3D2.getXY();
        System.out.println(Arrays.toString(a));
        Point2D p1 = new Point3D();
        System.out.println(p1);
    }
}
