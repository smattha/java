/*
 * Radio.java
 *
 * Created on 5 ������� 2007, 11:20 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package advanceTopics.StaticInitDemo;

/*
 * @author Matthaiakis Stergios
 */

public class Radio {
    static {
        System.out.println("Inside static initializer");

    }

    private int station;

    {
        System.out.println("Default initializer");
    }

    public Radio(int x) {
        System.out.println("Constructing a Radio");
        station = x;
    }
}
