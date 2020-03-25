/*
 * Television.java
 *
 * Created on 3 ��������� 2007, 1:31 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Methods.Objects.extendsClass;

/**
 * @author Matthaiakis Stergios
 */
public class Television {
    public int channel, volume;

    public Television() {
        this(4, 5);
        System.out.println("Inside Television()");
    }

    public Television(int c, int v) {
        System.out.println("Inside Television(int, int)");
        channel = c;
        volume = v;
    }
}