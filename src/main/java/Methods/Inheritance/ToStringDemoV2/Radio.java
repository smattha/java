/*
 * Radio.java
 *
 * Created on 11 ������� 2007, 8:01 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Inheritance.ToStringDemoV2;

/**
 * @author MAtthaiakis Stergios
 */
public class Radio {
    public int volume;
    public double channel;
    private char band;

    Radio(int v, double c, char b) {
        volume = v;
        channel = c;
        band = b;
    }

    public String toString() {
        System.out.println("--------------------------------------------------------");
        System.out.println("Inside Radio toString");
        String rep = "Radio volume = " + volume + ", channel = " + channel + " and band = " + band;
        return rep;
    }
}