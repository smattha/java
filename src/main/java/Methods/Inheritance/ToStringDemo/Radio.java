/*
 * Radio.java
 *
 * Created on 11 ������� 2007, 8:01 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Inheritance.ToStringDemo;

/**
 * @author Matthaiakis Stergios
 */

public class Radio {
    private int volume;
    private double channel;
    private char band;

    public Radio(int v, double c, char b) {
        volume = v;
        channel = c;
        band = b;
    }

    public String toString() {
        System.out.println("Inside Radio toString");
        String rep = "Radio volume = " + volume + ", channel = " + channel + " and band = " + band;
        return rep;
    }

    public String toStringSuper() {
        return super.toString();
    }
}