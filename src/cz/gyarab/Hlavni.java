package cz.gyarab;

public class Hlavni {
    public static void main(String[] args) throws InterruptedException {
        VelkePole  v = new VelkePole();

        PolePlus1 p1 = new PolePlus1(v);
        PolePlus1 p2 = new PolePlus1(v);

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        System.out.println(v.secti());
    }
}
