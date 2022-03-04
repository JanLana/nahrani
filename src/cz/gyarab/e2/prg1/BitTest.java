package cz.gyarab.e2.prg1;

public class BitTest {
    public static void main(String[] args) {
        byte x = 125; // 01111101
        byte y = 65;  // 01000001
        //       63      00111100
        int z = x & y;
        System.out.println(x + " & " + y + " = " + z);

        z = x | y;
        System.out.println(x + " | " + y + " = " + z);

        z = x ^ y;
        System.out.println(x + " ^ " + y + " = " + z);
        int k = z ^ y;
        System.out.println(z + " ^ " + y + " = " + k);

        z = ~y;
        System.out.println("  ~ " + y + " = " + z);




    }
}
