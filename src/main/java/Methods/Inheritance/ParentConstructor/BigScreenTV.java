package Methods.Inheritance.ParentConstructor;

/**
 * @author Matthaiakis Stergios
 */
class BigScreenTV extends Television {
    private String aspectRatio;
    private short size;

    BigScreenTV(int channel) {
        this("unknown", (short) 40, channel);
        System.out.println("--------------------------------------------------------");
        System.out.println("Inside BigScreenTV(int)");
        System.out.println("--------------------------------------------------------");
    }

    BigScreenTV(String r, short s, int channel) {
        super(channel);

        System.out.println("--------------------------------------------------------");
        System.out.println("Inside BigScreenTV(String, short, int)");
        System.out.println("--------------------------------------------------------");

        aspectRatio = r;
        size = s;

    }

    BigScreenTV(String r, short s, int channel, int volume) {
        super(channel, volume);

        System.out.println("--------------------------------------------------------");
        System.out.println("Inside BigScreenTV(String, short, int, int)");
        System.out.println("--------------------------------------------------------");
        aspectRatio = r;
        size = s;
    }
}