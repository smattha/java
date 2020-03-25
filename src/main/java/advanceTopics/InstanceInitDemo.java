/*
 * InstanceInitDemo.java
 *
 * Created on 10 ������� 2007, 7:25 ��
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package advanceTopics;

/**
 * @author MAtthaiakis Stergios
 */
public class InstanceInitDemo {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.println("Inside main");

        CDPlayer c1 = new CDPlayer(1);
        System.out.println("\n\n\n");
        CDPlayer c2 = new CDPlayer(7);
    }
}