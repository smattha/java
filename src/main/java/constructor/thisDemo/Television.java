package constructor.thisDemo;

/**
 * @author Matthaiakis Stergios
 */
class Television {

    int volume;
    int channel;

    Television() {

        this(4, 10);
        System.out.println("--------------------------------------------------------");
        System.out.println("Inside no-arg constructor");
    }

    Television(int c) {
        this(c, 10);
        System.out.println("--------------------------------------------------------");
        System.out.println("Inside one-arg constructor");
    }

    Television(int c, int v) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Inside two-arg constructor");
        channel = c;
        volume = v;
    }
}