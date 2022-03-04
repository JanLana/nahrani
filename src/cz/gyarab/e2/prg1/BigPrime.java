package cz.gyarab.e2.prg1;

import java.math.BigInteger;

public class BigPrime {
    static BigInteger minusJedna = new BigInteger("-1");

    public static boolean jePrvocislo(BigInteger x) {
        BigInteger y = x.sqrt();

        while (y.compareTo(BigInteger.ONE) != 0) {

            if (x.mod(y).compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
            y = y.add(minusJedna);
        }
        return true;
    }

    public static void main(String[] args) {
        BigInteger x = new BigInteger("1234567890");

        for(;;) {
            x.add(BigInteger.ONE);

            if (jePrvocislo(x)) {
                System.out.println(x);
                return;
            }
        }
    }
}
