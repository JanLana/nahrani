package cz.gyarab.e2.prg1;

public class HSch {
    public static double hs(double[] a, double x) {
        double b = 0.0;

        for (int i = a.length-1; i >= 0 ; i--) {
            b = a[i] + b * x;
        }

        return b;
    }

    public static void main(String[] args) {
        double[] p1 = { 1, 2, 1, 2, 1 };

        double i = 16;
        System.out.println(i + " = " + hs(p1, i));


/*        for (double i = 0.0; i < 10.0; i += 0.5) {
            System.out.println(i + " = " + hs(p1, i));
        }
*/
    }
}
