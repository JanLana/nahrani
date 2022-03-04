package cz.gyarab;

public class Filozof extends Thread {
    String name;
    Vidlicka leva;
    Vidlicka prava;

    public Filozof(String name, Vidlicka leva, Vidlicka prava) {
        this.name = name;
        this.leva = leva;
        this.prava = prava;
    }

    @Override
    public String toString() {
        return "Filozof{" + name + '}';
    }

    @Override
    public void run() {
        for(;;) {
            System.out.println(this + " chce jist");
            synchronized (leva) {
                System.out.println(this + " si vzal " + leva);
                synchronized (prava) {
                    System.out.println(this + " si vzal " + prava);
                    System.out.println(this + " ji");
                    try {
                        sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(this + " dojedl");
                    System.out.println(this + " odklada " + prava);
                }
                System.out.println(this + " odklada " + leva);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Vidlicka a = new Vidlicka("A");
        Vidlicka b = new Vidlicka("B");
        Vidlicka c = new Vidlicka("C");
        Filozof jan = new Filozof("Jan", a, c);
        Filozof pepa = new Filozof("Pepa", a, b);
        Filozof lojza = new Filozof("Lojza", b, c);

        jan.start();
        sleep(500);
        pepa.start();
        sleep(500);
        lojza.start();
    }
}
