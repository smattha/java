package Methods.Inheritance.Constructor;

/**
 * @author Matthaiakis Stergios
 */

public class example {


    class Base {

        int x;

        Base(int _x) {
            x = _x;
        }
    }

    class Derived extends Base {
        int y;

        Derived(int _x, int _y) {
            super(_x);
            y = _y;
        }

        void Display() {
            System.out.println("x = " + x + ", y = " + y);
        }
    }

    public void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Inheritance Simple Example");
        System.out.println("--------------------------------------------------------");

        Derived d = new Derived(10, 20);
            d.Display();
        }


}