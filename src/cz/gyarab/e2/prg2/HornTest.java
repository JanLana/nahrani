package cz.gyarab.e2.prg2;

public class HornTest {
    public static double hs(double x, double[] a) {
        double b = 0.0;

        for (int i = a.length-1; i >= 0; i--) {
            b = a[i] + b*x;
        }

        return b;
    }

    public static void main(String[] args) {
        //double[] p = { -10.0, -5.0, 10.0, 3.0, 1 };
        //double[] p = { 1, 1, 1.0/2.0, 1.0/6.0, 1.0/24.0, 1.0/120.0 };
        double[] p = { 1, 2, 1, 2, 1 };

        System.out.println(hs(3, p));  // -10

    }
}
